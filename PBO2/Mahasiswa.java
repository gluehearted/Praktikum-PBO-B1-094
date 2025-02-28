import java.util.ArrayList;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    String getNIMMahasiswa() {
        return this.NIM;
    }

    String getNamaMahasiswa() {
        return this.nama;
    }

    String getProdiMahasiswa() {
        return this.prodi;
    }

    Dosen getDosenWali() {
        return this.dosenWali;
    }

    Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    public void setNIMMahasiswa(String NIM) {
        this.NIM = NIM;
    }

    public void setNamaMahasiswa(String nama) {
        this.nama = nama;
    }

    public void setProdiMahasiswa(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public Mahasiswa() {
        this.listMatKul = new ArrayList<>();
    }

    public void addMatkul(MataKuliah newMatKul) {
        this.listMatKul.add(newMatKul);
    }

    public void printDetailMhs() {
        System.out.println("NIM Mahasiswa : " + NIM);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Prodi : " + prodi);

        int i;
        for (i = 0; i < listMatKul.size(); i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1) + " yang diambil : " + listMatKul.get(i).getNamaMataKuliah());
        }
    }

    public int getJumlahMatkul() {
        return this.listMatKul.size();
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            totalSKS += listMatKul.get(i).getSKSMahasiswa();
        }
        return totalSKS;
    }
}