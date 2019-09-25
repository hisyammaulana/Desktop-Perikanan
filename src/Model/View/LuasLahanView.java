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
public class LuasLahanView {
    private String desa;
    private String kecamatan;
    private String penyuluh;
    private String bulan;
    private int jml_rtp_tambak_sederhana;
    private int luas_tambak_sederhana;
    private int jml_rtp_tambak_semi;
    private int luas_tambak_semi;
    private int jml_rtp_tambak_intensif;
    private int luas_tambak_intensif;
    private int jml_rtp_kolam;
    private int luas_kolam;
    private int jml_rtp_rumput_laut;
    private int luas_lahan_rumput_laut;

    public LuasLahanView(String desa, String kecamatan, String penyuluh, String bulan, int jml_rtp_tambak_sederhana, int luas_tambak_sederhana, int jml_rtp_tambak_semi, int luas_tambak_semi, int jml_rtp_tambak_intensif, int luas_tambak_intensif, int jml_rtp_kolam, int luas_kolam, int jml_rtp_rumput_laut, int luas_lahan_rumput_laut) {
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.penyuluh = penyuluh;
        this.bulan = bulan;
        this.jml_rtp_tambak_sederhana = jml_rtp_tambak_sederhana;
        this.luas_tambak_sederhana = luas_tambak_sederhana;
        this.jml_rtp_tambak_semi = jml_rtp_tambak_semi;
        this.luas_tambak_semi = luas_tambak_semi;
        this.jml_rtp_tambak_intensif = jml_rtp_tambak_intensif;
        this.luas_tambak_intensif = luas_tambak_intensif;
        this.jml_rtp_kolam = jml_rtp_kolam;
        this.luas_kolam = luas_kolam;
        this.jml_rtp_rumput_laut = jml_rtp_rumput_laut;
        this.luas_lahan_rumput_laut = luas_lahan_rumput_laut;
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

    public int getJml_rtp_tambak_sederhana() {
        return jml_rtp_tambak_sederhana;
    }

    public void setJml_rtp_tambak_sederhana(int jml_rtp_tambak_sederhana) {
        this.jml_rtp_tambak_sederhana = jml_rtp_tambak_sederhana;
    }

    public int getLuas_tambak_sederhana() {
        return luas_tambak_sederhana;
    }

    public void setLuas_tambak_sederhana(int luas_tambak_sederhana) {
        this.luas_tambak_sederhana = luas_tambak_sederhana;
    }

    public int getJml_rtp_tambak_semi() {
        return jml_rtp_tambak_semi;
    }

    public void setJml_rtp_tambak_semi(int jml_rtp_tambak_semi) {
        this.jml_rtp_tambak_semi = jml_rtp_tambak_semi;
    }

    public int getLuas_tambak_semi() {
        return luas_tambak_semi;
    }

    public void setLuas_tambak_semi(int luas_tambak_semi) {
        this.luas_tambak_semi = luas_tambak_semi;
    }

    public int getJml_rtp_tambak_intensif() {
        return jml_rtp_tambak_intensif;
    }

    public void setJml_rtp_tambak_intensif(int jml_rtp_tambak_intensif) {
        this.jml_rtp_tambak_intensif = jml_rtp_tambak_intensif;
    }

    public int getLuas_tambak_intensif() {
        return luas_tambak_intensif;
    }

    public void setLuas_tambak_intensif(int luas_tambak_intensif) {
        this.luas_tambak_intensif = luas_tambak_intensif;
    }

    public int getJml_rtp_kolam() {
        return jml_rtp_kolam;
    }

    public void setJml_rtp_kolam(int jml_rtp_kolam) {
        this.jml_rtp_kolam = jml_rtp_kolam;
    }

    public int getLuas_kolam() {
        return luas_kolam;
    }

    public void setLuas_kolam(int luas_kolam) {
        this.luas_kolam = luas_kolam;
    }

    public int getJml_rtp_rumput_laut() {
        return jml_rtp_rumput_laut;
    }

    public void setJml_rtp_rumput_laut(int jml_rtp_rumput_laut) {
        this.jml_rtp_rumput_laut = jml_rtp_rumput_laut;
    }

    public int getLuas_lahan_rumput_laut() {
        return luas_lahan_rumput_laut;
    }

    public void setLuas_lahan_rumput_laut(int luas_lahan_rumput_laut) {
        this.luas_lahan_rumput_laut = luas_lahan_rumput_laut;
    }
    
    
    
}
