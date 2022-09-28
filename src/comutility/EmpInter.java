package comutility;

import allbeenclasses.EmployeeBeen;
import allbeenclasses.ProblemsBeen;

public interface EmpInter {
	public String empLogin(String userName,String password);
	public String empRagister(EmployeeBeen emp);
	public String registerComplain(ProblemsBeen pb);
	public ProblemsBeen getComplain(int cid);
	
	public String changePassword(int empId);
	

}
