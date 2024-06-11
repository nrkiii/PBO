/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author asus
 */
public class koneksi {
    
    private String databaseName = "db_detail_biaya";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/"+databaseName;
    public static Connection koneksiDB;
    
   public koneksi (){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           koneksiDB = DriverManager.getConnection(lokasi,username,password);
           System.out.println("Database Terkoneksi");
       }catch (Exception e){
           System.err.println(e.toString());
       }
   }
   
   public void SimpanBiaya(int paramidsiswa, int paramidjurusan, int paramidtapel, String paramjumbiaya,
           String paramtglbayar, String paramdibayar, String parambiaya) {
   
   
       try{
           String SQL = "INSERT INTO Biaya(id_siswa, id_jurusan, id_tapel, jumbiaya, tglbayar, dibayar, biaya)" 
                   + "VALUE(?,?,?,?,?,?,?)";
           
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, paramidsiswa);
           perintah.setInt(2, paramidjurusan);
           perintah.setInt(3, paramidtapel);
           perintah.setString(4, paramjumbiaya);
           perintah.setString(5, paramtglbayar);
           perintah.setString(6, paramdibayar);
           perintah.setString(7, parambiaya);
           perintah.executeUpdate();
                System.out.println("Data Berhasil di Simpan");
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
         
  }
  
  public void UbahBiaya (int paramidsiswa, int paramidjurusan, int paramidtapel, String paramjumbiaya,
           String paramtglbayar, String paramdibayar, String parambiaya){
      
      try{
        String SQL = "UPDATE Biaya SET id_jurusan=?, id_tapel=?, jumbiaya=?, tglBayar=?, dibayar=?, biaya=? WHERE id_siswa=?";
        
        PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setInt(1, paramidjurusan);
           perintah.setInt(2, paramidtapel);
           perintah.setString(3, paramjumbiaya);
           perintah.setString(4, paramtglbayar);
           perintah.setString(5, paramdibayar);
           perintah.setString(6, parambiaya);
           perintah.setInt(7, paramidsiswa);
           perintah.executeUpdate();
                System.out.println("Data Berhasil di Ubah");
       } catch (Exception e){
           System.out.println(e.getMessage());  
       }
          
  }
  
  public void HapusBiaya(int paramidsiswa){
      try{
          String SQL = "DELETE FROM Biaya WHERE id_siswa=?";
          PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
          perintah.setInt(1, paramidsiswa);
          perintah.executeUpdate();
          System.out.println("Data Berhasil di Hapus");
      } catch (Exception e){
          System.err.println(e.getMessage());
      }
  }
  
  public void CariBiaya(int paramidsiswa){
      try{
          String SQL = "SELECT*FROM Biaya WHERE id_siswa=?";
          PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
          perintah.setInt(1, paramidsiswa);
          ResultSet data = perintah.executeQuery();
          while(data.next()){
              System.out.println("id_siswa :"+data.getInt("id_siswa"));
              System.out.println("id_jurusan :"+data.getInt("id_jurusan"));
              System.out.println("id_tapel :"+data.getInt("id_tapel"));
              System.out.println("jumbiaya :"+data.getString("jumbiaya"));
              System.out.println("tglBayar :"+data.getString("tglBayar"));
              System.out.println("dibayar :"+data.getString("dibayar"));
              System.out.println("biaya :"+data.getString("biaya"));
          }
      }catch(Exception e){
          System.err.println(e.getMessage());
      }
  }
  
  public void dataBiaya(){
      try{
         Statement stmt = koneksiDB.createStatement();
         ResultSet baris = stmt.executeQuery("SELECT*FROM Biaya ORDER BY id_siswa ASC");
         while(baris.next()){
             System.out.println(baris.getInt("id_siswa")+"|"+
                     baris.getInt("id_jurusan")+" | "+
                     baris.getInt("id_tapel")+" | "+
                     baris.getInt("id_tapel")+" | "+
                     baris.getString("jumbiaya")+" | "+
                     baris.getString("tglBayar")+" | "+
                     baris.getString("dibayar")+" | "+
                     baris.getString("biaya"));
         }
      }catch (Exception e){
      System.err.println(e.getMessage());
      }
  
    }
  
}
    

