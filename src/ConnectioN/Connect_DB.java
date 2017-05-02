package ConnectioN;
import view.Isi_barang;
import Model.Barang;
import Model.Karyawan;
import Model.Peminjaman;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Connect_DB {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet rs = null;
    private String dbuser = "root";
    private String dbpassword = "";
    private String server = "jdbc:mysql://localhost:3306/tubespbo";
    Isi_barang ib;
    
   public void Connect_DB (){
       //load JDBC driver
       try {
           connection = DriverManager.getConnection(server,dbuser,dbpassword);
           statement = connection.createStatement();
           JOptionPane.showMessageDialog(null, "connect succes");
       } catch (Exception e) {
           e.printStackTrace();
           throw new IllegalArgumentException("terjadi kesalahan saat Koneksi");
       }
    } 
    
    public void saveBarang(Barang b){
        try {
            String s = "insert into daftar_barang(Nama_Barang,Kode_Barang,Jumlah_Barang) values"
                    +"('"+b.getNama_barang()+"',"
                    +"'"+b.getKode_barang()+"',"
                    +"'"+b.getJumlah_barang()+"')";
            statement.execute(s);
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save Barang");
        }
    }
    
    public void saveKaryawan(Karyawan K){
        try {
            String s = "insert into karyawan(Nama_Lengkap,ID,Username,Password) values"
                    +"('"+K.getName()+"',"
                    +"'"+K.getId()+"',"
                    +"'"+K.getUsername()+"',"
                    +"'"+K.getPassword()+"')";
            statement.execute(s);
        } catch (Exception e) {
        }
    }
    
    public void savePeminjaman(Peminjaman P){
        
    }
    
    public ArrayList<Barang> loadBarang(){
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        try {
            String query = "select * from daftar_barang";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {                
                Barang b = new Barang(rs.getString("Nama_Barang"), rs.getString("Kode_Barang"), rs.getInt("Jumlah_Barang"));
                daftarBarang.add(b);
            }
            return daftarBarang;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    
}

