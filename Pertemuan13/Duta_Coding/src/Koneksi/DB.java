/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Liore
 */
public class DB {
    static Connection connect;
    public static Connection connection(){
        if(connect == null){
            MysqlDataSource db = new MysqlDataSource();
            db.setDatabaseName("db_dutacoding");
            db.setUser("root");
            db.setPassword("");
             try {
                connect = db.getConnection();
                 System.out.println("Connected");
            } catch (SQLException e) {
                System.out.println("Error Connection : ");
            }
        }
        return connect;
    }
}