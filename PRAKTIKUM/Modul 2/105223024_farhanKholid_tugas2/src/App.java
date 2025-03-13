import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("masukkan nama anda: ");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        System.out.println("Masukkan NIM anda: ");
        int NIM = input.nextInt();
        System.out.println("Masukkan Usia anda: ");
        int usia = input.nextInt();
        System.out.println("Masukkan tinggi badan anda: ");
        double tinggiBadan = input.nextDouble();

        System.out.println("=== Data yang anda masukkan: ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi badan: " + tinggiBadan + " cm");

        input.close();

    
        
        // 1.
        int operatorAritmatika = (usia * 2) - 10 / 5 - 3;
        System.out.println("\nHasil aritmatika: " + operatorAritmatika);
        
        // 2.
        boolean perbandinganUmur = usia > 18;
        System.out.println("\nApakah usia lebih dari 18? ");
        System.out.println("hasil : " + perbandinganUmur);
        
        // 3.
        boolean operatorLogika = (usia > 18) && (tinggiBadan > 160);
        System.out.println("\nApakah usia lebih dari 18 dan tinggi lebih dari 160 cm? ");
        System.out.println("hasil : " + operatorLogika);
        // 4.
        double usiaDouble = usia;
        int tinggiBadanInt = (int) tinggiBadan;
        
        System.out.println("\nKonversi Tipe Data:");
        System.out.println("Usia dalam double: " + usiaDouble);
        System.out.println("Tinggi badan dalam int: " + tinggiBadanInt);


    }
}
