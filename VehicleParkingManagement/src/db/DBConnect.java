package db;

import java.sql.*;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class DBConnect {
    public static Connection c;
    public static Statement st;
    public static PreparedStatement GetValues_1,GetValues_2,VehicleDetails,DeleteDetails,RecieptDetails,EditValues_1,EditValues_2,EditValues_3,EditValues_4;

    static{
        try{
            
        Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/parking_db","root","gail2790");
            st = c.createStatement();
           GetValues_1= c.prepareStatement("select * from cost_per_hour");
           GetValues_2= c.prepareStatement("select * from avail_info");
           VehicleDetails= c.prepareStatement("insert into vehicle_details values (?,?,?,?,?)");
           DeleteDetails = c.prepareStatement("delete from  vehicle_details where vehicle_no = ?");
           RecieptDetails = c.prepareStatement("select * from vehicle_details where vehicle_no = ?");
           EditValues_1 = c.prepareStatement("truncate table avail_info");
           EditValues_2 = c.prepareStatement("insert into avail_info values (?,?,?)");
           EditValues_3 = c.prepareStatement("truncate table cost_per_hour");
           EditValues_4 = c.prepareStatement("insert into cost_per_hour values (?,?,?)");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Invalid Credentials !");
        }
        }
    static public void dbClose(){
         try{
            c.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    }
