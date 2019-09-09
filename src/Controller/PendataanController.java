/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.IsiData.IsiPendataanPelakuUsaha;
import java.sql.SQLException;

/**
 *
 * @author hisyam
 */
public interface PendataanController {
    public void Simpan(IsiPendataanPelakuUsaha pelakuUsaha) throws SQLException;
    public void Hapus(IsiPendataanPelakuUsaha pelakuUsaha) throws SQLException;
    public void Bersih(IsiPendataanPelakuUsaha pelakuUsaha) throws SQLException;


}
