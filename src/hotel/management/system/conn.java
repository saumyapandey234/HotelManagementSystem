package hotel.management.system;
import java.sql.*;


public class conn {
    Connection c;
    Statement s;
    conn(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root","12345");
        s=c.createStatement();
        
    }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
