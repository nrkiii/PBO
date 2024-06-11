/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembayaran;

/**
 *
 * @author asus
 */
public class DetailBiaya {
    
    String dibayar, idSiswa, tglBayar, Jumbiaya;
    
    
    public DetailBiaya (){}
    
    public void inputJUMLAHBIAYA(String jum){
        this.Jumbiaya = jum;
    }
    
    public String ambilJUMLAHBIAYA(){
        return this.Jumbiaya;
    }
    public void inputdibayar(String bayar){
        this.dibayar =  bayar;
    }
    
    public String ambilbiaya(){
        this.Jumbiaya = "Terima Kasih" ;
        if (this.dibayar.equals("I")){
            this.Jumbiaya = "1500000";
        }
        return this.Jumbiaya;
         
    }
    
    
    
    public void inputidSiswa(String id){
        this.idSiswa = id;
    }
    
    public String ambilidSiswa (){
        return this.idSiswa;
    }
    public void inputtglBayar(String tgl){
        this.tglBayar = tgl;
    }
    
    public String ambiltglBayar (){
        return this.tglBayar;
    }
  
   
  
}
