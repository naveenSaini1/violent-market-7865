package allbeenclasses;

public class EngenersBeen {
	private int eid;
	private String engNaame;
	private String password;
	private String role;
	public EngenersBeen(int eid, String engNaame, String password, String role) {
		this.eid = eid;
		this.engNaame = engNaame;
		this.password = password;
		this.role = role;
	}
	public EngenersBeen(String engNaame, String password, String role) {
		this.engNaame = engNaame;
		this.password = password;
		this.role = role;
	}
	public EngenersBeen() {
		
	}
	public int getRoll() {
		return eid;
	}
	public void setRoll(int roll) {
		this.eid = roll;
	}
	public String getEngNaame() {
		return engNaame;
	}
	public void setEngNaame(String engNaame) {
		this.engNaame = engNaame;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
