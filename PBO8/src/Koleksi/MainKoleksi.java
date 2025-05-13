/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koleksi;
/*
Nama : Gabriel Prakosa Ardhi
NIM : 24060123130094
*/
/**
 *
 * @author Gabriel Prakosa A
 */
public class MainKoleksi {
    public static void main(String[] args) {
        try {
            // Membuat objek koleksi dengan kapasitas 10
            Koleksi k = new Koleksi(10);

            // Menambahkan data baru ke dalam koleksi
            k.add("Aldo");
            k.add("Bella");
            k.add("Citra");
            k.add("Dio");
            k.add("Eka");

            // Menampilkan seluruh isi koleksi
            System.out.println("Isi koleksi:");
            k.showAll();
            System.out.println("Jumlah elemen: " + k.getSize());

            System.out.println();

            // Menghapus salah satu data
            System.out.println("Hapus 'Citra'");
            String dihapus = k.delete("Citra");
            if (dihapus != null) {
                System.out.println("Yang dihapus: " + dihapus);
            }

            // Menampilkan ulang isi koleksi
            System.out.println("\nSetelah penghapusan:");
            k.showAll();
            System.out.println("Jumlah elemen: " + k.getSize());

            // Edit data ke-0 (indeks 0)
            System.out.println("\nEdit elemen ke-0:");
            k.setIsi(0, "Aldovian");

            // Menampilkan ulang isi koleksi
            System.out.println("\nSetelah edit:");
            k.showAll();

            // Tambahkan hingga mencapai kapasitas penuh
            System.out.println("\nMenambahkan elemen hingga penuh:");
            while (k.getSize() < k.getWadah().length) {
                k.add("Kosong");
            }

            System.out.println("Show all:");
            k.showAll();

            System.out.println("\nMencoba tambahkan elemen melebihi kapasitas:");
            k.add("Overflow"); // Akan memunculkan eksepsi

        } catch (Eksepsi e) {
            System.out.println("Terjadi Eksepsi: " + e.getMessage());
        }
    }
}
