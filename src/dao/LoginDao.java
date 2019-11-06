package dao;

public class LoginDao {
	public static boolean validInput(String name , String pass) {
		if (name.equals("admin")&& pass.equals("123")) {
			return true;
		}
		
		
		return false;
	}
}
