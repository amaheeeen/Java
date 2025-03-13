import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Belajar if-else
        System.out.println("\n ===IF ELSE=== \n");

        boolean x = false;
        if (!x) { // ! adalah negasi 
            System.out.println("Ini adalah blok if");
        } else {
            System.out.println("Ini adalah blok else");
        }

        int a = 10;
        if (a > 5) {
            System.out.println("a lebih besar dari 5");
        } else {
            System.out.println("a lebih kecil dari 5");
        }

        // if-else else-if
        System.out.println("\n ===IF ELSE IF=== \n");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        
        if (nilai > 80) {
            System.out.println("Nilai A");
        } else if (nilai >= 70) {
            System.out.println("Nilai B");
        } else if (nilai > 60) {
            System.out.println("Nilai C");
        } else if (nilai > 50) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
        
        // switch-case
        System.out.println("\n ===SWITCH CASE=== \n");

        int day = 1;
        switch (day) {  
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Hari tidak valid");
                break;
            }
        
        // switch-case dengan string
        System.out.println("\n ===SWITCH CASE STRING=== \n");

        String dayName = "Senin";
        switch (dayName) {
            case "Senin":
                System.out.println("1");
                break;
            case "Selasa":
                System.out.println("2");
                break;
            case "Rabu":
                System.out.println("3");
                break;
            case "Kamis":
                System.out.println("4");
                break;
            case "Jumat":
                System.out.println("5");
                break;
            case "Sabtu":
                System.out.println("6");
                break;
            case "Minggu":
                System.out.println("7");
                break;
            default:
                System.out.println("Hari tidak valid");
                break;
        }

        // ternary operator
        System.out.println("\n ===TERNARY OPERATOR=== \n");

        int bilangan = 5;
        if (bilangan % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

        String hasil = (bilangan % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(hasil);

        // looping
        // 4 jenis looping : for loop, while loop, do while, foreach

        // for loop 
        System.out.println("\n ===FOR LOOP=== \n");

        for (int i = 0; i < 5; i++) {
            System.out.println("Perulangan ke-" + (i + 1));
        }

        // While loop 
        System.out.println("\n ===WHILE LOOP=== \n");

        int i = 0;
        while (i < 5) {
            System.out.println("Perulangan ke-" + (i+1));
            i++;
        }

        // do while loop
        System.out.println("\n ===DO WHILE LOOP=== \n");

        int j = 0;
        do {
            System.out.println("Perulangan ke-" + (j+1));
            j++;
        } while (j < 5);

        // foreach
        System.out.println("\n ===FOREACH LOOP=== \n");

        int number [] = {1, 2, 3, 4, 5};
        for (int num : number) {
            System.out.println(num);
        }
        
        // break dan continue
        // break 
        System.out.println("\n ===BREAK=== \n");

        for (int k = 0; k < 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println("Perulangan ke-" + (k+1));
        }

        // continue
        System.out.println("\n ===CONTINUE=== \n");

        for (int l = 0; l < 5; l++) {
            if (l == 3) {
                continue;
            }
            System.out.println("Perulangan ke-" + (l+1));
        }

        // Latihan 
        System.out.println("\n ===LATIHAN=== \n");

        // while (true) {
        //     System.out.println("Pilih Menu: ");
        //     System.out.println("1. Menu 1");
        //     System.out.println("2. Menu 2");
        //     System.out.println("0. Keluar");

        //     Scanner.input = new Scanner(System.in);Scanner input = new Scanner(System.in);
        //     int menu = input.nextInt();
        //     switch (menu) {
        //         case 1:
        //             System.out.println("Anda memilih menu 1");
        //             break;
        //         case 2:
        //             System.out.println("Anda memilih menu 2");
        //             break;
        //         case 0:
        //             System.out.println("Anda keluar dari program");
        //             System.exit(0);
        //             break;
        //         default:
        //             System.out.println("Menu tidak valid");
        //             break;


        //     }
        // }

        // array 
        System.out.println("\n ===ARRAY=== \n");

        int [] numbers = {1, 2, 3, 4, 5};
        // deklarasi array bisa dilakukan per karakter/angka
        // int [] numbers = new int[5];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[2] = 3;
        // numbers[3] = 4;
        // numbers[4] = 5;

        System.out.println(numbers[2]);
        numbers[2] = 10;
        System.out.println(numbers[2]);
        System.out.println("panjang array: " + numbers.length);

        


        input.close();
    }
}
