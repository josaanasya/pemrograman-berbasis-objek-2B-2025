/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

/**
 *
 * @author User
 */
public class Praktikum5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        joko joko = new joko();
        beni beni = new beni();
        fani fani = new fani();
        jeni jani = new jeni();

        // Memanggil method satu per satu (tanpa perulangan atau list)

        // Joko
        joko.berbicara();
        joko.bekerja();
        joko.makan();

        System.out.println();

        // Beni
        beni.berbicara();
        beni.bekerja();
        beni.makan();

        System.out.println();

        // Fani
        fani.berbicara();
        fani.bekerja();
        fani.makan();

        System.out.println();

        // Jani
        jani.berbicara();
        jani.bekerja();
        jani.makan();
    }
}

 
