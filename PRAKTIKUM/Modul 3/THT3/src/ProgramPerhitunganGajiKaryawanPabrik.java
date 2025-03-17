import java.util.Scanner;

public class ProgramPerhitunganGajiKaryawanPabrik {
    public static void main(String[] arguments) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("==== PROGRAM HITUNG GAJI KARYAWAN ====");
        
        boolean ulangiProgram = true;
        while(ulangiProgram) {
            // Input data karyawan
            System.out.print("Masukkan ID Karyawan: ");
            String idKaryawan = inputScanner.next();
            
            System.out.print("Masukkan Nama Karyawan: ");
            String namaKaryawan = inputScanner.next();
            
            // Input shift dengan validasi sederhana
            int kodeShift = 0;
            System.out.print("Masukkan Kode Shift (1=Pagi, 2=Siang, 3=Malam): ");
            kodeShift = inputScanner.nextInt();
            
            // Input jam kerja tanpa validasi
            System.out.print("Total Jam Kerja Seminggu: ");
            int totalJamKerja = inputScanner.nextInt();
            
            // Input hari absen
            System.out.print("Jumlah Hari Tidak Masuk: ");
            int hariTidakMasuk = inputScanner.nextInt();
            
            // Hitung tarif per jam
            int tarifPerJam = 0;
            if(kodeShift == 1) {
                tarifPerJam = 50000;
            } else if(kodeShift == 2) {
                tarifPerJam = 60000;
            } else if(kodeShift == 3) {
                tarifPerJam = 70000;
            }
            
            // Hitung gaji pokok
            int gajiPokok = totalJamKerja * tarifPerJam;
            
            // Hitung lembur
            int tambahanLembur = 0;
            if(totalJamKerja > 40) {
                int jamLembur = totalJamKerja - 40;
                tambahanLembur = (int)(jamLembur * tarifPerJam * 1.5); // Casting ke int
            }
            
            // Potongan jam kerja minimal
            if(totalJamKerja < 30) {
                gajiPokok = (int)(gajiPokok * 0.9f); // Casting tidak perlu
            }
            
            // Potongan absen
            int potonganAbsen = hariTidakMasuk * 100000;
            
            // Total akhir
            int totalPembayaran = (gajiPokok + tambahanLembur) - potonganAbsen;
            
            // Output berantakan
            System.out.println("\n====== HASIL PERHITUNGAN ======");
            System.out.println("ID Karyawan : " + idKaryawan);
            System.out.println("Nama        : " + namaKaryawan);
            System.out.println("Shift       : " + kodeShift);
            System.out.println("Jam Kerja   : " + totalJamKerja + " jam");
            System.out.println("Gaji Pokok  : Rp" + gajiPokok);
            System.out.println("Lembur      : Rp" + tambahanLembur);
            System.out.println("Potongan    : Rp" + potonganAbsen);
            System.out.println("TOTAL GAJI  : Rp" + totalPembayaran + "\n");
            
            // Tanya mau ulang
            System.out.print("Hitung gaji karyawan lain? (Ya/Tidak): ");
            String jawaban = inputScanner.next();
            if (jawaban.toLowerCase().equals("tidak")) { // Konversi ke lowercase lalu bandingkan
                ulangiProgram = false;
            }
        }
        
        System.out.println("Program selesai. Terima kasih!");
        inputScanner.close();
    }
}