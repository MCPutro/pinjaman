/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Controller.*;
import Model.*;
import view.*;
/**
 *
 * @author charlyhsitumorang
 */
public class Driver {
    public static void main(String[] args) {
        //new Isi_barang().setVisible(true);
        Aplikasi app = new Aplikasi();
        new Controller_Menu(app);
        //new controller_peminjaman(app);
        //app.getBarang();
        //Controller_isiBarang c = new Controller_isiBarang(app);
 //       Controller_Karyawan_Baru CKB = new Controller_Karyawan_Baru(app);
        //Controller.controller_peminjaman c1 = new controller_peminjaman(app);
    }
}
