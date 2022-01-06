package com.project.poseid_service.adapter.database;

import java.sql.*;

public class MysqlDriver {
    private String mysqlURL;
    private String user;
    private String password;

    public MysqlDriver() {
        this.mysqlURL = "";
        this.user = "root";
        this.password = "admin";
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.mysqlURL,this.user,this.password);
    }

    public void closeConnection(Connection connection) {
        if (connection == null) return;
        try {
            connection.close();
        } catch (SQLException e) {
            /* No connection */
        }
    }

}