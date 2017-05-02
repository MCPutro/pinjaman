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
public class Member extends Orang{
    private Peminjaman peminjaman;
    private String Status;

    public Member(String id, String name, char jenis_kelamin) {
        super(id, name, jenis_kelamin);
        this.Status = "dipinjam";
    }

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public void addPeminjaman(String kode_pinjam,String status,String tgl_pinjam){
        //this.peminjaman.add(new Peminjaman(kode_pinjam, nama_Barang, nama_peminjam, status));
        Peminjaman p = new Peminjaman(kode_pinjam, status, tgl_pinjam);
        this.peminjaman = p;
        //komposisi dari peminjaman ke member
    }
    
    public void show(){
        System.out.println(super.getName());
        System.out.println("tgl pinjam : "+this.peminjaman.getDate());
        for (Barang b : this.peminjaman.getBarang()) {
            System.out.println(b);
        }
    }
    
}
