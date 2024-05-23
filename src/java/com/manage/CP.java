/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

    static Connection con;

    public static Connection createC() {
        try {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create the connection..
            String user = "root";
            String password = "root123";
            String url = "jdbc:mysql://localhost:3306/product_manage_sys";
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static boolean testConnection() {
        boolean isConnected = false;
        try {
            if (con != null && !con.isClosed()) {
                isConnected = true;
                System.out.println("Database connection is open.");
            } else {
                System.out.println("Database connection is closed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isConnected;
    }
}
