import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int umur = 20;
        double ipk = 4.0;
        char inisial = 'F';
        String nama = "Fulan";
        System.out.println("nama : " + nama + "Umur :" + umur + "IPK :" + ipk + "Inisial :" + inisial);

        byte nomorByte = -128;
        short nomorShort = 32767;
        long nomorLong = 1000000000;
        float phi = 3_14f;

        System.out.println(nomorByte);
        System.out.println(nomorShort);
        System.out.println(nomorLong);
        System.out.println(phi);

        boolean isJavaFun = true;

        System.err.println(isJavaFun);

        char var1 = 65;

        System.out.println(var1);

        String firstName = "Benony";
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());

        
        System.out.println("masukkan nama anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Masukkan umur anda: ");
        int age = input.nextInt();
        System.out.println("Masukkan tinggi badan anda: ");
        double height = input.nextDouble();

        System.out.println("\n Data yang anda masukkan: ");
        System.out.println("\n Nama anda: " + name);
        System.out.println("\n Umur anda: " + age);
        System.out.println("\n Tinggi badan anda: " + height);

        input.close();



    }
}
