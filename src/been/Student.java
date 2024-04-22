package been;
import java.io.Serializable;

public class Student implements Serializable{
	private String No;
	private String Name;
	private Integer EntYear;
	private String ClassNume;
	private boolean IsAttend;
	public String getNo() {
		return No;
	}
	public void setNo(String no) {
		No = no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getEntYear() {
		return EntYear;
	}
	public void setEntYear(Integer entYear) {
		EntYear = entYear;
	}
	public String getClassNume() {
		return ClassNume;
	}
	public void setClassNume(String classNume) {
		ClassNume = classNume;
	}
	public boolean isIsAttend() {
		return IsAttend;
	}
	public void setIsAttend(boolean isAttend) {
		IsAttend = isAttend;
	}
	public String getSchoolCd() {
		return SchoolCd;
	}
	public void setSchoolCd(String schoolCd) {
		SchoolCd = schoolCd;
	}
	private String SchoolCd;

}
