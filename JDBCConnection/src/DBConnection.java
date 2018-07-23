import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	
	public static void main(String[] args) {
		
	
	try {
	
	String host = "http://localhost/phpmyadmin/sql.php?server=1&db=stg_subscription";
	String Uname = "";
	String PWord = "";
			
	Connection con = DriverManager.getConnection(host, Uname, PWord);
	}catch(SQLException err){
		System.out.println(err.getMessage());
	}
}
}