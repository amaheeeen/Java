package lat5.arrayobject;

import lat5.Mahasiswa; 

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] students = {
            new Mahasiswa("Budi", 20, 70, 175),  // Error: constructor tidak ada
            new Mahasiswa("Andi", 21, 80, 180),
            new Mahasiswa("Caca", 22, 90, 165)
        };

        for (Mahasiswa student : students) {
            System.out.println(student.getNama());  
        }

        Mahasiswa[] mhs = new Mahasiswa[3];
        mhs[0] = new Mahasiswa();
        mhs[0].setNama("Budi");
        mhs[1] = new Mahasiswa();
        mhs[1].setNama("Andi");
        mhs[2] = new Mahasiswa();
        mhs[2].setNama("Caca");

        for (Mahasiswa m : mhs) {
            System.out.println(m.getNama());
        }
    }
}