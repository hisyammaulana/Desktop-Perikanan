/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.LuasController;
import View.IsiData.IsiDataLuasLahan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hisyam
 */
public class LuasModel implements LuasController{

    @Override
    public void Simpan(IsiDataLuasLahan lahan) throws SQLException {
        try {
            Connection con = koneksi.getKoneksi();
            String sql = "INSERT tbl_luas_lahan_rtp VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement statement = con.prepareStatement(sql);
//            
            statement.setString(1, String.valueOf(lahan.txt_desa.getText()));
            statement.setString(2, String.valueOf(lahan.cb_kecamatan.getSelectedItem()));
            statement.setString(3, String.valueOf(lahan.cb_penyuluh.getSelectedItem()));
            statement.setString(4, String.valueOf(lahan.cb_bulan.getSelectedItem()));
            statement.setInt(5, Integer.valueOf(lahan.txt_jml_rtp_tambak_sederhana.getText()));
            statement.setInt(6, Integer.valueOf(lahan.txt_luas_tambak_sederhana.getText()));
            statement.setInt(7, Integer.valueOf(lahan.txt_jml_rtp_tambak_semi.getText()));
            statement.setInt(8, Integer.valueOf(lahan.txt_luas_tambak_semi.getText()));
            statement.setInt(9, Integer.valueOf(lahan.txt_jml_rtp_tambak_intensif.getText()));
            statement.setInt(10, Integer.valueOf(lahan.txt_luas_tambak_intensif.getText()));
            statement.setInt(11, Integer.valueOf(lahan.txt_jml_rtp_kolam.getText()));
            statement.setInt(12, Integer.valueOf(lahan.txt_luas_lahan_kolam.getText()));
            statement.setInt(13, Integer.valueOf(lahan.txt_jml_rtp_rumput_lat.getText()));
            statement.setInt(14, Integer.valueOf(lahan.txt_luas_lahan_rumput_laut.getText()));
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
            statement.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void Tampil(IsiDataLuasLahan lahan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Clear(IsiDataLuasLahan lahan) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
