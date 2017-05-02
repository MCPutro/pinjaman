/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.Isi_barang;
import ConnectioN.Connect_DB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charlyhsitumorang
 */
public class Controller_isiBarang implements ActionListener {

    Isi_barang ib;
    Aplikasi ap;
    //Connect_DB db;

    public Controller_isiBarang(Aplikasi ap) {
        ib = new Isi_barang();
//        db = new Connect_DB();
        this.ap = ap;
        ib.addListener(this);
        ib.setVisible(true);
        this.loadBarang();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(ib.getBtnTambahkan())) {
            String nama_barang = ib.getTxtNama_Barang().getText();
            String kode_barang = ib.getTxtKode_Barang().getText();
            int jumlah_barang = Integer.parseInt(ib.getTxtJumlah().getText());
            //menghubungkan dari view ke model barang
//             k.addBarang(new Barang(nama_barang, kode_barang, jumlah_barang));
            Barang b = new Barang (nama_barang, kode_barang, jumlah_barang);
            ap.addBarang(b);
            this.loadBarang();

            //JOptionPane.showMessageDialog(null, ap.getBarang().get(0).getNama_barang());
        }
        else
        if(o.equals(ib.getMenuBack())){//jika menu kembali dimenu bar di klik
            new Controller_Menu(ap);
            this.ib.dispose();
        }
    }

    //method buat menampilkan data barang pada tabel
    public void loadBarang() {
        DefaultTableModel model = (DefaultTableModel) this.ib.gettablebarang().getModel();
        try {
            int rowCount = this.ib.gettablebarang().getRowCount();
            for (int i = 0; i < rowCount; i++) {
                model.removeRow(0);
            }
            int row = 0;
            for (Barang b : ap.getBarang()) {
//                model.addRow(new Object[]{b.getNama_barang(),b.getKode_barang(),b.getJumlah_barang()});
                model.addRow(new Object[]{"", "", ""});//bua menambahkan 1 row
                model.setValueAt(b.getNama_barang(), row, 0);
                model.setValueAt(b.getKode_barang(), row, 1);
                model.setValueAt(b.getJumlah_barang(), row, 2);
                row++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
