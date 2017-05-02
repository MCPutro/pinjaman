/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import Model.Karyawan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.Karyawan_Baru;

/**
 *
 * @author charlyhsitumorang
 */
public class Controller_Karyawan_Baru implements ActionListener {
    private Karyawan_Baru KB;
    Aplikasi app;
    
    public Controller_Karyawan_Baru(Aplikasi app){
        KB = new Karyawan_Baru();
        this.app = app;
        KB.addActionListener(this);
        KB.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object o = e.getSource();
        if(o.equals(KB.getBtn_daftar())){
           String ID = KB.getTx_id().getText();
           String nama = KB.getTx_nama().getText();
           String username = KB.getTx_username().getText();
           String Password = KB.getTx_password().getText();
           char jk = KB.getJenisKelamin();
           Karyawan K = new Karyawan(ID, nama, jk, username, Password);
           app.addKaryawan(K);
           JOptionPane.showMessageDialog(null,"Selamat anda telah terdaftar sebagai karyawan baru");
           new Controller_Karyawan();
           
        }
    }
       
    
}
