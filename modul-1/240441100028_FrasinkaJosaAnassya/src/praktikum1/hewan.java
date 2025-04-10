/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author User
 */
import java.util.Random;
import java.util.ArrayList;

class kelinci {
    String nama;
    String jenis;
    String suara;

    void Setkelinci(String n, String j, String s) {
        nama = n;
        jenis = j;
        suara = s;
    }

    void Tampilkankelinci() {
        System.out.println("nama: " + nama);
        System.out.println("jenis: " + jenis);
        System.out.println("suara: " + suara);
    }
}

class monyet {
    String nama;
    String jenis;
    String asal;

    void Setmonyet(String n, String j, String a) {
        nama = n;
        jenis = j;
        asal = a;
    }

    void Tampilkanmonyet() {
        System.out.println("nama: " + nama);
        System.out.println("jenis: " + jenis);
        System.out.println("asal: " + asal);
    }
}

class buaya {
    String nama;
    String jenis;
    String suara;

    void Setbuaya(String n, String j, String s) {
        nama = n;
        jenis = j;
        suara = s;
    }

    void Tampilkanbuaya() {
        System.out.println("nama: " + nama);
        System.out.println("jenis: " + jenis);
        System.out.println("suara: " + suara);
    }
}

public class hewan {
    public static void main(String[] args) {
        String[] namakelinci = {"bro", "oikkks", "cheche"};
        String[] jeniskelinci = {"orang hutan", "tokekk", "sarangan"};
        String[] suarakelinci = {"uuuuuuuuuuuuu", "buuuuuuuuuuuu", "auuuuuuuuuu"};

        String[] namamonyet = {"alwi", "fika", "nurlaila"};
        String[] jenismonyet = {"bekatan", "buntut merah", "kiyowokk"};
        String[] asalmonyet = {"nganjuk", "riau", "sumsel"};

        String[] namabuaya = {"aqil", "josa", "iQiiiii"};
        String[] jenisbuaya = {"buaya darat", "cutee", "buaya kakap"};
        String[] suarabuaya = {"sayangggggggg", "pap dong", "mwahhh"};

        System.out.println("=== Hewan Kelinci ===");
        for (int i = 0; i < 3; i++) {
            kelinci k = new kelinci();
            k.Setkelinci(namakelinci[i], jeniskelinci[i], suarakelinci[i]);
            System.out.println("Kucing " + (i + 1));
            k.Tampilkankelinci();
            System.out.println();
        }

        System.out.println("=== Hewan Monyet ===");
        for (int i = 0; i < 3; i++) {
            monyet b = new monyet();
            b.Setmonyet(namamonyet[i], jenismonyet[i], asalmonyet[i]);
            System.out.println("monyet " + (i + 1));
            b.Tampilkanmonyet();
            System.out.println();
        }

        System.out.println("=== Hewan Buaya ===");
        for (int i = 0; i < 3; i++) {
            buaya bu = new buaya();
            bu.Setbuaya(namabuaya[i], jenisbuaya[i], suarabuaya[i]);
            System.out.println("Buaya " + (i + 1));
            bu.Tampilkanbuaya();
            System.out.println();
        }
    }
}