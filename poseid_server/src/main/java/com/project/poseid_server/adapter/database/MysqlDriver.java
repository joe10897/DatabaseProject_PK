package com.project.poseid_server.adapter.database;

import java.sql.*;

public class MysqlDriver {
    private String mysqlURL;
    private String user;
    private String password;

    public MysqlDriver() {
        this.mysqlURL = "jdbc:mysql://localhost:3306/poseid?user=root&password=Asdf2460";
        this.user = "root";
        this.password = "Asdf2460"; // Asdf2460
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