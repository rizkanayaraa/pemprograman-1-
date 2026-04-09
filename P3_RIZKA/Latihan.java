package src;
import java.util.Scanner;
public class Latihan {

public static void main (String[] args) {
    Scanner input = new Scanner (System.in);

    // S1
    System.out.print("input kehadiran: ");
    int nilai = input.nextInt();
    System.out.print("input nilai tugas: ");
    int nilai2 = input.nextInt();
    System.out.print("input nilai uts: ");
    int nilai3 = input.nextInt();
    System.out.print("input nilai uas: ");
    int nilai4 = input.nextInt();
    int realsasi = 21;

    //P1
    double bKehadiran = ((double) nilai / realsasi) * 10 / 100;
    double bTugas = (double) nilai2 * 20 /100;
    double bUts = (double) nilai3 * 30 / 100;
    double bUas = (double) nilai4 * 40 / 100;
    double total = bKehadiran + bTugas + bUts + bUas;
    
    //S2
    System.out.println("bobot kehadiran :" + bKehadiran);
    System.out.println("bobot tugas :" + bTugas);
    System.out.println("bobot uts :" + bUts);
    System.out.println("bobot uas :" + bUas);
    System.out.println("total :" + total);
}
}
