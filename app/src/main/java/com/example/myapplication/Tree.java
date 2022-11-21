package com.example.myapplication;

public class Tree {
  private   String tenThuonggoi;
  private   String dacTinh;
    private String mauLa;
    private  int hinhAnh;

    public Tree(String tenThuonggoi, String dacTinh, String mauLa, int hinhAnh) {
        this.tenThuonggoi = tenThuonggoi;
        this.dacTinh = dacTinh;
        this.mauLa = mauLa;
        this.hinhAnh = hinhAnh;
    }

    public String getTenThuonggoi() {
        return tenThuonggoi;
    }

    public void setTenThuonggoi(String tenThuonggoi) {
        this.tenThuonggoi = tenThuonggoi;
    }

    public String getDacTinh() {
        return dacTinh;
    }

    public void setDacTinh(String dacTinh) {
        this.dacTinh = dacTinh;
    }

    public String getMauLa() {
        return mauLa;
    }

    public void setMauLa(String mauLa) {
        this.mauLa = mauLa;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
