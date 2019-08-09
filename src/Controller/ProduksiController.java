/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.IsiData.IsiDataProduksi;
import View.Table.TableAllKecamatanViewByBulanProduksi;
import java.sql.SQLException;

/**
 *
 * @author hisyam
 */
public interface ProduksiController {
   public void Simpan(IsiDataProduksi produksi) throws SQLException;
   public void Hapus(IsiDataProduksi produksi) throws SQLException;
   public void Clear(IsiDataProduksi produksi) throws SQLException;
   public void Tampil(TableAllKecamatanViewByBulanProduksi produksi) throws SQLException;
}
