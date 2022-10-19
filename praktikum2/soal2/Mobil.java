/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author LENOVO
 */
public class Mobil {
    
    String merek, tahun_keluaran, milik;
    int kapasitas;
    int harga;

      void info(){
         System.out.println("Merek Mobil: "+merek);
         System.out.println("Harga: Rp. "+harga);
         System.out.println("Tahun Keluaran: "+tahun_keluaran);
         System.out.println("Kapasitas: "+kapasitas+"cc");
     }

      void setPemilik(String pemilik){
         milik = pemilik;
     }

     String getPemilik(){
         return milik;
     }

     int getPajak(){
        int pajak = harga * 2/100;
        return pajak;
    }
}