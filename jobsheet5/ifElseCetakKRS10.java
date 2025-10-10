package jobsheet5;

import java.util.Scanner;
public class ifElseCetakKRS10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Masukkan semester: ");
        int semester = sc.nextInt();
        
    if (semester == 1) {
        System.out.println("Cetak KRS Semester 1");
    } else if (semester == 2) {
        System.out.println("Cetak KRS Semester 2");
    } else {
        System.out.println("Semester tidak valid");
    }
    }
}
