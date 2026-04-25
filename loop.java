import java.util.Scanner;

public class loop {
    public static void main (String [] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("masukkan angka: ");
        int angka = input.nextInt();

        //for
        System.out.println("-- For loop --");
        for (int i = 1; i <= angka; i++){
            System.out.println(i);
        }

        //while
        System.out.println("-- While loop--");
        int j = angka;
        while (j >=1) {
            System.out.println(j);
            j--;
        }
        input.close();
    }

    
    
}
