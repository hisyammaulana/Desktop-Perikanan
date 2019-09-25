/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.View;

/**
 *
 * @author hisyam
 */
public class TambakView {
    private int id;
    private String desa;
    private String kecamatan;
    private String penyuluh;
    private String bulan;
    private int pro_rumput_laut;
    private int nil_rumput_laut;
    private int pro_udang_windu;
    private int nil_udang_windu;
    private int pro_udang_vaname_sederhana;
    private int nil_udang_vaname_sederhana;
    private int pro_udang_vaname_semi;
    private int nil_udang_vaname_semi;
    private int pro_udang_vaname_intensif;
    private int nil_udang_vaname_intensif;
    private int pro_udang_putih;
    private int nil_udang_putih;
    private int pro_udang_lokal;
    private int nil_udang_lokal;
    private int pro_bandeng;
    private int nil_bandeng;
    private int pro_lele;
    private int nil_lele;

    public TambakView(String desa, String kecamatan, String penyuluh, String bulan, int pro_rumput_laut, int nil_rumput_laut, int pro_udang_windu, int nil_udang_windu, int pro_udang_vaname_sederhana, int nil_udang_vaname_sederhana, int pro_udang_vaname_semi, int nil_udang_vaname_semi, int pro_udang_vaname_intensif, int nil_udang_vaname_intensif, int pro_udang_putih, int nil_udang_putih, int pro_udang_lokal, int nil_udang_lokal, int pro_bandeng, int nil_bandeng, int pro_lele, int nil_lele) {
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.penyuluh = penyuluh;
        this.bulan = bulan;
        this.pro_rumput_laut = pro_rumput_laut;
        this.nil_rumput_laut = nil_rumput_laut;
        this.pro_udang_windu = pro_udang_windu;
        this.nil_udang_windu = nil_udang_windu;
        this.pro_udang_vaname_sederhana = pro_udang_vaname_sederhana;
        this.nil_udang_vaname_sederhana = nil_udang_vaname_sederhana;
        this.pro_udang_vaname_semi = pro_udang_vaname_semi;
        this.nil_udang_vaname_semi = nil_udang_vaname_semi;
        this.pro_udang_vaname_intensif = pro_udang_vaname_intensif;
        this.nil_udang_vaname_intensif = nil_udang_vaname_intensif;
        this.pro_udang_putih = pro_udang_putih;
        this.nil_udang_putih = nil_udang_putih;
        this.pro_udang_lokal = pro_udang_lokal;
        this.nil_udang_lokal = nil_udang_lokal;
        this.pro_bandeng = pro_bandeng;
        this.nil_bandeng = nil_bandeng;
        this.pro_lele = pro_lele;
        this.nil_lele = nil_lele;
    }

    public TambakView(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getPenyuluh() {
        return penyuluh;
    }

    public void setPenyuluh(String penyuluh) {
        this.penyuluh = penyuluh;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public int getPro_rumput_laut() {
        return pro_rumput_laut;
    }

    public void setPro_rumput_laut(int pro_rumput_laut) {
        this.pro_rumput_laut = pro_rumput_laut;
    }

    public int getNil_rumput_laut() {
        return nil_rumput_laut;
    }

    public void setNil_rumput_laut(int nil_rumput_laut) {
        this.nil_rumput_laut = nil_rumput_laut;
    }

    public int getPro_udang_windu() {
        return pro_udang_windu;
    }

    public void setPro_udang_windu(int pro_udang_windu) {
        this.pro_udang_windu = pro_udang_windu;
    }

    public int getNil_udang_windu() {
        return nil_udang_windu;
    }

    public void setNil_udang_windu(int nil_udang_windu) {
        this.nil_udang_windu = nil_udang_windu;
    }

    public int getPro_udang_vaname_sederhana() {
        return pro_udang_vaname_sederhana;
    }

    public void setPro_udang_vaname_sederhana(int pro_udang_vaname_sederhana) {
        this.pro_udang_vaname_sederhana = pro_udang_vaname_sederhana;
    }

    public int getNil_udang_vaname_sederhana() {
        return nil_udang_vaname_sederhana;
    }

    public void setNil_udang_vaname_sederhana(int nil_udang_vaname_sederhana) {
        this.nil_udang_vaname_sederhana = nil_udang_vaname_sederhana;
    }

    public int getPro_udang_vaname_semi() {
        return pro_udang_vaname_semi;
    }

    public void setPro_udang_vaname_semi(int pro_udang_vaname_semi) {
        this.pro_udang_vaname_semi = pro_udang_vaname_semi;
    }

    public int getNil_udang_vaname_semi() {
        return nil_udang_vaname_semi;
    }

    public void setNil_udang_vaname_semi(int nil_udang_vaname_semi) {
        this.nil_udang_vaname_semi = nil_udang_vaname_semi;
    }

    public int getPro_udang_vaname_intensif() {
        return pro_udang_vaname_intensif;
    }

    public void setPro_udang_vaname_intensif(int pro_udang_vaname_intensif) {
        this.pro_udang_vaname_intensif = pro_udang_vaname_intensif;
    }

    public int getNil_udang_vaname_intensif() {
        return nil_udang_vaname_intensif;
    }

    public void setNil_udang_vaname_intensif(int nil_udang_vaname_intensif) {
        this.nil_udang_vaname_intensif = nil_udang_vaname_intensif;
    }

    public int getPro_udang_putih() {
        return pro_udang_putih;
    }

    public void setPro_udang_putih(int pro_udang_putih) {
        this.pro_udang_putih = pro_udang_putih;
    }

    public int getNil_udang_putih() {
        return nil_udang_putih;
    }

    public void setNil_udang_putih(int nil_udang_putih) {
        this.nil_udang_putih = nil_udang_putih;
    }

    public int getPro_udang_lokal() {
        return pro_udang_lokal;
    }

    public void setPro_udang_lokal(int pro_udang_lokal) {
        this.pro_udang_lokal = pro_udang_lokal;
    }

    public int getNil_udang_lokal() {
        return nil_udang_lokal;
    }

    public void setNil_udang_lokal(int nil_udang_lokal) {
        this.nil_udang_lokal = nil_udang_lokal;
    }

    public int getPro_bandeng() {
        return pro_bandeng;
    }

    public void setPro_bandeng(int pro_bandeng) {
        this.pro_bandeng = pro_bandeng;
    }

    public int getNil_bandeng() {
        return nil_bandeng;
    }

    public void setNil_bandeng(int nil_bandeng) {
        this.nil_bandeng = nil_bandeng;
    }

    public int getPro_lele() {
        return pro_lele;
    }

    public void setPro_lele(int pro_lele) {
        this.pro_lele = pro_lele;
    }

    public int getNil_lele() {
        return nil_lele;
    }

    public void setNil_lele(int nil_lele) {
        this.nil_lele = nil_lele;
    }

    
}
