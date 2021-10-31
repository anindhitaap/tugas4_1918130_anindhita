package com.example.makanan;
public class Data {
    private String nama,bahan,harga;
    private int foto;
    public Data(String nama, String bahan, String harga, int foto){
        this.nama = nama;
        this.bahan = bahan;
        this.harga = harga;
        this.foto = foto;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getBahan(){ return bahan; }
    public void setBahan(String bahan){
        this.bahan = bahan;
    }
    public String getHarga(){
        return harga;
    }
    public void setHarga(String harga){
        this.harga = harga;
    }

    public int getFoto() { return foto; }
    public void setFoto(int foto) { this.foto = foto; }
}
