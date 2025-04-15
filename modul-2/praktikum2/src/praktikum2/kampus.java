/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author User
 */
public class kampus {
    String namakampus;
    String alamat;

    static int totalmahasiswa = 0;
    static int jumlahkampus = 0;

    public kampus(String namakampus, String alamat) {
        if (namabenar(namakampus)) {
            this.namakampus = namakampus;
            this.alamat = alamat;

            jumlahkampus++;
        } else {
            System.out.println("Nama kampus tidak valid = " + namakampus);
            this.namakampus = null;
        }
    }

    public void tambahmahasiswa() {
        totalmahasiswa++;
    }

    public void tampilkandata() {
        if (namakampus != null) {
            System.out.println("Nama Kampus = " + namakampus);
            System.out.println("Alamat = " + alamat);
        }
    }

    public static void tampilkan() {
        if (jumlahkampus > 0) {
            System.out.println("Jumlah Kampus = " + jumlahkampus);
            System.out.println("Total Mahasiswa = " + totalmahasiswa);
            System.out.println("Rata-rata Mahasiswa per Kampus = " + (totalmahasiswa / jumlahkampus));
        } else {
            System.out.println("Tidak ada kampus yang valid.");
        }
    }

    public static boolean namabenar(String nama) {
        return nama != null && !nama.isEmpty() && !nama.matches(".*\\d.*");
    }

public String getnamakampus() {
    return namakampus;
}

    }