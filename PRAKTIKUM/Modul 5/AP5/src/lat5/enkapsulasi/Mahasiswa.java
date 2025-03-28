package lat5.enkapsulasi;

public class Mahasiswa {
    private String nama = "Budi";
    private int umur;
    private String jurusan;

    // method setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // method getter
    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        
        if(umur >= 0){
            this.umur = umur;
        } else {
            System.out.println("Umur tidak boleh negatif");
        }
    }

    public int getUmur() {
        return umur;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }
    
}
