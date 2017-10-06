/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author p1511075
 */
public class SqliteConnection {

    private static Connection maConection;
    private static String nomBase;
    
    public SqliteConnection(String nomBase) {
       maConection=null;
        this.nomBase=nomBase;
    }

    public Connection getConnection() {
        return maConection;
    }

    public static Connection getInstance() {
        if (maConection == null) {
            try {
                Class.forName("org.sqlite.JDBC").newInstance();
                 maConection = DriverManager.getConnection("jdbc:sqlite:" + nomBase + ".sqlite");
            } catch (Exception ex) {
                maConection = null;
            }
           
        }
        return maConection;
    }
}

