package allbeenclasses;

public class EmployeeBeen {
	private int empId;
	private String empName;
	private String empUserEmail;
	private String empPassword;
	public EmployeeBeen(int empId, String empName, String empUserEmail, String empPassword) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empUserEmail = empUserEmail;
		this.empPassword = empPassword;
	}
	public EmployeeBeen(String empName, String empUserEmail, String empPassword) {
		this.empName = empName;
		this.empUserEmail = empUserEmail;
		this.empPassword = empPassword;
	}
	public EmployeeBeen() {
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpUserEmail() {
		return empUserEmail;
	}
	public void setEmpUserEmail(String empUserEmail) {
		this.empUserEmail = empUserEmail;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	
	
	

}
