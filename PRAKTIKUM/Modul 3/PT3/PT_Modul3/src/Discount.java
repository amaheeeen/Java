import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan total belanja: Rp ");
        double totalBelanja = input.nextDouble();

        System.out.println("Masukkan tipe member (Platinum, Gold, Silver, Non-Member): ");
        System.out.println("Note: Non-Member tidak mendapatkan diskon tambahan.");
        
        input.nextLine(); 
        String tipeMember = input.nextLine().toLowerCase();

        // Diskon Utama
        double diskonUtama = 0;
        if (totalBelanja > 500000) {
            diskonUtama = 0.20;
        } else if (totalBelanja >= 250000) {
            diskonUtama = 0.10;
        } else {
            diskonUtama = 0;
        }

        // Hitung total setelah diskon utama (1 = 100% (dikonversi) karena menggunakan desimal)
        double totalDiskonUtama = totalBelanja * (1 - diskonUtama);

        // switch-case untuk diskon tambahan
        double diskonTambahan = 0;
        switch (tipeMember) {
            case "platinum":
                diskonTambahan = 0.05;
                break;
            case "gold":
                diskonTambahan = 0.03;
                break;
            case "silver":
                diskonTambahan = 0.02;
                break;
            default:
                
        }

        // Hitung total setelah diskon tambahan
        double totalSetelahDiskonTambahan = totalDiskonUtama * (1 - diskonTambahan);

        // Tampilkan hasil sederhana
        System.out.println("=== TOTAL BELANJA ===");
        System.out.println("Total belanja: Rp " + totalBelanja);
        System.out.println("Diskon utama: " + (diskonUtama * 100) + "%");
        System.out.println("Diskon tambahan (" + tipeMember + "): " + (diskonTambahan * 100) + "%");
        System.out.println("Total akhir: Rp " + totalSetelahDiskonTambahan);

        // Ternary operator untuk menampilkan apakah pelanggan mendapatkan diskon atau tidak
        System.out.println((diskonUtama > 0 || diskonTambahan > 0) ? "Selamat, anda mendapatkan diskon." : "maaf, anda tidak mendapatkan diskon.");

        input.close();
    }
}