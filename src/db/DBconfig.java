package db;

public class DBconfig {
	private static final String URL = "jdbc:mysql://localhost:3306/quanlythanhvien";
	private static final String USERNAME = "root";
	private static final String PASS ="phungvansyhb";
	public static String getUrl() {
		return URL;
	}
	public static String getUsername() {
		return USERNAME;
	}
	public static String getPass() {
		return PASS;
	}
	
}
