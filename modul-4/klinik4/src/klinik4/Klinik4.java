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
import java.util.Scanner;
public class Klinik4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        klinik klinikku = new klinik();
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== MENU KLINIK ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Lihat Daftar Pasien");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    String nama = input.nextLine();
                    System.out.print("Umur: ");
                    int umur = input.nextInt();
                    input.nextLine(); // buang newline
                    System.out.print("Keluhan: ");
                    String keluhan = input.nextLine();

                    pasien baru = new pasien(nama, umur, keluhan);
                    klinikku.tambahPasien(baru);
                    break;

                case 2:
                    System.out.println("\nDaftar Pasien:");
                    klinikku.tampilkanSemuaPasien();
                    break;

                case 3:
                    System.out.println("Terima kasih. Program selesai.");
                    jalan = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
}

