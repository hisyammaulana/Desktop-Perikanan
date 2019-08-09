/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ProduksiController;
import View.IsiData.IsiDataProduksi;
import View.Table.TableAllKecamatanViewByBulanProduksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hisyam
 */
public class ProduksiModel implements ProduksiController{

    @Override
    public void Simpan(IsiDataProduksi produksi) throws SQLException {
        try {
           Connection con = koneksi.getKoneksi();
           String sql = "INSERT tbl_produksi_pengolahan VALUES(null,?,?,?,?,?,?,?,?,?,?)";
           PreparedStatement statement = con.prepareStatement(sql);
           
           statement.setString(1, String.valueOf(produksi.txt_nama.getText()));
           statement.setString(2, String.valueOf(produksi.cb_kecamatan.getSelectedItem()));
           statement.setString(3, String.valueOf(produksi.cb_penyuluh.getSelectedItem()));
           statement.setString(4, String.valueOf(produksi.cb_bulan.getSelectedItem()));
           statement.setString(5, String.valueOf(produksi.txt_alamat.getText()));
           statement.setString(6, String.valueOf(produksi.txt_jenis_olahan.getText()));
           statement.setString(7, String.valueOf(produksi.txt_produk_olahan.getText()));
           statement.setInt(8, Integer.valueOf(produksi.txt_produksi.getText()));
           statement.setInt(9, Integer.valueOf(produksi.txt_nil_produksi.getText()));
           statement.setString(10, String.valueOf(produksi.txt_keterangan.getText()));
           statement.executeUpdate();
            
           JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
           statement.close();
        } catch (Exception e) {
           System.out.println(e);
        }
    }

    @Override
    public void Hapus(IsiDataProduksi produksi) throws SQLException {
        //
    }

    @Override
    public void Clear(IsiDataProduksi produksi) throws SQLException {
        //
    }

    @Override
    public void Tampil(TableAllKecamatanViewByBulanProduksi produksi) throws SQLException {
        produksi.tblmodel.getDataVector().removeAllElements();
        produksi.tblmodel.fireTableDataChanged();
        try {
            Connection con = koneksi.getKoneksi();
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM tbl_produksi_pengolahan WHERE kecamatan = 'BANJARHARJO' ORDER BY id ASC";
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                Object[] ob= new Object[22];
                ob[0] = res.getString(2);
                ob[1] = res.getString(3);
                ob[2] = res.getString(4);
                ob[3] = res.getString(5);
                ob[4] = res.getString(6);
                ob[5] = res.getString(7);
                ob[6] = res.getString(8);
                ob[7] = res.getString(9);
                ob[8] = res.getString(10);
                ob[9] = res.getString(11);
                produksi.tblmodel.addRow(ob);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
