/* Nama File : MTitik.java
 * Deskripsi : Berisi aplikasi dari Titik.java
 * Pembuat   : Gabriel Prakosa Ardhi - 24060123130094
 * Tanggal   : Selasa, 18 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        // Membuat titik T1
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        System.out.println("T1 Berada di kuadran: " + T1.getKuadran()); // menampilkan titik T1 berada kuadran berapa
        System.out.println("T1 Jarak ke pusat: " + T1.getJarakPusat()); // menampilkan jarak titik T1 dengan pusat(0,0)
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2)); // menampilkan jarak titik T1 dengan T2

        T1.setRefelksiX(); // merefleksikan titik pada sumbu x
        T1.printTitik(); // menampilkan koordinat T1 ke layar
        T1.setRefelksiY(); // merefleksikan titik pada sumbu y
        T1.printTitik(); // menampilkan koordinat T1 ke layar
        
        System.out.println("Berada di kuadran: " + T1.getKuadran()); // menampilkan titik T1 berada kuadran berapa
        Titik reflekX = T1.getRefleksiX(); // membuat titik baru yang diisi dengan T1 yang direfleksikan pada sumbu X
        reflekX.printTitik(); // menampilkan koordinat reflekX ke layar
        Titik reflekY = T1.getRefleksiY(); // membuat titik baru yang diisi dengan T1 yang direfleksikan pada sumbu y
        reflekY.printTitik();  // menampilkan koordinat reflekY ke layar

    }
}
