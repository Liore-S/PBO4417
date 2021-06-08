/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi.DB;
import Model.dutaModel;
import View.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Liore
 */
public class DAOdutacoding {
    public static String insert = "INSERT INTO users (nik,nama,jk,alamat,alasan) VALUES (?,null,null,null,null);";
    public static String update = "UPDATE users SET nik=?,nama=?,jk=?,alamat=?,alasan=? WHERE nik=?;";
    public static String delete = "DELETE FROM users WHERE nik=?;";
    public static String select = "SELECT * FROM users WHERE nik=?;";
    public static String searchNik = "SELECT * FROM users WHERE nik like ?;";
//    public static String loginAdmin = "SELECT * FROM users WHERE nik=? and password=?;";
    
    public DAOdutacoding(){
        Connection connection = DB.connect();
    }
    
    public void insert(dutaModel user) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(insert);
            stmt.setString(1, user.getNik());
            stmt.setString(2, user.getNama());
            stmt.setString(3, user.getJk());
            stmt.setString(4, user.getAlamat());
            stmt.setString(5, user.getAlasan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    
    public void update(dutaModel user) {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement(update);
            stmt.setString(1, user.getNik());
            stmt.setString(2, user.getNama());
            stmt.setString(3, user.getJk());
            stmt.setString(4, user.getAlamat());
            stmt.setString(5, user.getAlasan());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<dutaModel> getAll() {
        List<dutaModel> listUser = null;
        try {
            listUser = new ArrayList<dutaModel>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                dutaModel user = new dutaModel();
                user.setNik(rs.getString("nik"));
                user.setNama(rs.getString("nama"));
                user.setJk(rs.getString("jk"));
                user.setAlamat(rs.getString("alamat"));
                user.setAlasan(rs.getString("alasan"));
                listUser.add(user);
            }
        } catch (SQLException e) {
            Logger.getLogger(DAOdutacoding.class.getName()).log(Level.SEVERE, null, e);
        }
        return listUser;
    }

    public List<dutaModel> searchByName(String nama) {
        List<dutaModel> listUser = null;
        try {
            listUser = new ArrayList<dutaModel>();
            PreparedStatement st = connection.prepareStatement(DAOdutacoding.searchNik);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                dutaModel user = new dutaModel();
                user.setNik(rs.getString("nik"));
                user.setNama(rs.getString("nama"));
                user.setJk(rs.getString("jk"));
                user.setAlamat(rs.getString("alamat"));
                user.setAlasan(rs.getString("alasan"));
                listUser.add(user);
            }
        } catch (SQLException e) {
            Logger.getLogger(DAOdutacoding.class.getName()).log(Level.SEVERE, null, e);
        }
        return listUser;
    }

}
