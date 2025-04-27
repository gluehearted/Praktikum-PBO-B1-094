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
