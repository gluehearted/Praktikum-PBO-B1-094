class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void suara() {
        System.out.println("Anabul bersuara seperti...");
    }

    public void gerak() {
        System.out.println("Anabul bergerak seperti...");
    }
}