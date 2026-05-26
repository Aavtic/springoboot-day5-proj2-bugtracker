package com.day5proj2.utils;

import java.sql.Connection;

public class DBUtil {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = java.sql.DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/issue_tracker", "aadish", "qwerty"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
