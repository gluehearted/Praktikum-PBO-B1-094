/* Nama File : MGaris.java
 * Deskripsi : Berisi aplikasi file Garis.java
 * Pembuat   : Gabriel Prakosa Ardhi - 24060123130094
 * Tanggal   : Selasa, 18 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis(); // membuat garis G1 ((0,0),(1,1))
        Garis G2 = G1; // membuat garis G2 mereferensi G1
        Titik T2 = new Titik(2,3); // membuat titik T2 (2,3)
        G1.printT1T2(); // menampilkan T1 dan T2 garis G1
        G1.setT1Garis(new Titik(4, 5)); // mengubah Titik T1 pada garis menjadi (3,4)
        G1.printT1T2(); // menampilkan T1 dan T2 garis G1 setelah diset dengen titik (3,4)
        G1.setT2Garis(T2); // mengubah titik T2 garis dengan titik T2 yang telah dibuat di atas
        G1.printT1T2(); // menampilkan T1 dan T2 garis G1 setelah diset dengen titik (3,4)
        System.out.println("Panjang garis : " + G1.getPanjangGaris()); // menampilkan panjang garis G1
        System.out.println("Gradien garis : " + G1.getGradien()); // menampilkan gradien garis G1
        System.out.println("Titik tengah garis G1: " + G1.getTitikTengah()); // menampilkan titik tengah garis G1
        System.out.println("Apakah garis G1 dan G2 sejajar? : " + G1.isSejajar(G2)); // menampilkan true/false apakah garis G1 & G2 sejajar
        System.out.println("Apakah garis G1 dan G2 saling Tegak Lurus? : " + G1.isTegakLurus(G2)); // menampilkan true/false apakah garis G1 & G2 saling tegak lurus
        G1.printRumus(); // menampilkan rumus persamaan y = mx + c
    }
}
