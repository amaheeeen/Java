package lat5.enkapsulasi;

public class Car {
    // private String pemilik;
    private String merk;
    public int kapasitas;
    protected int jumlahBan;

    // Tambahkan getter/setter
    public String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
}