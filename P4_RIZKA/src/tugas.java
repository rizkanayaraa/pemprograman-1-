package src;
import java.util.Scanner;
public class tugas{

public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("=========");
    System.out.println("Sistem Menghitung Pengeluaran Dalam Seminggu");
    System.out.println("=========");

    // Hari 1
    System.out.println("======== hari 1 ========");
    System.out.print("Pengeluaran transportasi: ");
    int t1 = input.nextInt();
    System.out.print("Pengeluaran makan: ");
    int m1 = input.nextInt();
    System.out.print("Pengeluaran belanja: ");
    int b1 = input.nextInt();

    // Hari 2
    System.out.println("======== Hari 2 ========");
    System.out.print("Pengeluaran transportasi: ");
    int t2 = input.nextInt();
    System.out.print("Pengeluaran makan: ");
    int m2 = input.nextInt();
    System.out.print("Pengeluaran belanja: ");
    int b2 = input.nextInt();

    // Hari 3
    System.out.println("======== Hari 3 ========");
    System.out.print("Pengeluaran transportasi: ");
    int t3 = input.nextInt();
    System.out.print("Pengeluaran makan: ");
    int m3 = input.nextInt();
    System.out.print("Pengeluaran belanja: ");
    int b3 = input.nextInt();

    // Hari 4
    System.out.println("======== Hari 4 ========");
    System.out.print("Pengeluaran transportasi:");
    int t4 = input.nextInt();
    System.out.print("Pengeluaran makan: ");
    int m4 = input.nextInt();
    System.out.print("Pengeluaran belanja: ");
    int b4 = input.nextInt();

    // hari 5
    System.out.println("======== Hari 5 ========");
    System.out.print("Pengeluaran transportasi: ");
    int t5 = input.nextInt();
    System.out.print("Pengeluaran makan: ");
    int m5 = input.nextInt();
    System.out.print("Pengeluaran belanja: ");
    int b5 = input.nextInt();

    // Hari 6
    System.out.println("======== Hari 6 ========");
    System.out.print("Pengeluaran transportasi: ");
    int t6 = input.nextInt();
    System.out.print("Pengeluaran makan: ");
    int m6 = input.nextInt();
    System.out.print("Pengeluaran belanja: ");
    int b6 = input.nextInt();

    // Hari 7
    System.out.println("======== Hari 7 ========");
    System.out.print("Pengeluran transportasi: ");
    int t7 = input.nextInt();
    System.out.print("Pengeluaran makan: ");
    int m7 = input.nextInt();
    System.out.print("Pengeluaran belanja: ");
    int b7 = input.nextInt();

    // Total
    int totalTrans = t1 + t2 + t3 + t4 + t5 + t6 + t7;
    int totalMakan = m1 + m2 + m3 + m4 + m5 + m6 + m7;
    int totalBelanja = b1 + b2 + b3 + b4 + b5 + b6 + b7;
    int total = totalTrans + totalMakan + totalBelanja;

    System.out.println("======== Total Pengeluaran ========");
    System.out.println(" Total pengeluaran: " + total);
    System.out.println("===================================");

    // Presentase:
    double Makan = (totalMakan * 100.0) / total;
    double Transportasi = (totalTrans * 100.0) / total ;
    double Belanja = (totalBelanja * 100.0) / total;

    System.out.println("============ Presentase ============");
    System.out.println("Presentase makan: " + Makan);
    System.out.println("Presentase transportasi: " + Transportasi);
    System.out.println("Presentase belanja: " + Belanja);
    System.out.println("====================================");
}
}