import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan umur kamu =" );
        int umur  = input.nextInt();

        if (umur >= 18 ) {
         System.out.println  ("kamu sudah dewasa !");
            
        } else {
            System.out.println ("kamu masih bocil wkwkwkwkwk");
        }

        input.close();
    }
    
}
