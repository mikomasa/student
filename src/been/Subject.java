package been;
import java.io.Serializable;


public class Subject implements Serializable{

	private String	ScoolCd;
	private String Cd;
	private String Name;
	public String getScoolCd() {
		return ScoolCd;
	}
	public void setScoolCd(String scoolCd) {
		ScoolCd = scoolCd;
	}
	public String getCd() {
		return Cd;
	}
	public void setCd(String cd) {
		Cd = cd;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
