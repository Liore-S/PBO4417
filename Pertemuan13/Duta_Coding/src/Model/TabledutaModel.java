/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Liore
 */
public abstract class TabledutaModel extends AbstractTableModel{
    
    List<dutaModel> listUser;
    
    public TabledutaModel(List<dutaModel> listUser){
        this.listUser = listUser;
    }
    
    public int getRowCount(List<dutaModel> listUser) {
        return this.listUser.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 5; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int row, int col) {
       switch (col){
            case 0:
                return listUser.get(row).getNik();
            case 1:
                return listUser.get(row).getNama();
            case 2:
                return listUser.get(row).getJk();
            case 3:
                return listUser.get(row).getAlamat();
            case 4:
                return listUser.get(row).getAlasan();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int col) {
        switch (col){
            case 0:
                return "Nik";
            case 1:
                return "Nama";
            case 2:
                return "Jenis Kelamin";
            case 3:
                return "Alamat";
            case 4:
                return "Alasan";
            default:
                return null;
        }
    }

}
