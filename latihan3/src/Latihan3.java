import java.util.Scanner;

public class Latihan3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        // menghitung jumlah vokal
        int vocalTotal = 0;
        
        for (char voc : kalimat.toLowerCase().toCharArray()) {
            if (voc == 'a' || voc == 'i' || voc == 'u' || voc == 'e' || voc == 'o') {
                vocalTotal++;
                System.out.println(vocalTotal);
            }
        }
        
        // switch-case untuk menampilkan jumlah vokal ganjil atau genap
        switch (vocalTotal % 2) {
            // menampilkan apakah jumlah vokal genap atau ganjil
            case 0:
                System.out.println("Jumlah vokal genap");
                break;
            case 1:
                System.out.println("Jumlah vokal ganjil");
                break;
        }

        // string terbalik menggunakan foreach
        System.out.print("String terbalik: ");
        for (int i = kalimat.length() - 1; i >= 0; i--) {
            System.out.print(kalimat.charAt(i));
        }
        System.out.println();

        input.close();
    }
}
