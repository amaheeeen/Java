import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input total pembelian
        System.out.print("Masukkan total pembelian: Rp ");
        double totalPembelian = input.nextDouble();

        // Input jenis membership
        System.out.print("Masukkan jenis membership (Platinum, Gold, Silver, Non-Member): ");
        input.nextLine(); // Membersihkan buffer
        String jenisMembership = input.nextLine().trim().toLowerCase();

        // Hitung diskon utama
        double diskonUtama = 0;
        if (totalPembelian > 500000) {
            diskonUtama = 0.20;
        } else if (totalPembelian >= 250000) {
            diskonUtama = 0.10;
        }

        // Hitung total setelah diskon utama
        double totalSetelahDiskonUtama = totalPembelian * (1 - diskonUtama);

        // Hitung diskon tambahan menggunakan switch case
        double diskonTambahan = 0;
        switch (jenisMembership) {
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
                diskonTambahan = 0; // Non-Member tidak mendapatkan diskon tambahan
        }

        // Hitung total setelah diskon tambahan
        double totalSetelahDiskonTambahan = totalSetelahDiskonUtama * (1 - diskonTambahan);

        // Tampilkan hasil perhitungan
        System.out.println("\n=== Detail Perhitungan Diskon ===");
        System.out.println("Total pembelian: Rp " + totalPembelian);
        System.out.println("Diskon utama: " + (diskonUtama * 100) + "%");
        System.out.println("Diskon tambahan (" + jenisMembership + "): " + (diskonTambahan * 100) + "%");
        System.out.println("Total akhir: Rp " + totalSetelahDiskonTambahan);

        // Ternary operator untuk menampilkan pesan diskon
        System.out.println((diskonUtama > 0 || diskonTambahan > 0) ? "Anda mendapatkan diskon." : "Anda tidak mendapatkan diskon.");

        input.close();
    }
}