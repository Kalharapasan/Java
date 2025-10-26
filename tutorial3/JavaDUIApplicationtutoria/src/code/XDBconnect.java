
package code;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class XDBconnect {
    public static Connection connect(){
        
        Connection conn= null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javatext","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return  conn;
        
    }
}
   //