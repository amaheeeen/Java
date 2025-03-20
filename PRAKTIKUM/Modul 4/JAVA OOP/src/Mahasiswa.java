public class Mahasiswa {
    
    // Atribut
    String nama;
    String nim;
    String jurusan;
    boolean isLulus = false; // default value
    static int angkatan = 2019; // static variable
    
    // Konstruktor berparameter
    Mahasiswa (String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // konstruktor default
    Mahasiswa() {
        this("no name", "00000", "no jurusan");
    } 

    // konstruktor
    Mahasiswa(Mahasiswa m) {
        this.nama = m.nama;
        this.nim = m.nim;
        this.jurusan = m.jurusan;
    }

    // method 
    public void belajar() {
        System.out.println(this.nama + " sedang belajar");
    }
    
    // method overloading 
    public void belajar(String nama, int umur) {
        System.out.println(nama + " dengan umur " + umur + " sedang belajar");
    }
    

    // function
    String getNama() {
        return nama;
    }
    
    static void kuliah () {
        System.out.println("Mahasiswa sedang kuliah");
    }

    // Inner Class
    class Dalam {
        void test() {
            System.out.println("ini adalah inner class");
        }
    }
}
