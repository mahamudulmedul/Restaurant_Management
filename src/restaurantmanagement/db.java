/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmanagement;

import Model.Registration;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Medul
 */
public class db {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public static Connection java_db() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:F:\\Programming\\Java\\RestaurantManagement\\Inventory.sqlite");
            JOptionPane.showMessageDialog(null, "Connected");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
