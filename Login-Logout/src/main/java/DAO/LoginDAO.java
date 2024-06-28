/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Bean.Loginbean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DBConnection;

/**
 *
 * @author yagoc
 */
public class LoginDAO {

    public String authenticateUser(Loginbean loginBean) {
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();

        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String userRole = null;

        try {
            con = DBConnection.getConnection();
            if (con != null) {
                String sqlQuery = "SELECT rol FROM users WHERE username = ? AND password = ?";
                preparedStatement = con.prepareStatement(sqlQuery);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    userRole = resultSet.getString("rol");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userRole;
    }

}
