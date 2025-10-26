package tutorial4;
import java.sql.*;
import javax.swing.*;
public class ConnectDB {
    Connection conn=null;
    public static Connection ConnectDb(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:E:tutorial4.db");
            //JOptionPane.showMessageDialog(null,"Connection Ok !");
            return  conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
             return  null;
        }
    
    }
}

 
    

