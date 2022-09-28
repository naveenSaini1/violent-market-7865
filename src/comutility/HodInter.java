package comutility;

import java.util.List;

import allbeenclasses.EngenersBeen;

public interface HodInter {
	public String hodLogin(EngenersBeen eng);
	public String hodRagisterEng(String username,String password);
	public List<EngenersBeen> getDetailsengs();
	public String deleteEng(int eid);
	
	

}
