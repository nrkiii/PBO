/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembayaran;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Biaya extends DetailBiaya{
    
    String biaya, idjurusan, idtapel;
    
    ArrayList<String> biayas;
    ArrayList<String> idjurusans;
    ArrayList<String> idtapels;
    
    public Biaya(){
        
        biayas = new ArrayList<>();
        idjurusans = new ArrayList<>();
        idtapels = new ArrayList<>();
        
    }
    public Biaya(String biaya, String idjurusan,String idtapel){
        this.biaya = biaya;
        this.idjurusan = idjurusan;
        this.idtapel = idtapel;
    }
    public void isibiaya (String biaya){
        biayas.add(biaya);
    }
    
    public ArrayList<String> getbiaya (){
        return this.biayas;
    }
    
    public void inputBiaya(String Biaya){
        this.biaya=Biaya;
    }
    public String ambilBiaya(){
        return this.biaya;
    }
    
    public void isiidjurusan (String idjurusan){
        idjurusans.add(idjurusan);
    }
    
    public ArrayList<String> getidjurusan (){
        return this.idjurusans;
    }
    public void inputIdJurusan(String Id){
        this.idjurusan=Id;
    }
    public String ambilIdJurusan(){
        return this.idjurusan;
    }
    
    public void isiidtapel (String idtapel){
        idtapels.add(idtapel);
    }
    
    public ArrayList<String> getidtapel (){
        return this.idtapels;
    }
    public void inputIdTapel(String IdTap){
        this.idtapel=IdTap;
    }
    public String ambilIdTapel(){
        return this.idtapel;
    }
            
    
    
}
