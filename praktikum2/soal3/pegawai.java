/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3;

/**
 *
 * @author LENOVO
 */
public class pegawai {
    public String nama;
    
//pada baris ini terjadi error karena tipe data yang digunakan tidak tepat, char hanya bisa menampung
//satu karakter sehingga kita harus menggantikan tipe datanya menjadi String yang mampu menampung sekumpulan karakter
//public char asal;
    public String asal;
    
    public String jabatan;
    public int umur;
    
    public String getNama() {
        return nama;
    }
    
    public String getAsal() {
        return asal;
    }
    
//Dibaris ini perlu ditambahkan parameter agar argumen bisa disimpan
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}