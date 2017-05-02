/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Peminjam;

/**
 *
 * @author charlyhsitumorang
 */
public class controller_Peminjam implements ActionListener {
    Peminjam peminjam;
    Aplikasi app;
    
    
    public controller_Peminjam(){
        peminjam = new Peminjam();
        peminjam.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
