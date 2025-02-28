/* Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method untuk merepresentasikan garis
 * Pembuat   : Gabriel Prakosa Ardhi - 24060123130094
 * Tanggal   : Selasa, 25 Februari 2025
 */

 public class Garis {
    /* States/Atribut */
    Titik T1; 
    Titik T2; 
    static int CounterGaris = 0; // Menghitung jumlah objek Garis yang dibuat

    /* Method */
    
    /* Mengembalikan jumlah objek Garis yang telah dibuat */
    static int getCounterGaris(){
        return CounterGaris;
    }

    /* Konstruktor untuk membuat garis dengan titik T1 dan T2 yang diberikan */
    Garis(Titik T1, Titik T2) {
        this.T1 = T1;
        this.T2 = T2;
        CounterGaris++;
    }

    /* Konstruktor default untuk membuat garis dari (0,0) ke (1,1) */
    Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    /* Mengembalikan titik awal garis */
    Titik getT1Garis() {
        return this.T1;
    }

    /* Mengembalikan titik akhir garis */
    Titik getT2Garis() {
        return this.T2;
    }

    /* Mengubah titik awal garis */
    void setT1Garis(Titik T1) {
        this.T1 = T1;
    }

    /* Mengubah titik akhir garis */
    void setT2Garis(Titik T2) {
        this.T2 = T2;
    }

    /* Menghitung dan mengembalikan panjang garis */
    double getPanjangGaris() {
        return Math.sqrt(Math.pow(T1.getAbsis() - T2.getAbsis(), 2) + Math.pow(T1.getOrdinat() - T2.getOrdinat(), 2));
    }

    /* Menghitung dan mengembalikan gradien garis */
    double getGradien() {
        double X = T1.getAbsis() - T2.getAbsis();
        if (X == 0) {
            System.out.println("Nilai x1 dan x2 sama, gradien tidak terdefinisi");
        }
        return (T1.getOrdinat() - T2.getOrdinat()) / X;
    }

    /* Mengembalikan titik tengah dari garis */
    Titik getTitikTengah() {
        return new Titik((T1.getAbsis() + T2.getAbsis()) / 2.0, (T1.getOrdinat() + T2.getOrdinat()) / 2.0);
    }

    /* Mengecek apakah garis ini sejajar dengan garis X */
    boolean isSejajar(Garis X) {
        return this.getGradien() == X.getGradien();
    }

    /* Mengecek apakah garis ini tegak lurus dengan garis X */
    boolean isTegakLurus(Garis X) {
        return (this.getGradien() * X.getGradien()) == -1;
    }

    /* Menampilkan titik awal dan titik akhir garis */
    void printT1T2() {
        System.out.println("Titik awal (" + T1.getAbsis() + ", " + T1.getOrdinat() + "), Titik akhir (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
    }

    /* Menampilkan persamaan garis dalam bentuk y = mx + c */
    void printRumus() {
        double m = this.getGradien();
        double c = T1.getOrdinat() - (m * T1.getAbsis());
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}
