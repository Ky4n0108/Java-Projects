import java.util.Scanner;

public class suhu {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan Suhu dalam celsius: ");
        int suhu = input.nextInt();
    
    System.out.println("Kelvin: " + (suhu + 273.150));
     System.out.println("Fahrenheit: " + ((suhu * 9.0/5) + 32));
    
    
     input.close();
    }
}
