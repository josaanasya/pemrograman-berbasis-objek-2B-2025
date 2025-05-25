/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klinik4;

/**
 *
 * @author User
 */
import java.util.ArrayList;
public class klinik {
    private ArrayList<pasien> daftarPasien;

    public klinik() {
        daftarPasien = new ArrayList<>();
    }

    public void tambahPasien(pasien p) {
        daftarPasien.add(p);
        System.out.println("Pasien " + p.getNama() + " berhasil ditambahkan.");
    }

    public void tampilkanSemuaPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien yang terdaftar.");
        } else {
            for (pasien p : daftarPasien) {
                p.tampilkan();
            }
        }
    }
}

