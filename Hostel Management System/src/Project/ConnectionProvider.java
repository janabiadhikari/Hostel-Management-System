package Project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;

/**
 *
 * @author janabiadhikari
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
try
{
Class.forName ("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","root12345");
return con;
}
catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(null, e);
    return null;
}
    }
    
}
