/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOdutacoding;
import DAOInterface.dutaInterface;
import Koneksi.DB;
import Model.dutaModel;
import View.register;
import javax.swing.JOptionPane;

/**
 *
 * @author Liore
 */
public final class registerCtr {
    
    register form;
    dutaInterface interf;
    
    public registerCtr(register form) {
        this.form = form;
        interf = new DAOdutacoding() {
            @Override
            public void delete(int nik) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
    }

    public void resetForm() {
        form.getnik().setText("");
        form.getnama().setText("");
        form.getalamat().setText("");
        form.getalasan().setText("");
    }

    public void insert() {
        if (!form.getnik().getText().trim().isEmpty() || !form.getnama().getText().trim().isEmpty() ) {
            dutaModel user = new dutaModel();
            user.setNik(form.getnik().getText());
            user.setNama(form.getnama().getText());
            user.setJk(form.getjk().getSelectedItem().toString());
            user.setAlamat(form.getalamat().getText());
            user.setAlasan(form.getalasan().getText());
            interf.insert(user);
            JOptionPane.showMessageDialog(null, "Register Success");
            resetForm();
        }else{
            JOptionPane.showMessageDialog(null, "Failed Success");
        }
    }
}
