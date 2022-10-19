/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author LENOVO
 */
public class Mangga {
    int jumlahBeli, harga;
    float berat;
    
    void nama(String nama){
        System.out.println("Nama Mangga : " + nama);
    }
    
    void berat(float berat){
        this.berat = berat;
        System.out.println("Berat : " + berat + " kg");
    }
    
    void beli(int jumlah) {
        jumlahBeli = jumlah;
        System.out.println("Jumlah Beli : " + jumlah);
    }
    
    void totalBerat(){
        System.out.println("Total berat : " + jumlahBeli * berat + " kg");
    }
    
    void totalHarga(){
        System.out.println("Total harga : Rp. " + harga * jumlahBeli);
    }
}

