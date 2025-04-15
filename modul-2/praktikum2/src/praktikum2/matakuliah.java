package praktikum2;

/**
 *
 * @author User
 */
public class matakuliah {
 private String kode;
 private String nama;
 private int sks;

 public matakuliah(String kode, String nama, int sks) {
  if (!isSKSValid(sks)) {
   throw new IllegalArgumentException("Jumlah SKS tidak valid (harus 2 atau 3)");
  }
  this.kode = kode;
  this.nama = nama;
  this.sks = sks;
 }

 public String getDeskripsi() {
  // Menghilangkan tanda hubung (-)
  return kode + " " + nama + " (" + sks + " SKS)";
 }

 public static boolean isSKSValid(int sks) {
  return sks == 2 || sks == 3;
 }
}
