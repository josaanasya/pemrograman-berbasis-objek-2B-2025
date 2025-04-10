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
class manusia {
    String nama, alamat;
    int umur ;
    
void berjalandanberlari(){
    System.out.println("berjalan dan berlari");   
}
}
public class praktikum1 {
    
public static void main(String[]args){
 manusia mahasiswa = new manusia();
 mahasiswa.nama = "FRASINKA JOSA ANASSYA";
 mahasiswa.umur = 19;
 mahasiswa.alamat = "NGANJUK";
 System.out.println("Nama saya : "+mahasiswa.nama);
 System.out.println("Umur : "+mahasiswa.umur);
 System.out.println("Asal : "+mahasiswa.alamat);
 mahasiswa.berjalandanberlari();
 
 manusia mahasiswa2 = new manusia();
 mahasiswa2.nama = "MUHAMMAD ALWI AQIL ABDALIA ADATAMA";
 mahasiswa2.umur = 23;
 mahasiswa2.alamat = "JOMBANG";
 System.out.println("Nama saya : "+mahasiswa2.nama);
 System.out.println("Umur : "+mahasiswa2.umur);
 System.out.println("Asal : "+mahasiswa2.alamat);
 mahasiswa2.berjalandanberlari();
 
 manusia mahasiswa3 = new manusia();
 mahasiswa3.nama = "FERNANDIANAS RERE ";
 mahasiswa3.umur = 25;
 mahasiswa3.alamat = "KEDIRI";
 System.out.println("Nama saya : "+mahasiswa3.nama);
 System.out.println("Umur : "+mahasiswa3.umur);
 System.out.println("Asal : "+mahasiswa3.alamat);
 mahasiswa3.berjalandanberlari();
 
 manusia mahasiswa4 = new manusia();
 mahasiswa4.nama = "FANI SATUR ";
 mahasiswa4.umur = 25;
 mahasiswa4.alamat = "JOMBANG";
 System.out.println("Nama saya : "+mahasiswa4.nama);
 System.out.println("Umur : "+mahasiswa4.umur);
 System.out.println("Asal : "+mahasiswa4.alamat);
 mahasiswa4.berjalandanberlari();
 
 manusia mahasiswa5 = new manusia();
 mahasiswa5.nama = "FERNANDIANAS RERE ";
 mahasiswa5.umur = 25;
 mahasiswa5.alamat = "KEDIRI";
 System.out.println("Nama saya : "+mahasiswa5.nama);
 System.out.println("Umur : "+mahasiswa5.umur);
 System.out.println("Asal : "+mahasiswa5.alamat);
 mahasiswa5.berjalandanberlari();
 }
}
