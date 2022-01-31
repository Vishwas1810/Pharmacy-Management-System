package projectFiles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Connections {
    
    static Connection con;
    
    public static Connection Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Pharmacy_Management", "root", "");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
        }
        
        if(con != null)
            return con;
        else
            return null;
    }
}