package online.examination;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class connect {
   Connection con = null;
   public static Connection dbConnect(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "raja257?");
           return con;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
   }
   public static void main(String[] args) {
    }
}
