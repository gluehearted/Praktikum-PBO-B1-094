public class Main {
        public static void main(String[] args) {
                // Data Dosen Tetap
                DosenTetap dosenTetap = new DosenTetap(
                        "9876543211", "Prof. Budi", "12 March 1988", "15 June 2012",
                        6000000, "Fakultas Ilmu Komputer", "12345678"
                );

                // Data Dosen Tamu
                DosenTamu dosenTamu = new DosenTamu(
                        "1122334455", "Dr. Siti", "5 April 1983", "10 September 2021",
                        4500000, "Fakultas Ekonomi", "87654321", 12 // Masa kontrak: 12 bulan
                );

                // Data Tendik
                Tendik tendik = new Tendik(
                        "9988776655", "Andi", "30 November 1990", "20 August 2017",
                        5000000, "Administrasi Keuangan"
                );

                System.out.println("\n=== Data Pegawai ===");
                dosenTetap.printInfo();
                System.out.println("------------------------");
                dosenTamu.printInfo();
                System.out.println("------------------------");
                tendik.printInfo();
        }
}
