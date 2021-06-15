/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOdutacoding;
import DAOInterface.dutaInterface;
import Model.TabledutaModel;
import Model.dutaModel;
import View.adminDashboard;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Liore
 */
public class adminCtr {
    adminDashboard form;
    dutaInterface interf;
    List<dutaModel> list;
    
    public adminCtr (adminDashboard form){
        this.form = form;
        interf = new DAOdutacoding() {
            @Override
            public void delete(int nik) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        list = interf.getAll();
    }
    
    public void show(){
        list = interf.getAll();
        TabledutaModel Tu = new TabledutaModel(list) {
            @Override
            public int getRowCount() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        form.getTableDuta().setModel(Tu);
    }
    
    public void update(){
        if(!form.getNik().getText().trim().isEmpty()){
            dutaModel user = new dutaModel();
            user.setNama(form.getNama().getText());
            user.setJk(form.getJk().getText());
            user.setAlamat(form.getAlamat().getText());
            user.setAlasan(form.getAlasan().getText());
            user.setNik((form.getNik().getText()));
            interf.update(user);
            JOptionPane.showMessageDialog(null, "Update Success");
            reset();
        }else{
            JOptionPane.showMessageDialog(null, "Update Failed");
        }   
    }

    public void delete() {
        if (!form.getNik().getText().trim().isEmpty()) {
            int nik = Integer.parseInt(form.getNik().getText());
            interf.delete(nik);
            JOptionPane.showMessageDialog(null, "Delete Data  Success");
            reset();
        }
    }

    public void updatedata(int Row) {
        form.getNik().setText(list.get(Row).getNik());
        form.getNama().setText(list.get(Row).getNama());
        form.getJk().setText(list.get(Row).getJk());
        form.getAlamat().setText(list.get(Row).getAlamat());
        form.getAlasan().setText(list.get(Row).getAlasan());
    }

    private void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
