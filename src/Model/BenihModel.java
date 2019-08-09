/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.BenihController;
import View.IsiData.IsiDataProduksiBenih;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author hisyam
 */
public class BenihModel implements BenihController{

    @Override
    public void Simpan(IsiDataProduksiBenih benih) throws SQLException {
        try {
            Connection con = koneksi.getKoneksi();
            String sql = "INSERT tbl_produksi_benih VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);
            
            statement.setString(1, String.valueOf(benih.txt_nama.getText()));
            statement.setString(2, String.valueOf(benih.txt_desa.getText()));
            statement.setString(3, String.valueOf(benih.cb_kecamatan.getSelectedItem()));
            statement.setString(4, String.valueOf(benih.cb_penyuluh.getSelectedItem()));
            statement.setString(5, String.valueOf(benih.cb_bulan.getSelectedItem()));
            statement.setInt(6, Integer.valueOf(benih.txt_luas_lahan.getText()));
            statement.setInt(7, Integer.valueOf(benih.txt_pro_udang_windu.getText()));
            statement.setInt(8, Integer.valueOf(benih.txt_nil_udang_windu.getText()));
            statement.setInt(9, Integer.valueOf(benih.txt_pro_udang_vaname.getText()));
            statement.setInt(10, Integer.valueOf(benih.txt_nil_udang_vaname.getText()));
            statement.setInt(11, Integer.valueOf(benih.txt_pro_nila.getText()));
            statement.setInt(12, Integer.valueOf(benih.txt_nil_nila.getText()));
            statement.setInt(13, Integer.valueOf(benih.txt_pro_bandeng.getText()));
            statement.setInt(14, Integer.valueOf(benih.txt_nil_bandeng.getText()));
            statement.setInt(15, Integer.valueOf(benih.txt_pro_lele.getText()));
            statement.setInt(16, Integer.valueOf(benih.txt_nil_lele.getText()));
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
            statement.close();                    
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void Hapus(IsiDataProduksiBenih benih) throws SQLException {
        
    }

    @Override
    public void Clear(IsiDataProduksiBenih benih) throws SQLException {
        
    }

    @Override
    public void Tampil(IsiDataProduksiBenih benih) throws SQLException {
        
    }
    
}
