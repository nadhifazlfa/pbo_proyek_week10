/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10_tugas;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        
       System.out.println("---Daftar Produk Yang Dibeli--");
       // Produk Elektronik
       Pembayaran Televisi= new Elektronik ();
       double hargaTelevisi = 9000000; 
       System.out.println("Pajak Televisi (10%): Rp" + Televisi.hitungPajak(hargaTelevisi));
       
       Pembayaran Dispenser= new Elektronik ();
       double hargaDispenser = 4000000; 
       System.out.println("Pajak Dispenser (10%): Rp" + Dispenser.hitungPajak(hargaDispenser));
       
       // Produk Makanan
       Pembayaran makanan = new Makanan();
       double hargaSushi= 150000;
       System.out.println("Pajak Sushi (5%): Rp" + makanan.hitungPajak(hargaSushi)); 
           
    }  
}
    
