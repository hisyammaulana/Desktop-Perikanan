/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.KolamController;
import Model.koneksi;
import View.IsiData.IsiDataKolam;
import View.Table.TableAllKecamatanViewByBulanKolam;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hisyam
 */
public class KolamModel implements KolamController{

    @Override
    public void Simpan(IsiDataKolam idk) throws SQLException {
        try {
            Connection con = koneksi.getKoneksi();
//            String sql = "insert into tbl_kolam (desa, kecamatan, bulan, penyuluh, pro_lele, nill_lele, pro_nila, nil_nila, pro_kaper, "
//                    + "nil_kaper, pro_nilem, nil_nilem, pro_gurame, nil_gurame) "
//                    + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql = "INSERT tbl_kolam VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, String.valueOf(idk.txt_desa.getText()));
            statement.setString(2, String.valueOf(idk.cb_kecamatan.getSelectedItem()));
            statement.setString(3, String.valueOf(idk.cb_bulan.getSelectedItem()));
            statement.setString(4, String.valueOf(idk.cb_penyuluh.getSelectedItem()));
            statement.setInt(5, Integer.valueOf(idk.txt_po_lele.getText()));
            statement.setInt(6, Integer.valueOf(idk.txt_nil_lele.getText()));
            statement.setInt(7, Integer.valueOf(idk.txt_pro_nila.getText()));
            statement.setInt(8, Integer.valueOf(idk.txt_nil_nila.getText()));
            statement.setInt(9, Integer.valueOf(idk.txt_pro_kaper.getText()));
            statement.setInt(10, Integer.valueOf(idk.txt_nil_kaper.getText()));
            statement.setInt(11, Integer.valueOf(idk.txt_pro_nilem.getText()));
            statement.setInt(12, Integer.valueOf(idk.txt_nil_nilem.getText()));
            statement.setInt(13, Integer.valueOf(idk.txt_pro_gurame.getText()));
            statement.setInt(14, Integer.valueOf(idk.txt_nil_gurame.getText()));
            statement.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
            statement.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void Tampil(TableAllKecamatanViewByBulanKolam kolam) throws SQLException {

    }

    @Override
    public void Hapus(IsiDataKolam idk) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Clear(IsiDataKolam idk) throws SQLException {
        idk.txt_desa.setText("");
        idk.txt_nil_gurame.setText("");
        idk.txt_pro_gurame.setText("");
        idk.txt_nil_kaper.setText("");
        idk.txt_pro_kaper.setText("");
        idk.txt_nil_lele.setText("");
        idk.txt_po_lele.setText("");
        idk.txt_pro_nila.setText("");
        idk.txt_nil_nila.setText("");
        idk.txt_nil_nilem.setText("");
        idk.txt_pro_nilem.setText("");
        idk.cb_kecamatan.setSelectedItem(true);
        idk.cb_bulan.setSelectedIndex(0);
        
    }
   
}
