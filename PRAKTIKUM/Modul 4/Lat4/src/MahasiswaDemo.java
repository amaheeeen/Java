public class MahasiswaDemo {
    public static void main(String[] args) {
        DataMahasiswa mhs1 = new DataMahasiswa("Adjie", "105223000", "Teknik Elektro", 3.00);
        DataMahasiswa mhs2 = new DataMahasiswa("Irfan", "105223001", "Manajemen", 2.95);

        System.out.println("=== Data Mahasiswa 1 ===");
        mhs1.tampilkanInfo();
        System.out.println("Lulus? " + (mhs1.cekLulus() ? "Ya" : "Tidak"));
        
        System.out.println("\n=== Data Mahasiswa 2 ===");
        mhs2.tampilkanInfo();
        System.out.println("Lulus? " + (mhs2.cekLulus() ? "Ya" : "Tidak"));
    }
}