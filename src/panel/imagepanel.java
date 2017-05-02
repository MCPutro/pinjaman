/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author charlyhsitumorang
 */
public class imagepanel extends JPanel{
    private Image image;
    public imagepanel() {
        image = new ImageIcon(getClass().getResource("/Gambar/profile.png")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics gd = (Graphics2D) g.create();
        gd.drawImage(image, 0,0,getWidth(),getHeight(), this);
        // menggambar image
        gd.dispose();
        //g.drawImage(image, 0, 0, this);
    }
}

