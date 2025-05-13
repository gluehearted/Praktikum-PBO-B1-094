/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatarGenerik;
/*
Nama : Gabriel Prakosa Ardhi
NIM : 24060123130094
*/
import java.util.ArrayList;

/**
 *
 * @author Gabriel Prakosa A
 */
public class BangunDatarGenerikTest {
    public static void main(String[] args) {
        Persegi P = new Persegi(2);
        PersegiPanjang PP = new PersegiPanjang(2, 3);
        Segitiga S = new Segitiga(2, 3);
        ArrayList<BangunDatar> ArrayOfBangunDatar = new ArrayList<>();
        
        ArrayOfBangunDatar.add(P);
        ArrayOfBangunDatar.add(PP);
        ArrayOfBangunDatar.add(S);

        BangunDatarGenerik<BangunDatar> yahahay = new BangunDatarGenerik<>();

        for (BangunDatar BD : ArrayOfBangunDatar) {
            yahahay.set(BD);
            System.out.println(BD);
            System.out.println("Keliling: " + BD.hitungKeliling());
            System.out.println("Luas: " + BD.hitungLuas());
            System.out.println("Tipe generic: " + BD.getClass().getName());
            System.out.println();
        }
        
    }
}
