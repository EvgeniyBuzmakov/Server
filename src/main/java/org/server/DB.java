package org.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class DB {

    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "messages_db";
    private final String LOGIN = "mysql";
    private final String PASS = "mysql";

    private Connection dbConn = null;

    private Connection getDbConnection() throws ClassNotFoundException, SQLException {

        String connStr = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME;
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConn = DriverManager.getConnection(connStr, LOGIN, PASS);
        return dbConn;
    }

    public void isConnected() throws SQLException, ClassNotFoundException {
        dbConn = getDbConnection();
        System.out.println(dbConn.isValid(1000));
    }

    public void insertArticle(String time, String text) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO `messages` (time, text) VALUES (?, ?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(sql);
        prSt.setString(1, time);
        prSt.setString(2, text);

        prSt.executeUpdate();

    }
}