package tugas;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;
        double total = 0;
        int jumlahData = 0;

        System.out.println("==========================================");
        System.out.println("   PROGRAM TOTAL NILAI MAHASISWA         ");
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

            total += nilai;
            jumlahData++;
            System.out.println(">> Nilai [ " + nilai + " ] berhasil disimpan.");

            System.out.print("\nApakah Anda ingin menginput lagi? (y/t): ");
            pilihan = input.nextLine();

        } while (!pilihan.equalsIgnoreCase("t"));

        double rataRata = (jumlahData > 0) ? total / jumlahData : 0;

        System.out.println("\n==========================================");
        System.out.println("            DATA MAHASISWA                ");
        System.out.println("==========================================");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("==========================================");
        System.out.println("TOTAL NILAI KESELURUHAN : " + total);
        System.out.println("JUMLAH DATA             : " + jumlahData);
        System.out.println("RATA-RATA NILAI         : " + rataRata);
        System.out.println("==========================================");
        System.out.println("      TERIMA KASIH - PROGRAM SELESAI      ");
        System.out.println("==========================================");

        input.close();
    }
}
