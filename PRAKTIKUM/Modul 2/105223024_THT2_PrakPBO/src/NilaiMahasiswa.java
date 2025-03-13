import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("NIM mahasiswa: ");
        String nim = input.nextLine();
        
        System.out.print("Usia mahasiswa: ");
        int usia = input.nextInt();
        
        System.out.print("Jumlah mata kuliah yang diambil: ");
        int jumlahMataKuliah = input.nextInt();
        
        double totalNilai = 0;
        for (int i = 1; i <= jumlahMataKuliah; i++) {
            System.out.print("Masukkan nilai mata kuliah ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }
        

        double rataRataNilai = totalNilai / jumlahMataKuliah;
        double ipk = (rataRataNilai / 100) * 4.0; 
        
        boolean lebihDariDuaDua = usia > 22;
        boolean ipkBaik = ipk >= 3.5 && jumlahMataKuliah > 4;
        boolean ipkBuruk = ipk < 2.5 || jumlahMataKuliah < 4;

        // Menampilkan laporan akademik
        System.out.println("\n=== LAPORAN AKADEMIK MAHASISWA ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Jumlah Mata Kuliah: " + jumlahMataKuliah);
        System.out.println("Rata-rata Nilai: " + rataRataNilai);
        System.out.println("IPK: " + ipk);
        
        // Menampilkan evaluasi
        System.out.println("Apakah usia lebih dari 22 tahun? " + lebihDariDuaDua);
        System.out.println("Apakah IPK >= 3.5 dan jumlah mata kuliah > 4? " + ipkBaik);
        System.out.println("Apakah IPK < 2.5 atau jumlah mata kuliah < 4? " + ipkBuruk);
        
        // Nomor antrian konsultasi akademik
        int nomorAntrian = (int) (Math.random() * 100) + 1; // Nomor antrian acak antara 1-100
        System.out.println("Nomor Antrian Konsultasi Akademik: " + nomorAntrian);
        
        input.close();
    }
}