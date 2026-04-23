package tugas;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;

        System.out.println("==========================================");
        System.out.println("   PROGRAM NILAI MAHASISWA (P9 MIQDAD)    ");
        System.out.println("==========================================");

        System.out.print("Masukkan Nama       : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM        : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama Prodi : ");
        String prodi = input.nextLine();

        do {
            System.out.print("\nMasukkan nilai mahasiswa: ");
            double nilai = input.nextDouble();
            input.nextLine();

            System.out.println(">> Nilai yang Anda masukkan: [ " + nilai + " ]");
            System.out.print("\nApakah Anda ingin menginput lagi? (y/t): ");
            pilihan = input.nextLine();

        } while (!pilihan.equalsIgnoreCase("t"));

        System.out.println("\n==========================================");
        System.out.println("            DATA MAHASISWA                ");
        System.out.println("==========================================");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("==========================================");
        System.out.println("      TERIMA KASIH - PROGRAM SELESAI      ");
        System.out.println("==========================================");

        input.close();
    }
}
