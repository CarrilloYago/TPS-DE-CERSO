/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;

/**
 *
 * @author yagoc
 */
public class DBConnection {

    private static Connection connection = null;
    private static final String url = "jdbc:mysql://localhost:3306/customers";
    private static final String user = "root";
    private static final String password = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";


    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = java.sql.DriverManager.getConnection(url, user, password);
            System.out.println("successful connection");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}