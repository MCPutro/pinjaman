/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Barang;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author charlyhsitumorang
 */
public class Peminjamanview extends javax.swing.JFrame {

    /**
     * Creates new form Peminjamanview
     */
    public Peminjamanview() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.txt_Kode_Pinjam.setText(this.gennerateID());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jComboBox4 = new javax.swing.JComboBox<>();
        jenis_kelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinbarang1 = new javax.swing.JSpinner();
        btn_Tambahkan = new javax.swing.JButton();
        txt_Kode_Pinjam = new javax.swing.JTextField();
        txt_Nama_Peminjam = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        barang1 = new javax.swing.JComboBox<>();
        barang2 = new javax.swing.JComboBox<>();
        barang3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spinbarang2 = new javax.swing.JSpinner();
        spinbarang3 = new javax.swing.JSpinner();
        btnview = new javax.swing.JButton();
        txid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbtn_laki = new javax.swing.JRadioButton();
        rbtn_perempuan = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menu_barang = new javax.swing.JMenuItem();
        menu_profile = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Form Peminjaman"));

        jLabel1.setText("Nama_Peminjam");

        jLabel2.setText("Kode_Pinjam");

        jLabel5.setText("Jumlah_Barang1");

        btn_Tambahkan.setText("add");

        txt_Kode_Pinjam.setEditable(false);

        jLabel6.setText("Barang 1");

        barang1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        barang2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        barang3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        jLabel7.setText("Barang 1");

        jLabel8.setText("Barang 1");

        jLabel9.setText("Jumlah_Barang2");

        jLabel10.setText("Jumlah_Barang3");

        btnview.setText("View");

        jLabel3.setText("ID");

        jenis_kelamin.add(rbtn_laki);
        rbtn_laki.setText("Laki-Laki");

        jenis_kelamin.add(rbtn_perempuan);
        rbtn_perempuan.setText("Perempuan");

        jLabel4.setText("Jenis Kelamin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txid, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nama_Peminjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_Tambahkan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnview)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txt_Kode_Pinjam)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(barang1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(barang2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(barang3, 0, 80, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(spinbarang3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(spinbarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(spinbarang2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtn_laki)
                                .addGap(18, 18, 18)
                                .addComponent(rbtn_perempuan)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nama_Peminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Kode_Pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_laki, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_perempuan)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barang1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(spinbarang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spinbarang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barang2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(barang3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinbarang3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Tambahkan)
                    .addComponent(btnview))
                .addContainerGap())
        );

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        menu.setText("Menu");

        menu_barang.setText("jMenuItem1");
        menu.add(menu_barang);

        jMenuBar1.add(menu);

        menu_profile.setText("jMenu1");
        jMenuBar1.add(menu_profile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method buat auto generate kode pinjam
    private String gennerateID() {
        DateFormat dateFormat = new SimpleDateFormat("MMyyyyddmmHHss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //generat tanggal peminjaman (otomatis)
    public String getTglPeminjaman() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy - mm:HH:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //mengembalikan jenis kelamin
    public char getJenisKelamin() {
        if (rbtn_laki.isSelected()) {
            return 'L';
        } else {
            return 'P';
        }
    }

    //mengembalikan index barang1 yang dipinjam
    public int getBarang1() {
        //Barang x = 
        return barang1.getSelectedIndex() - 1;
    }

    //mengembalikan index barang2 yang dipinjam
    public int getBarang2() {
        //menngembalikan satu indeks barang
        return barang2.getSelectedIndex() - 1;
    }

    //mengembalikan index barang3 yang dipinjam
    public int getBarang3() {
        return barang3.getSelectedIndex() - 1;
    }

    //mengembalikan jumlah barang1 yang dipinjam
    public int getJumlahBarang1() {
        String count = this.spinbarang1.getValue().toString();//data yang berasal dari spin bertipe String
        int c = Integer.parseInt(count);//merubah tipe data dari String ke Integer
        return c;
    }

    //mengembalikan jumlah barang2 yang dipinjam
    public int getJumlahBarang2() {
        String count = this.spinbarang2.getValue().toString();//data yang berasal dari spin bertipe String
        int c = Integer.parseInt(count);//merubah tipe data dari String ke Integer
        return c;
    }

    //mengembalikan jumlah barang1 yang dipinjam
    public int getJumlahBarang3() {
        String count = this.spinbarang3.getValue().toString();//data yang berasal dari spin bertipe String
        int c = Integer.parseInt(count);//merubah tipe data dari String ke Integer
        return c;
    }

    public JTextField getTxt_Kode_Pinjam() {
        return txt_Kode_Pinjam;
    }

    public JTextField getTxt_Nama_Peminjam() {
        return txt_Nama_Peminjam;
    }

    public JButton getBtn_Tambahkan() {
        return btn_Tambahkan;
    }

    public void addListener(ActionListener e) {
        this.btn_Tambahkan.addActionListener(e);
    }

    public JButton getBtnview() {
        return btnview;
    }

    public JTextField getTxid() {
        return txid;
    }

    public JMenuItem getMenu_barang() {
        return menu_barang;
    }

    public JMenu getMenu_profile() {
        return menu_profile;
    }
    
    
    //mengembalikan component combo box 1 hingga 3, digunakan untuk manampilkan daftar nama barang yang tersedia 
    //code load daftar barang di controller_Peminjamanview
    public JComboBox<String> getComponentBar1() {
        return this.barang1;
    }
    public JComboBox<String> getComponentBar2() {
        return this.barang2;
    }
    public JComboBox<String> getComponentBar3() {
        return this.barang3;
    }
    //end
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> barang1;
    private javax.swing.JComboBox<String> barang2;
    private javax.swing.JComboBox<String> barang3;
    private javax.swing.JButton btn_Tambahkan;
    private javax.swing.JButton btnview;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup jenis_kelamin;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menu_barang;
    private javax.swing.JMenu menu_profile;
    private javax.swing.JRadioButton rbtn_laki;
    private javax.swing.JRadioButton rbtn_perempuan;
    private javax.swing.JSpinner spinbarang1;
    private javax.swing.JSpinner spinbarang2;
    private javax.swing.JSpinner spinbarang3;
    private javax.swing.JTextField txid;
    private javax.swing.JTextField txt_Kode_Pinjam;
    private javax.swing.JTextField txt_Nama_Peminjam;
    // End of variables declaration//GEN-END:variables
}
