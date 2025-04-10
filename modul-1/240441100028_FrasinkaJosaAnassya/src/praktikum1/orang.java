/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class orang {
    long nim;
    String nama, prodi, alamat;
    Scanner input = new Scanner(System.in);

    void biodata() {
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Nim : ");
        nim = input.nextLong();
        input.nextLine(); // Mengosongkan
        System.out.print("Program Studi : ");
        prodi = input.nextLine();
        System.out.print("Alamat : ");
        alamat = input.nextLine();
    }

    void hasil() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Alamat : " + alamat);
    }

    public static void main(String[] args) {
        orang mahasiswa = new orang();
         for (int i=0;i<3;i++){
             mahasiswa.biodata();
             mahasiswa.hasil();
         }
        
    }
}