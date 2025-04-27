class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println();
        System.out.println("Tunjangan : " + tunjangan);
    }
}