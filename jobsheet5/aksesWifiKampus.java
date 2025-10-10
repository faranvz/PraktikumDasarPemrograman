package jobsheet5;

import java.util.Scanner;

public class aksesWifiKampus {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sks;
    String pesan;

    System.out.println("--- Akses Wifi Kampus ---");
    System.out.print("Pilih jenis pengguna (Dosen/Mahasiswa): ");
    String jenisPengguna = sc.nextLine().trim();

    if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
        System.out.print("Masukkan Jumlah SKS yang diambil: ");
        sks = sc.nextInt();
        if (sks >= 12) {
            pesan = "Akses wifi diberikan sebagai mahasiswa aktif";
        } else {
            pesan = "Akses ditolak, SKS kurang 12";
        }
    } else if (jenisPengguna.equalsIgnoreCase("Dosen")) {
        pesan = "Akses diberikan sebagai dosen";
    } else {
        pesan = "Akses ditolak";
    }

    System.out.println(pesan);
    }
}
