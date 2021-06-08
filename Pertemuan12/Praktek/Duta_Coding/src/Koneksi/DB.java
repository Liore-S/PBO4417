/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import DAOInterface.dutaInterface;
import Model.dutaModel;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Liore
 */
public class DB implements dutaInterface {
    static Connection connect;
    public static Connection connect(){
        if(connect == null){
            MysqlDataSource db = new MysqlDataSource();
            db.setDatabaseName("db_dutacoding");
            db.setUser("root");
            db.setPassword("");
             try {
                connect = db.getConnection();
            } catch (SQLException e) {
                System.out.println("Error Connection : "+e.getMessage());
            }
        }
        return connect;
    }

    public DB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(dutaModel nik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(dutaModel nik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int nik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<dutaModel> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<dutaModel> searchByName(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
