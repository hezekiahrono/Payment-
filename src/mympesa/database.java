/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mympesa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author hrono
 */
public class database {
    
     private Connection conn;
      public Connection openConnection()
    {
        if (conn == null){
            String url = "jdbc:mysql://localhost:3306/paymentsystem?zeroDateTimeBehaviour=convertToNull[root on Default schema]";
            String dbName = "tracom academy";
                    
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "";
            try{
                Class.forName(driver);
                this.conn = (Connection) DriverManager.getConnection( url + dbName,userName,password);
                System.out.println("Connection successful");
            }
            catch
        (Exception e){
            System.out.println(e);
            }
        }
        return conn;
    }
    
}
