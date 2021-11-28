import java.util.HashMap;

public class IDandPasswords {
	HashMap<String,String> logininfo;
	public HashMap<String, String> getLogininfo() {
		return logininfo;
	}
	public void setLogininfo(HashMap<String, String> logininfo) {
		this.logininfo = logininfo;
	}

	HashMap<String,String> logsign = new  HashMap<String,String>();


	public void IDandPasswords(String userId,String password){
		logininfo=new HashMap<String,String>();
		logininfo.put(userId, password);
	}

}
	
		
	
	
	
	
	

