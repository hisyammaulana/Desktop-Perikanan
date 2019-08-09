/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import View.IsiDataKolam;
import View.IsiData.IsiDataProduksiTambak;
import java.sql.SQLException;

/**
 *
 * @author hisyam
 */
public interface TambakController {
    public void Simpan(IsiDataProduksiTambak tambak) throws SQLException;
    public void Hapus(IsiDataProduksiTambak tambak) throws SQLException;
    public void Tampil(IsiDataProduksiTambak tambak) throws SQLException;
    public void Clear(IsiDataProduksiTambak tambak) throws SQLException;
}
