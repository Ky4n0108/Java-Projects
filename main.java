import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat objek siswa (nilai awal bisa default dulu)
        Siswa siswa1 = new Siswa("", 0, 0.0);

        // Input data siswa
        siswa1.inputData();

        // Menampilkan informasi siswa
        siswa1.tampilInfo();

        // Contoh penggunaan setter (opsional)
        System.out.println("\n=== Update Data Siswa ===");
        
        System.out.print("Masukkan nama baru: ");
        siswa1.setNama(input.nextLine());

        System.out.print("Masukkan umur baru: ");
        siswa1.setUmur(input.nextInt());

        System.out.print("Masukkan nilai ujian baru: ");
        siswa1.setNilaiUjian(input.nextDouble());

        // Tampilkan lagi setelah update
        siswa1.tampilInfo();

        input.close();
    }
}