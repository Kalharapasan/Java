package ConnectDB;

import java.sql.*;
import javax.swing.*;

public class DBConnect {
    Connection conn= null;
    
    public static Connection connect(){
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\Software_Project\\JAVA\\BASICS\\Java_Sqlit_Connect\\sqlitText.db");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
        return null;
        
    }
}
