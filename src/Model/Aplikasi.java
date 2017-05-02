/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import view.Peminjam;
import ConnectioN.Connect_DB;

/**
 *
 * @author charlyhsitumorang
 */
public class Aplikasi {
    private ArrayList <Barang> barang;
    private ArrayList <Member> member = new ArrayList<>();
    private ArrayList <Karyawan> karyawan = new ArrayList<>();
    Connect_DB db;
    
    
    public Aplikasi(){
        db = new Connect_DB();
        db.Connect_DB();
        this.barang = db.loadBarang();
    }
    public void addKaryawan(Karyawan K){
        this.karyawan.add(K);
        db.saveKaryawan(K);
    }
    public void addBarang(Barang b){
        this.barang.add(b);
        db.saveBarang(b);
        //tambahkan savebarang 
    }

    public ArrayList<Barang> getBarang() {
        return barang;
    }
    public void addPeminjam(Member p){
        this.member.add(p);
    }
    public Barang getBarang(int i){
        return barang.get(i);
    }
    public ArrayList<Member> getPeminjam(){
        return member;
    }
}
