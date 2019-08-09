/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.IsiData.IsiDataLuasLahan;
import java.sql.SQLException;

/**
 *
 * @author hisyam
 */
public interface LuasController {
    public void Simpan(IsiDataLuasLahan lahan) throws SQLException;
    public void Tampil(IsiDataLuasLahan lahan) throws SQLException;
    public void Clear(IsiDataLuasLahan lahan) throws SQLException;
}
