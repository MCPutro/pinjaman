/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
//import javax.swing.*;
import ConnectioN.Connect_DB;
import java.sql.ResultSet;
import java.util.ArrayList;

//import java.sql.ResultSet;
/**
 *
 * @author charlyhsitumorang
 */
public class Karyawan extends Orang{
    private ArrayList<Barang> barang;
    private String Username;
    private String Password;
  //  private String id_karyawan;
    

    public Karyawan(String id, String name, char jenis_kelamin, String Username, String Password) {
        super(id, name,jenis_kelamin );
        this.Username = Username;
        this.Password = Password;
      //  this.id_karyawan = id_karyawan;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ArrayList<Barang> getBarang() {
        return barang;
    }
    
    
//    public void addBarang(Barang b){
//        this.barang.add(b);
//    }
    //save karyawan sedang bermasalah
//      public void saveKaryawan(){   //BERMASALAH
//        Connect_DB db =new Connect_DB();
//        String s ="insert into login values('"+this.getName()+"','"+this.getUsername()+"','"+this.getId_karyawan()+"');"; 
//        db.query(s);
//    }
//    
//    public ResultSet getKaryawan(){
//      ResultSet result = null;
//      Connect_DB db = new Connect_DB();
//      String s = "insert into login values('"+this.getName()+"','"+this.getUsername()+"','"+this.getId_karyawan()+"');";
//      db.query(s);
//      return result;
//    

}
