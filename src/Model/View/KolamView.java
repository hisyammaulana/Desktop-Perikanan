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
public class KolamView {
    private String id;
    private String desa;
    private String kecamatan;
    private String bulan;
    private String penyuluh;
    private int pro_lele;
    private int nil_lele;
    private int pro_nila;
    private int nil_nila;
    private int pro_kaper;
    private int nil_kaper;
    private int pro_nilem;
    private int nil_nilem;
    private int pro_gurame;
    private int nil_gurame;
    
    public KolamView(){}

    public KolamView(String desa, String kecamatan, String bulan, String penyuluh, int pro_lele, int nil_lele, int pro_nila, int nil_nila, int pro_kaper, int nil_kaper, int pro_nilem, int nil_nilem, int pro_gurame, int nil_gurame) {
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.bulan = bulan;
        this.penyuluh = penyuluh;
        this.pro_lele = pro_lele;
        this.nil_lele = nil_lele;
        this.pro_nila = pro_nila;
        this.nil_nila = nil_nila;
        this.pro_kaper = pro_kaper;
        this.nil_kaper = nil_kaper;
        this.pro_nilem = pro_nilem;
        this.nil_nilem = nil_nilem;
        this.pro_gurame = pro_gurame;
        this.nil_gurame = nil_gurame;
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

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
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

    public int getPro_kaper() {
        return pro_kaper;
    }

    public void setPro_kaper(int pro_kaper) {
        this.pro_kaper = pro_kaper;
    }

    public int getNil_kaper() {
        return nil_kaper;
    }

    public void setNil_kaper(int nil_kaper) {
        this.nil_kaper = nil_kaper;
    }

    public int getPro_nilem() {
        return pro_nilem;
    }

    public void setPro_nilem(int pro_nilem) {
        this.pro_nilem = pro_nilem;
    }

    public int getNil_nilem() {
        return nil_nilem;
    }

    public void setNil_nilem(int nil_nilem) {
        this.nil_nilem = nil_nilem;
    }

    public int getPro_gurame() {
        return pro_gurame;
    }

    public void setPro_gurame(int pro_gurame) {
        this.pro_gurame = pro_gurame;
    }

    public int getNil_gurame() {
        return nil_gurame;
    }

    public void setNil_gurame(int nil_gurame) {
        this.nil_gurame = nil_gurame;
    }

    public String getPenyuluh() {
        return penyuluh;
    }

    public void setPenyuluh(String penyuluh) {
        this.penyuluh = penyuluh;
    }
    
    
}
