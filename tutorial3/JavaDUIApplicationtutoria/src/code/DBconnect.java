
package code;

import java.sql.*;
import javax.swing.*;
public class DBconnect {
      Connection conn =null;
    public static Connection ConnecDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/studenttext","root","kalharamax");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
    
}
