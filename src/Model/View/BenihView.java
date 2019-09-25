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
public class BenihView {
    private int id;
    private String nama;
    private String desa;
    private String kecamatan;
    private String penyuluh;
    private String bulan;
    private int luas_lahan;
    private int pro_udang_windu;
    private int nil_udang_windu;
    private int pro_udang_vaname;
    private int nil_udang_vaname;
    private int pro_nila;
    private int nil_nila;
    private int pro_bandeng;
    private int nil_bandeng;
    private int pro_lele;
    private int nil_lele;

//    public BenihView(int aInt, String string, String string0, String string1, String string2, String string3, int aInt0, int aInt1, int aInt2, int aInt3, int aInt4, int aInt5, int aInt6, int aInt7, int aInt8, int aInt9, int aInt10) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public BenihView(String nama, String desa, String kecamatan, String penyuluh, String bulan, int luas_lahan, int pro_udang_windu, int nil_udang_windu, int pro_udang_vaname, int nil_udang_vaname, int pro_nila, int nil_nila, int pro_bandeng, int nil_bandeng, int pro_lele, int nil_lele) {
        this.nama = nama;
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.penyuluh = penyuluh;
        this.bulan = bulan;
        this.luas_lahan = luas_lahan;
        this.pro_udang_windu = pro_udang_windu;
        this.nil_udang_windu = nil_udang_windu;
        this.pro_udang_vaname = pro_udang_vaname;
        this.nil_udang_vaname = nil_udang_vaname;
        this.pro_nila = pro_nila;
        this.nil_nila = nil_nila;
        this.pro_bandeng = pro_bandeng;
        this.nil_bandeng = nil_bandeng;
        this.pro_lele = pro_lele;
        this.nil_lele = nil_lele;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public int getLuas_lahan() {
        return luas_lahan;
    }

    public void setLuas_lahan(int luas_lahan) {
        this.luas_lahan = luas_lahan;
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

    public int getPro_udang_vaname() {
        return pro_udang_vaname;
    }

    public void setPro_udang_vaname(int pro_udang_vaname) {
        this.pro_udang_vaname = pro_udang_vaname;
    }

    public int getNil_udang_vaname() {
        return nil_udang_vaname;
    }

    public void setNil_udang_vaname(int nil_udang_vaname) {
        this.nil_udang_vaname = nil_udang_vaname;
    }

    public int getPro_nila() {
        return pro_nila;
    }

    public void setPro_nila(int pro_nila) {
        this.pro_nila = pro_nila;
    }

    public int getNil_nila() {
        return nil_nila;
    }

    public void setNil_nila(int nil_nila) {
        this.nil_nila = nil_nila;
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
