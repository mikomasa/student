package been;

import java.io.Serializable;

public class School implements Serializable {
	private String Cd;
	private String Name;
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