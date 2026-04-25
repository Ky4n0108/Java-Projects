import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas 1: ");
        int nilai1 = input.nextInt();

        System.out.print("Masukkan nilai tugas 2: ");
        int nilai2 = input.nextInt();

        System.out.print("Masukkan nilai tugas 3: ");
        int nilai3 = input.nextInt();

        double rataRata = (nilai1 + nilai2 + nilai3) / 3.0;
        System.out.printf("Rata-rata: %.2f%n", rataRata);

        if (rataRata >= 90) {
            System.out.println("Grade: A (Luar biasa!)");
        } else if (rataRata >= 80) {
            System.out.println("Grade: B (Bagus!)");
        } else if (rataRata >= 70) {
            System.out.println("Grade: C (Cukup!)");
        } else if (rataRata >= 60) {
            System.out.println("Grade: D (Kurang!)");
        } else {
            System.out.println("Grade: E (Belajar lagi!)");
        }

        input.close();
    }
}