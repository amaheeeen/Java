package lat5;

public class Mahasiswa {

    // variabel instace
    String nama = "Budi";
    int umur = 20;

    // variabel static
    static String universitas = "Universitas Pertamina";

    public Mahasiswa(){
        
    }
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    
    

    public void tampilkanInfo(){
        // variabel lokal
        // String nama = "Budi";
        System.out.println(Mahasiswa.universitas);
        System.out.println(nama);
    }

    public void sayHello (String nama) {
        System.out.println("Nama: " + nama);
    }
    
    // String nama2 = "Andre";
    public String sayHello2 (String nama, int umur, boolean isLulus) {
        return "Nama saya " + nama + " , Umur saya " + umur + " Boolean: " + isLulus;
    }
    
    // public void sayHello2 (this.nama) {
    //     System.out.println("Nama: " + nama);
    // }
    

}