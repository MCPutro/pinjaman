/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Menu;

/**
 *
 * @author charlyhsitumorang
 */
public class Controller_Menu implements ActionListener {

    Menu viewmenu;
    Aplikasi app;

    public Controller_Menu(Aplikasi app) {
        this.app = app;
        viewmenu = new Menu();
        viewmenu.addListener(this);
        viewmenu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object o = e.getSource();
        if (o.equals(viewmenu.getBtn_inputBarang())) {
            new Controller_isiBarang(app);
            this.viewmenu.dispose();
        }
        else
        if(o.equals(viewmenu.getBtn_tambah_karyawan())) {
            new Controller_Karyawan_Baru(app);
            this.viewmenu.dispose();
        }
        else
        if(o.equals(viewmenu.getBtn_InputPeminjaman())){
            new controller_peminjaman(app);
            this.viewmenu.dispose();
        }
    }
}
