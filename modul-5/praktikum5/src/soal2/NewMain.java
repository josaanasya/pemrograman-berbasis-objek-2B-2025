/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mobilsport sport = new mobilsport();
        mobilsedan sedan = new mobilsedan();

        // Mobil Sport
        sport.nyalakanMesin();
        sport.matikanMesin();

        System.out.println();

        // Mobil Sedan
        sedan.nyalakanMesin();
        sedan.matikanMesin();
    }
}
