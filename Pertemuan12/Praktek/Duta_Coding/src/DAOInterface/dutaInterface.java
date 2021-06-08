/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import Model.dutaModel;
import java.util.List;

/**
 *
 * @author Liore
 */
public interface dutaInterface {
    public void insert(dutaModel nik);
    public void update(dutaModel nik);
    public void delete(int nik);
    public List<dutaModel> getAll();
    public List<dutaModel> searchByName(String nama);
}
