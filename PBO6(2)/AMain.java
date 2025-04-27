// Praktikum : B1
// Nama / NIM : Gabriel Prakosa Ardhi / 24060123130094
// File : AMain.java sebagai program utama untuk menjalankan fungsi dan prosedur

public class AMain {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Angel");
        Anabul anjing = new Anjing("Helly");
        Anabul burung = new Burung("Jimbim");

        System.out.println("Nama Kucing : " + kucing.getNama());
        kucing.suara();
        kucing.gerak();

        System.out.println("\nNama Anjing : " + anjing.getNama());
        anjing.suara();
        anjing.gerak();

        System.out.println("\nNama Burung : " + burung.getNama());
        burung.suara();
        burung.gerak();

        System.out.println("\n--- Setelah ganti nama ---");
        kucing.setNama("Oyen");
        System.out.println("Nama baru kucing: " + kucing.getNama());
    }
}
