package com.namanpatel;

import java.sql.*;

public class Foo {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/sample";

    //Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;

        try {
            //step 2 - Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step 3 - Open a connection
            System.out.println("Connecting to the database *****");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //step 4 - Execute a query
            System.out.println("Creating statement ...... ");
            stmt = conn.createStatement();
            String sql;

            sql = "SELECT id, first, last, age FROM employee";
            ResultSet rs = stmt.executeQuery(sql);

            //step 5 - extract data from result set
            while (rs.next()) {
                //retrieving by column name
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                //Display values
                System.out.println("ID: " + id + ", Age: " + age + ", First: " + first + ", Last: " + last);

            }
            rs.close();
//            stmt.close();
//            conn.close();
        } catch (SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
        conn.close();
        stmt.close();

    }
}

