package been;

import java.io.Serializable;

public class Teacher implements Serializable {
	private String StudentNo;
	private String SubjectCd;
	private String SchoolCd;
	private Integer No;
	public String getStudentNo() {
		return StudentNo;
	}
	public void setStudentNo(String studentNo) {
		StudentNo = studentNo;
	}
	public String getSubjectCd() {
		return SubjectCd;
	}
	public void setSubjectCd(String subjectCd) {
		SubjectCd = subjectCd;
	}
	public String getSchoolCd() {
		return SchoolCd;
	}
	public void setSchoolCd(String schoolCd) {
		SchoolCd = schoolCd;
	}
	public Integer getNo() {
		return No;
	}
	public void setNo(Integer no) {
		No = no;
	}
	public Integer getPoint() {
		return Point;
	}
	public void setPoint(Integer point) {
		Point = point;
	}
	public String getClassNum() {
		return ClassNum;
	}
	public void setClassNum(String classNum) {
		ClassNum = classNum;
	}
	private Integer Point;
	private String ClassNum;

}