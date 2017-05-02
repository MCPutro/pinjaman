/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author charlyhsitumorang
 */
public class Peminjaman {
    private String kode_pinjam;
    private ArrayList <Barang> barang;
    private String status;
    private String date;

    public Peminjaman(String kode_pinjam,String status, String date) {
        this.kode_pinjam = kode_pinjam;
        this.status = status;
        this.date = date;
        this.barang = new ArrayList<>();
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getKode_pinjam() {
        return kode_pinjam;
    }

    public void setKode_pinjam(String kode_pinjam) {
        this.kode_pinjam = kode_pinjam;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public void addBarang(Barang b){
        this.barang.add(b);
        //agregasi dari barang
    }

    public ArrayList<Barang> getBarang() {
        return barang;
    }
    
    
    
}
