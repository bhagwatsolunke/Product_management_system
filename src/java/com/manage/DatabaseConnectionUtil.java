package com.manage;

import java.sql.Connection;
import java.sql.DriverManager;


class DatabaseConnectionUtil{
    public static void main(String[] args) {
    Connection connection = CP.createC();
    boolean isConnected = CP.testConnection();

    
    if (isConnected) {
        
    } else {
       
    }
}
}


