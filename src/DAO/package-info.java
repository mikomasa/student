package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Board;

public class BoardDAO extends DAO {

    public List<Board> selectAll() throws Exception {
        List<Board> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM BOARD");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Board boad = new Board();
            boad.setBoardId(rs.getString("board_id"));
            boad.setBoardTitle(rs.getString("board_title"));
            boad.setBoardPlace(rs.getString("board_place"));
            boad.setBoardDay(rs.getTimestamp("board_day"));
            boad.setBoardSport(rs.getString("board_sport"));
            boad.setMessage(rs.getString("message"));
            boad.setUserId(rs.getString("user_id"));
            boad.setAgeGroup(rs.getInt("age_group"));
            boad.setLevel(rs.getInt("level"));
            boad.setNumber(rs.getInt("number"));

            list.add(boad);
        }
        return list;
    }

    public int insert(Board board) throws Exception {
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO BOARD (board_id, board_title, board_place, board_day, board_sport, message, user_id, age_group, level, number) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        st.setString(1, board.getBoardId());
        st.setString(2, board.getBoardTitle());
        st.setString(3, board.getBoardPlace());
        st.setTimestamp(4,board.getBoardDay());
        st.setString(5, board.getBoardSport());
        st.setString(6, board.getMessage());
        st.setString(7, board.getUserId());
        st.setInt(8, board.getAgeGroup());
        st.setInt(9, board.getLevel());
        st.setInt(10, board.getNumber());

        int line = st.executeUpdate();
        st.close();
        con.close();

        return line;
    }
}
