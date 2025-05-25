/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class bank {
    private ArrayList<rekeningbank> daftarRekening;

    public bank() {
        daftarRekening = new ArrayList<>();
    }

    public void tambahRekening(rekeningbank rek) {
        daftarRekening.add(rek);
        System.out.println("Rekening atas nama " + rek.getNamapemilik() + " berhasil ditambahkan.");
    }

    public rekeningbank cariRekening(String norek) {
        for (rekeningbank rek : daftarRekening) {
            if (rek.getNorek().equals(norek)) {
                return rek;
            }
        }
        return null;
    }

    public void tampilkanSemuaRekening() {
        if (daftarRekening.isEmpty()) {
            System.out.println("Belum ada data rekening.");
        } else {
            for (rekeningbank rek : daftarRekening) {
                rek.tampilkan();
            }
        }
    }
}

    

