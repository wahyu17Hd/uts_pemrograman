package com.example.organtubuh.model;

public class Organ {
    private String jenis;
    private String nama;
    private String letak;
    private String deskripsi;
    private int drawableRes;

    public Organ(String jenis, String nama, String letak, String deskripsi, int drawableRes) {
        this.jenis = jenis;
        this.nama = nama;
        this.letak = letak;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() { return nama; }

    public void setNama(String nama) { this.nama = nama; }

    public String getLetak() { return letak; }

    public void setLetak(String letak) { this.letak= letak; }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
