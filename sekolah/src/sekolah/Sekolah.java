/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sekolah;
import Pembayaran.*;
import java.util.Scanner;
import java.util.ArrayList;
import Administrator.koneksi;
/**
 *
 * @author asus
 */
public class Sekolah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        koneksi db = new koneksi();
        //db.SimpanBiaya(1, 1, 1, "50000", "240303", "30000", "40000");
        //db.UbahBiaya(1, 1, 1, "50000", "240303", "30000", "40000");
        //db.HapusBiaya(557);
        //db.CariBiaya(1);
        db.dataBiaya();
        
        
        
    }
    
}





