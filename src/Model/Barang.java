/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import ConnectioN.Connect_DB;
import java.sql.ResultSet;

/**
 *
 * @author charlyhsitumorang
 */
public class Barang {
    private String nama_barang;
    private String kode_barang;
    private int jumlah_barang;


    public Barang(String nama_barang, String kode_barang, int jumlah_barang) {
        this.nama_barang = nama_barang;
        this.kode_barang = kode_barang;
        this.jumlah_barang = jumlah_barang;
    }
    
    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    @Override
    public String toString() {
        return "Barang{" + "nama_barang=" + nama_barang + ", kode_barang=" + kode_barang + ", jumlah_barang=" + jumlah_barang + '}';
    }
    
    
}

