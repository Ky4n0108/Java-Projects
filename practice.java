import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println ("Masukkan variabel X :");
        int x = input.nextInt();

        System.out.println ("Masukkan variabel y :");
        int y = input.nextInt();

        System.out.println ("Penjumlahan: " + (x + y));
        System.out.println ("Pengurangan: " + (x-y));
        System.out.println ("Perkalian: " + (x * y));

        if (y == 0) {
            System.out.println ("Tidak bisa dibagi dengan 0");

        }
        else {
            System.out.println ("Pembagian: " + (double)+ x/y);

        }

        input.close(); 
        
    }
}
