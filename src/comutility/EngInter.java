package comutility;

import java.util.List;

import allbeenclasses.ProblemsBeen;

public interface EngInter {
	public String engLogin(String username,String password);
	public List<ProblemsBeen> getProblemAssignmed();
	
	public List<ProblemsBeen> getAllProblems();
	public String engChangPassword(int eid);
	
	

}
