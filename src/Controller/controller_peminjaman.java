/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Barang;
import Model.Member;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.Peminjam;
import view.Peminjamanview;

/**
 *
 * @author charlyhsitumorang
 */
public class controller_peminjaman implements ActionListener {

    Peminjamanview peminjaman;
    Peminjam peminjam;
    Aplikasi app;

    public controller_peminjaman(Aplikasi app) {
        peminjaman = new Peminjamanview();
        this.app = app;
        peminjaman.addListener(this);
        peminjaman.setVisible(true);
        loadBarang();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object o = e.getSource();
        if (o.equals(peminjaman.getBtn_Tambahkan())) {
            String id = peminjaman.getTxid().getText();
            String nama = peminjaman.getTxt_Nama_Peminjam().getText();
            String tgl_peminjaman = peminjaman.getTglPeminjaman();
            char jk = peminjaman.getJenisKelamin();

            //membuat member baru
            Member m1 = new Member(id, nama, jk);
            m1.addPeminjaman(peminjaman.getTxt_Kode_Pinjam().getText(), "Belum Dikembalikan", tgl_peminjaman );

            //jika jumlah barang1 yang dipinjam lebih dari 0
            if (peminjaman.getJumlahBarang1() > 0) {
                Barang b1 = app.getBarang(peminjaman.getBarang1());//membuat object barang1 yang akan dipinjam
                b1.setJumlah_barang(peminjaman.getJumlahBarang1());//set jumlah barang1 yang akan dipinjam
                m1.getPeminjaman().addBarang(b1);
            }

            //jika jumlah barang2 yang dipinjam lebih dari 0
            if (peminjaman.getJumlahBarang2() > 0) {
                Barang b2 = app.getBarang(peminjaman.getBarang2());//membuat object barang2 yang akan dipinjam
                b2.setJumlah_barang(peminjaman.getJumlahBarang2());//set jumlah barang2 yang akan dipinjam
                m1.getPeminjaman().addBarang(b2);
            }
            
            //jika jumlah barang3 yang dipinjam lebih dari 0
            if (peminjaman.getJumlahBarang3() > 0) {
                Barang b3 = app.getBarang(peminjaman.getBarang3());//membuat object barang3 yang akan dipinjam
                b3.setJumlah_barang(peminjaman.getJumlahBarang3());//set jumlah barang3 yang akan dipinjam
                m1.getPeminjaman().addBarang(b3);
            }
            
            app.addPeminjam(m1);
            //   new Controller_isiBarang(app);//untuk pindah ke frame lain
        } 
        else 
        if (o.equals(peminjaman.getBtnview())) {
            peminjam = new Peminjam();
            if (peminjaman.getBarang1() == 1) {
                JOptionPane.showMessageDialog(null, peminjaman.getBarang1());
            }
        }
    }

    private void loadBarang() {
        try {
            for (Barang b : app.getBarang()) {
                this.peminjaman.getComponentBar1().addItem(b.getNama_barang());
                this.peminjaman.getComponentBar2().addItem(b.getNama_barang());
                this.peminjaman.getComponentBar3().addItem(b.getNama_barang());
            }
        } catch (Exception e) {
        }
    }

//    public void loadPeminjaman(){
//        DefaultTableModel model = (DefaultTableModel) this.peminjam.getDaftarpeminjam().getModel();
//        try {
//            for(int i = 0; i<model.getRowCount();i++){
//                model.removeRow(0);
//            }
//        } catch (Exception e) {
//        int row = 0;
//        for(peminjam p : app.getPeminjam()){
//            
//        }
//        }
//    }
}
