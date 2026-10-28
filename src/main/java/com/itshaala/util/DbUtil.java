package com.itshaala.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
    private static Connection connection = null;
    private static String username;
    private static String password;
    private static String url;
    private static String driver;


    static{
        File file = new File("C:\\Users\\Owner\\IdeaProjects\\Advanced Java\\servlet-003\\src\\main\\resources\\application.properties");

        FileInputStream fis  = null;

        try {

            fis = new FileInputStream(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Properties prop = new Properties();
        try {

            prop.load(fis);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        username = prop.getProperty("db.username");
        password = prop.getProperty("db.password");
        url = prop.getProperty("db.url");
        driver = prop.getProperty("db.driver");


        try {

            Class.forName(driver);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection(){
        if(connection == null){
            try {

                connection = DriverManager.getConnection(url,username,password);

            } catch (SQLException e) {

            }
        }
        return connection;
    }



}
