import java.util.Scanner;

public class dayplanner {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    String[] tugas = new String[100];
    int jumlah = 0;

    System.out.println("=== Aplikasi To-Do List ===");

    boolean jalan = true;
    while (jalan) {
        System.out.println("\n1. Tambah Tugas");
        System.out.println("2. Lihat Semua tugas");
        System.out.println("3. Hapus Tugas");
        System.out.println("4. Keluar");
        int pilihan = input.nextInt();
        input.nextLine();
    
        switch (pilihan) {
            case 1:
                System.out.println("Masukkan Tugas: ");
                String tugasBaru = input.nextLine();
                tugas[jumlah] = tugasBaru;
                jumlah++;
                System.out.println("Tugas berhasil ditambahkan ^^");
                break;

            case 2 :
             if (jumlah == 0) {  
                System.out.println("Belum ada tugas!");
            } else {
                System.out.println("\n=== Daftar Tugas ===");
                for (int i= 0; i < jumlah; i++) {
                    System.out.println((i + 1) + ". " + tugas[i]);
                }
            }
            break;
        
        case 3:
            if (jumlah == 0) {
                System.out.println("Belum ada tugas!");
            }else {
                System.out.println("\n=== Daftar tugas ===");
                for (int i = 0; i < jumlah; i++) {
                    System.out.println((i + 1) + ". " + tugas[i]);
                }
                System.out.println("Hapus tugas nomor berapa?");
                int hapus = input.nextInt() - 1;
                for (int i = hapus; i < jumlah - 1; i++) {
                    tugas [i] = tugas [i+1];
                }
                jumlah--;
                System.out.println("Tugas Berhasil dihapus");
            }
            break;

            case 4 :
                System.out.println("Sampai jumpa!");
                jalan = false;
                break;


            default:
                System.out.println("pilihan tidak valid!");
        
        
        
        
        }
    
    
    }
     input.close();
    }
}
