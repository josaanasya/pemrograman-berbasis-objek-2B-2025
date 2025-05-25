/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author User
 */
import java.util.ArrayList;
public class perpustakaan {
    private ArrayList<buku> daftarBuku;

    public perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(buku b) {
        daftarBuku.add(b);
        System.out.println("Buku \"" + b.getJudul() + "\" berhasil ditambahkan.");
    }

    public void tampilkanSemuaBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku yang ditambahkan.");
        } else {
            for (buku b : daftarBuku) {
                b.tampilkan();
            }
        }
    }
}
