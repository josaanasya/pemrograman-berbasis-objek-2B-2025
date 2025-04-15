/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private ArrayList <matakuliah> daftarmataKuliah;

    private static int jumlahmahasiswa = 0;

    public mahasiswa(String nama, String nim, String prodi) {
    if (!isNIMValid(nim)){
        System.out.println("NIM tidak valid karna tidak awalan 23");
    }
       if (!isNIMno(nim)){
        System.out.println("NIM tidak valid karna Nim lebih dari 10");
       }
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.daftarmataKuliah = new ArrayList<>();
        jumlahmahasiswa++;
    }

    public void tambahmataKuliah(matakuliah mk) {
        daftarmataKuliah.add(mk);
    }

    public void tampilkannama() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Daftar Mata Kuliah:");
        for (matakuliah mk : daftarmataKuliah) {
            System.out.println("  - " + mk.getDeskripsi());
        }
    }

    public static int getjumlahmahasiswa() {
        System.out.println("jumlah mahasiswa universitas ini adalah" + jumlahmahasiswa);
        return jumlahmahasiswa;
    }

    public static boolean isNIMValid(String nim) {
        return nim.startsWith("23");
    }
    public static boolean isNIMno(String nim){
        return nim.length() <= 10;
}   
}
