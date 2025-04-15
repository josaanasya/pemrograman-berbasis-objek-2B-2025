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
public class main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kampus kampus = new kampus("Universitas Disayang sama yang lebih tua adek melayang mass 000", "Jl. menuju kebahagiaan");

        matakuliah mk1 = new matakuliah("1", "Pemrograman Dasar", 3); 
        matakuliah mk2 = new matakuliah("2", "Struktur Data", 2); 
        matakuliah mk3 = new matakuliah("3", "Basis Data", 3);
        matakuliah mk4 = new matakuliah("4", "Desain Manajemen Jaringan ", 2);
        matakuliah mk5 = new matakuliah("5", "Sistem Operasi", 3);
        matakuliah mk6 = new matakuliah("6", "Pemrograman Web", 3);
        matakuliah mk7 = new matakuliah("7", "Analisa Proses Bisnis", 2);
        matakuliah mk8 = new matakuliah("8", "Ecommers", 2);

        mahasiswa mhs1 = new mahasiswa("Frasinkaa", "2311111111", "Informatika");
        mahasiswa mhs2 = new mahasiswa("Josa", "222222222", "Sistem Informasi");
        mahasiswa mhs3 = new mahasiswa("Anassya", "2333333333", "Teknik Komputer");
        mahasiswa mhs4 = new mahasiswa("Fika", "2344444444", "Informatika");
        mahasiswa mhs5 = new mahasiswa("Cioooo", "2355555555", "Sistem Informasi");
        mahasiswa mhs6 = new mahasiswa("Fida", "236666666666666666", "Teknik Komputer");

        mhs1.tambahmataKuliah(mk1);
        mhs1.tambahmataKuliah(mk2);
        mhs1.tambahmataKuliah(mk3);
        mhs1.tambahmataKuliah(mk4);

        mhs2.tambahmataKuliah(mk2);
        mhs2.tambahmataKuliah(mk3);
        mhs2.tambahmataKuliah(mk5);
        mhs2.tambahmataKuliah(mk6);

        mhs3.tambahmataKuliah(mk1);
        mhs3.tambahmataKuliah(mk4);
        mhs3.tambahmataKuliah(mk7);
        mhs3.tambahmataKuliah(mk8);

        mhs4.tambahmataKuliah(mk1);
        mhs4.tambahmataKuliah(mk5);
        mhs4.tambahmataKuliah(mk6);
        mhs4.tambahmataKuliah(mk7);

        mhs5.tambahmataKuliah(mk3);
        mhs5.tambahmataKuliah(mk4);
        mhs5.tambahmataKuliah(mk6);
        mhs5.tambahmataKuliah(mk8);

        mhs6.tambahmataKuliah(mk2);
        mhs6.tambahmataKuliah(mk5);
        mhs6.tambahmataKuliah(mk7);
        mhs6.tambahmataKuliah(mk8);

        // Menambahkan mahasiswa ke kampus
        kampus.tambahmahasiswa();
        kampus.tambahmahasiswa();
        kampus.tambahmahasiswa();
        kampus.tambahmahasiswa();
        kampus.tambahmahasiswa();
        kampus.tambahmahasiswa();

    // Tampilkan biodata mahasiswa
    mahasiswa[] daftarmahasiswa = { mhs1, mhs2, mhs3, mhs4, mhs5, mhs6 };
    for (int i = 0; i < daftarmahasiswa.length; i++) {
    System.out.println("\n=== Mahasiswa ke-" + (i + 1) + " ===");
    daftarmahasiswa[i].tampilkannama();
}

    // Tampilkan informasi kampus dan validasi
    System.out.println("\n=== Informasi Kampus ===");
    kampus.tampilkandata(); 

    boolean valid = kampus.namabenar(kampus.getnamakampus()); 
    System.out.println("Status Validasi Nama Kampus: " + (valid ? "Valid" : "Tidak Valid"));
    
    mahasiswa.getjumlahmahasiswa();
    }
 
}
