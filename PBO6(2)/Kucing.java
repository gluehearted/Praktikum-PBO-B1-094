// Praktikum : B1
// Nama / NIM : Gabriel Prakosa Ardhi / 24060123130094
// File : Kucing.java sebagai subclass dari Anabul

class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println("Meong");
    }

    @Override
    public void gerak() {
        System.out.println("Kucing melata");
    }
}
