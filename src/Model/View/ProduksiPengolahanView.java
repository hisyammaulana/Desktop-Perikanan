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
public class ProduksiPengolahanView {
    private int id;
    private String nama;
    private String kecamatan;
    private String penyuluh;
    private String bulan;
    private String alamat;
    private String jenis_olahan;
    private String produk_olahan;
    private int produksi;
    private int nil_produksi;
    private String keterangan;

    public ProduksiPengolahanView(String nama, String kecamatan, String penyuluh, String bulan, String alamat, String jenis_olahan, String produk_olahan, int produksi, int nil_produksi, String keterangan) {
        this.nama = nama;
        this.kecamatan = kecamatan;
        this.penyuluh = penyuluh;
        this.bulan = bulan;
        this.alamat = alamat;
        this.jenis_olahan = jenis_olahan;
        this.produk_olahan = produk_olahan;
        this.produksi = produksi;
        this.nil_produksi = nil_produksi;
        this.keterangan = keterangan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenis_olahan() {
        return jenis_olahan;
    }

    public void setJenis_olahan(String jenis_olahan) {
        this.jenis_olahan = jenis_olahan;
    }

    public int getProduksi() {
        return produksi;
    }

    public void setProduksi(int produksi) {
        this.produksi = produksi;
    }
    
    public int getNil_produksi() {
        return nil_produksi;
    }

    public void setNil_produksi(int nil_produksi) {
        this.nil_produksi = nil_produksi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getProduk_olahan() {
        return produk_olahan;
    }

    public void setProduk_olahan(String produk_olahan) {
        this.produk_olahan = produk_olahan;
    }
    
    
    
}
