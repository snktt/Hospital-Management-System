/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;

/**
 *
 * @author _S_N_K_T_
 */
public class connectionProvider {
    public static Connection getCon(){
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false","root","Sanket@123");
        return con;
    }
    catch(Exception e){
    return null;
    }
  
    }
}