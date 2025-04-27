// Praktikum : B1
// Nama / NIM : Gabriel Prakosa Ardhi / 24060123130094
// File : Burung.java sebagai subclass dari Anabul

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println("Cuit");
    }

    @Override
    public void gerak() {
        System.out.println("Burung terbang");
    }
}
