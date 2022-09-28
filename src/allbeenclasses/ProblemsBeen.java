package allbeenclasses;

public class ProblemsBeen {
	private int pid;
	private String role;
	private String status;
	private String engSetName=null;
	public ProblemsBeen(int pid, String role, String status,String engSetName) {
		this.pid = pid;
		this.role = role;
		this.status = status;
		this.engSetName=engSetName;
	}
	public ProblemsBeen(String role, String status) {
		this.role = role;
		this.status = status;
	}
	public ProblemsBeen() {

	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEngSetName() {
		return engSetName;
	}
	public void setEngSetName(String engSetName) {
		this.engSetName = engSetName;
	}


}
