package lat5.enkapsulasi;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        System.out.println(mhs1.getNama());

        mhs1.setNama("Randi");
        System.out.println(mhs1.getNama());

        mhs1.setUmur(20);
        System.out.println(mhs1.getUmur());

        mhs1.setJurusan("Teknik Informatika");
        System.out.println(mhs1.getJurusan());

        // mhs1.setUmur(-20); // Avoid setting negative age
        System.out.println(mhs1.getUmur());


        mhs1.getNama();
        mhs1.getUmur();
        mhs1.getJurusan();

        Car myCar = new Car();
        System.out.println(myCar.pemilik);
        System.out.println(myCar.jumlahBan);
        System.out.println(myCar.merk);

    }
    
}
