package jobsheet5;

import java.util.Scanner;
public class ifCetakKRS10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/flase): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas
        ? "KRS ditampilkan. Silakan cetak KRS."
        : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";

        System.out.println(pesan);

    }
}
