/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.IsiData.IsiDataProduksiBenih;
import java.sql.SQLException;

/**
 *
 * @author hisyam
 */
public interface BenihController {
    public void Simpan(IsiDataProduksiBenih benih) throws SQLException; 
    public void Hapus(IsiDataProduksiBenih benih) throws SQLException;
    public void Clear(IsiDataProduksiBenih benih) throws SQLException;
    public void Tampil(IsiDataProduksiBenih benih) throws SQLException;    
}
