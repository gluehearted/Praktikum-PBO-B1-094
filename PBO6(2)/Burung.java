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
