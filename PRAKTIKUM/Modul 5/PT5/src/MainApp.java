class Person {
    private String name;
    private int age;
    
    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// KESALAHAN 1: Employee adalah inner class non-static Person.
// PERBAIKAN: Pindahkan Employee keluar dari class Person.
class Employee extends Person {
    private double salary;

    public Employee(String n, int a, double s) {
        // KESALAHAN 2: Tidak memanggil konstruktor superclass (Person).
        // PERBAIKAN: Panggil super(n, a) untuk inisialisasi name dan age.
        super(n, a); 
        salary = s;
    }

    public void showSalary() {
        // KESALAHAN 3: Tanda koma (,) bukan titik koma (;).
        // PERBAIKAN: Ganti tanda koma dengan titik koma.
        System.out.println("Salary: " + salary); 
    }
}

public class MainApp {
    public static void main(String[] args) {
        // KESALAHAN 4: 
        // - Employee tidak bisa diinstansiasi tanpa objek Person (karena sebelumnya inner class).
        // - Nilai 5.000 tidak valid (harus 5000.0).
        // PERBAIKAN: 
        // - Jadikan Employee class terpisah.
        // - Ganti 5.000 menjadi 5000.0.
        Employee emp = new Employee("Alice", 25, 5000.0); 
        
        // KESALAHAN 5: Penulisan pemanggilan method tanpa titik (emp display()).
        // PERBAIKAN: Tambahkan titik (emp.display()).
        emp.display();   
        emp.showSalary(); 
    }
}