package lat5;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilkanInfo();
        System.out.println(mhs1.nama);
        System.out.println(mhs1.umur);

        Mahasiswa mhs2 = new Mahasiswa("Rido");
        System.out.println(mhs2.nama);
        System.out.println(Mahasiswa.universitas);

        mhs1.sayHello("Joko");

        mhs1.sayHello2("Joko", 49, true);

    }
    
}
