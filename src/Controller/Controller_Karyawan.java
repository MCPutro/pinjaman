/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Peminjamanview;
import view.profile;

/**
 *
 * @author charlyhsitumorang
 */
public class Controller_Karyawan implements ActionListener {
    profile P_Karyawan;
    Peminjamanview peminjaman;
    
    public Controller_Karyawan(){
        P_Karyawan = new profile();
        P_Karyawan.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
       Object o = e.getSource();
//       if(o.equals(peminjaman.getMenu_profile())){
//          
//       }
    }
    
}
