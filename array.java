

public class array {
    public static void main (String [] args) {
        // Array nama hari
      
        String[] hari = {"senin", "selasa", "rabu", "kamis","jum'at","sabtu","minggu"};
    

        // Tampilkan semua hari
        System.out.println ("Daftar hari:");
        for (int i = 0; i < hari.length; i++) {
            System.out.println((i + 1) + ". " + hari[i]);
        }
        

        // Tampilkan panjang array
        System.out.println ("Jumlah hari: " + hari.length);


        //Akses index array 
        System.out.println("Hari ke-3 adalah: " + hari [2]);


    }
    
}


