package com.mycompany.klinikhewan;

public class Hewan {

    private int idData;
    private String namaHewan;
    private String jenisHewan;
    private String umur;

    public Hewan(int idData, String namaHewan, String jenisHewan, String umur) {
        this.idData = idData;
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.umur = umur;
    }

    public int getIdData() {
        return idData;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public String getUmur() {
        return umur;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }
}