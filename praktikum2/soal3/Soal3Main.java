/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author LENOVO
 */
public class Soal3Main {
    public static void main(String[] args) {
        pegawai p1 = new pegawai();
//Pada baris ini terjadi error karena kurangnya titik koma (;)
//p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
//Pada baris ini ditambahkan deklarasi umur dengan nilai 17 sesuai outpot yang diinginkan
        p1.umur = 17;
        
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
 //Pada baris ini tambahkan string tahun agar sesuai dengan instruksi soal
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}