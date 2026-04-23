package tugas;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   PROGRAM HITUNG NILAI AKHIR (WEIGHTED)  ");
        System.out.println("==========================================");

        System.out.print("Masukkan Nama       : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM        : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama Prodi : ");
        String prodi = input.nextLine();

        System.out.println("\n--- Input Nilai ---");
        System.out.print("Masukkan Jumlah Absensi (Maks 21): ");
        int absen = input.nextInt();
        System.out.print("Masukkan Nilai Tugas             : ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS               : ");
        double uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS               : ");
        double uas = input.nextDouble();

        double nilaiAbsen = (absen / 21.0) * 10;
        double nilaiTugas = tugas * 0.2;
        double nilaiUTS = uts * 0.3;
        double nilaiUAS = uas * 0.4;
        double nilaiAkhir = nilaiAbsen + nilaiTugas + nilaiUTS + nilaiUAS;

        System.out.println("\n==========================================");
        System.out.println("            DATA MAHASISWA                ");
        System.out.println("==========================================");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("------------------------------------------");
        System.out.printf("Nilai Absensi (10%%) : %.2f\n", nilaiAbsen);
        System.out.printf("Nilai Tugas   (20%%) : %.2f\n", nilaiTugas);
        System.out.printf("Nilai UTS     (30%%) : %.2f\n", nilaiUTS);
        System.out.printf("Nilai UAS     (40%%) : %.2f\n", nilaiUAS);
        System.out.println("------------------------------------------");
        System.out.printf("NILAI AKHIR         : %.2f\n", nilaiAkhir);
        System.out.println("==========================================");
        System.out.println("      TERIMA KASIH - PROGRAM SELESAI      ");
        System.out.println("==========================================");

        input.close();
    }
}
