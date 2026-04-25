import java.util.Scanner;

public class perkalian5 {

    public static void main (String [] args) {
         Scanner input = new Scanner(System.in);

         System.out.print("Masukkan angka: ");
         int angka = input.nextInt();


         System.out.println("-- For loop --");
        for (int i = 1; i <= 10; i++){
            System.out.println(angka + " x " + i + " = " + (angka * i));
        
    
        }

        input.close();

    }
    
}
