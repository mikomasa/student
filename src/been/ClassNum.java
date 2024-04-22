package been;
import java.io.Serializable;

public class ClassNum implements Serializable{
	private String SchoolCd;
	private String ClassNum;
	public String getSchoolCd() {
		return SchoolCd;
	}
	public void setSchoolCd(String schoolCd) {
		SchoolCd = schoolCd;
	}
	public String getClassNum() {
		return ClassNum;
	}
	public void setClassNum(String classNum) {
		ClassNum = classNum;
	}

}
