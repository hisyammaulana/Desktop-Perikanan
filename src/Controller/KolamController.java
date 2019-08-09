/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.IsiData.IsiDataKolam;
import View.Table.TableAllKecamatanViewByBulanKolam;
import java.sql.SQLException;

/**
 *
 * @author hisyam
 */
public interface KolamController {
    public void Simpan(IsiDataKolam idk) throws SQLException;
    public void Tampil(TableAllKecamatanViewByBulanKolam kolam) throws SQLException;
    public void Hapus(IsiDataKolam idk) throws SQLException; 
    public void Clear(IsiDataKolam idk) throws SQLException;

}
