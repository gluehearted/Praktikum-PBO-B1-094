class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println("Guk-guk");
    }

    @Override
    public void gerak() {
        System.out.println("Anjing melata");
    }
}
