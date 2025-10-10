package jobsheet5;

import java.util.Scanner;

public class sistemPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- SISTEM PERPUSTAKAAN ---");
        System.out.println("Apakah anda membawa KTM? (true/flase): ");
        boolean kartuMahasiswa = sc.nextBoolean();

        System.out.println("Apakah anda sudah regristrasi online? (true/flase): ");
        boolean regristrasiOnline = sc.nextBoolean();

        if (kartuMahasiswa && regristrasiOnline) {
            System.out.println("Boleh masuk");
        } else {
            System.out.println("Tidak boleh masuk");
        }

    }
}
