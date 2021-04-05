package com.example.myfinances;

public class Keuangan {
    private String NamaTransaksi;
    private String JenisTransaksi;
    private String Tanggal;
    private String Jumlah;

    public Keuangan(String NamaTransaksi, String JenisTransaksi, String Tanggal, String Jumlah) {
        this.NamaTransaksi = NamaTransaksi;
        this.JenisTransaksi = JenisTransaksi;
        this.Tanggal = Tanggal;
        this.Jumlah = Jumlah;
    }

    public String getNamaTransaksi() {
        return NamaTransaksi;
    }

    public void setNamaTransaksi(String namaTransaksi) {
        this.NamaTransaksi = namaTransaksi;
    }

    public String getJenisTransaksi() {
        return JenisTransaksi;
    }

    public void setJenisTransaksi(String jenisTransaksi) {
        this.JenisTransaksi = jenisTransaksi;
    }

    public String getTanggal() {
        return Tanggal;
    }

    public void setTanggal(String tanggal) {
        this.Tanggal = tanggal;
    }

    public String getJumlah() {
        return Jumlah;
    }

    public void setJumlah(String jumlah) {
        this.Jumlah = jumlah;
    }
}
