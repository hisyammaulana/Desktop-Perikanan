/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.TambakController;
import View.IsiData.IsiDataProduksiTambak;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author hisyam
 */
public class TambakModel implements TambakController{

    @Override
    public void Simpan(IsiDataProduksiTambak tambak) throws SQLException {       
        try {
            Connection con = koneksi.getKoneksi();
            String sql = "INSERT tbl_produksi_tambak VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
        
            statement.setString(1, String.valueOf(tambak.txt_desa.getText()));
            statement.setString(2, String.valueOf(tambak.cb_kecamatan.getSelectedItem()));
            statement.setString(3, String.valueOf(tambak.cb_penyuluh.getSelectedItem()));
            statement.setString(4, String.valueOf(tambak.cb_bulan.getSelectedItem()));
            statement.setInt(5, Integer.valueOf(tambak.txt_pro_rumput_laut.getText()));
            statement.setInt(6, Integer.valueOf(tambak.txt_nil_rumput_laut.getText()));
            statement.setInt(7, Integer.valueOf(tambak.txt_pro_udang_windu.getText()));
            statement.setInt(8, Integer.valueOf(tambak.txt_nil_udang_windu.getText()));
            statement.setInt(9, Integer.valueOf(tambak.txt_pro_udang_vaname_sederhana.getText()));
            statement.setInt(10, Integer.valueOf(tambak.txt_nil_udang_vaname_sederhana.getText()));
            statement.setInt(11, Integer.valueOf(tambak.txt_pro_udang_vaname_semi.getText()));
            statement.setInt(12, Integer.valueOf(tambak.txt_nil_udang_vaname_semi.getText()));
            statement.setInt(13, Integer.valueOf(tambak.txt_pro_udang_vaneme_intensif.getText()));
            statement.setInt(14, Integer.valueOf(tambak.txt_nil_udang_vaneme_intensif.getText()));
            statement.setInt(15, Integer.valueOf(tambak.txt_pro_udang_putih.getText()));
            statement.setInt(16, Integer.valueOf(tambak.txt_nil_udang_putih.getText()));
            statement.setInt(17, Integer.valueOf(tambak.txt_pro_udang_lokal.getText()));
            statement.setInt(18, Integer.valueOf(tambak.txt_nil_udang_lokal.getText()));
            statement.setInt(19, Integer.valueOf(tambak.txt_pro_bandeng.getText()));
            statement.setInt(20, Integer.valueOf(tambak.txt_nil_bandeng.getText()));
            statement.setInt(21, Integer.valueOf(tambak.txt_pro_lele.getText()));
            statement.setInt(22, Integer.valueOf(tambak.txt_nil_lele.getText()));
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
            statement.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void Hapus(IsiDataProduksiTambak tambak) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Tampil(IsiDataProduksiTambak tambak) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void Clear(IsiDataProduksiTambak tambak) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
