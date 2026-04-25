import java.util.Scanner;

public class ElseIf {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.println ("==Masukkan nilai mu==");
        int nilai = input.nextInt();

        if (nilai >= 90) {
            System.out.println ("Mantap gan, anda lulus!!");
       
     } else if (nilai >=80) {
            System.out.println ("Kerenn!, anda lulus!!");
            
        }
        else if (nilai >=70) {
            System.out.println ("Lumayan!, anda lulus!!");
            
        }
        else if (nilai >=60) {
            System.out.println ("Cukup!, anda lulus!!");
            
        }
        else if (nilai >=50) {
            System.out.println ("Belajar yang rajinn!, jika anda mau lulus!!");
            
        }else if (nilai >=40) {
            System.out.println ("Rubah gaya belajar mu sekarang!!");
            
        }

        input.close();
     
        
    }
    
}
