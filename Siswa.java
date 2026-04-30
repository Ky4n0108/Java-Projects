import java.util.Scanner;

public class Siswa {
    private String nama;
    private int umur;
    private double nilaiUjian;
    Scanner input = new Scanner(System.in);

    


    //Constuctor
    public Siswa(String nama, int umur, double nilaiUjian) {
        this.nama = nama;
        this.umur = umur;
        this.nilaiUjian = nilaiUjian;
    }

    //Method untuk input data siswa
    public void inputData() {
        System.out.print("Masukkan nama siswa: ");
        this.nama = input.nextLine();

        System.out.print("Masukkan umur siswa: ");
        this.umur = input.nextInt();

        System.out.print("Masukkan nilai ujian siswa: ");
        this.nilaiUjian = input.nextDouble();

        input.nextLine(); // membersihkan buffer
    }

    //Getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public double getNilaiUjian() {
        return nilaiUjian;
    }

    // Setter dengan validasi
public void setNama(String nama) {
    this.nama = nama;
}

public void setUmur(int umur) {
    if (umur >= 5) {
        this.umur = umur;
    } else {
        System.out.println("Umur tidak valid!");
    }
}

public void setNilaiUjian(double nilaiUjian) {
    if (nilaiUjian >= 0 && nilaiUjian <= 100) {
        this.nilaiUjian = nilaiUjian;
    } else {
        System.out.println("Nilai harus antara 0-100!");
    }
}

    //Method tampilInfo()
    public void tampilInfo() {
        System.out.println("=== Informasi Siswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Nilai Ujian: " + nilaiUjian);
        System.out.println("Grade: " + getGrade());
        System.out.println("=======================");
    }

    //method getGrade() --> return A/B/C/D/E
    public String getGrade() {
        if (nilaiUjian >= 90) {
            return "A";
        } else if (nilaiUjian >= 80) {
            return "B";
        } else if (nilaiUjian >= 70) {
            return "C";
        } else if (nilaiUjian >= 60) {
            return "D";
        } else {
            return "E";
        }
    }
}
