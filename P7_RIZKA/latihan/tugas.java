package P7_RIZKA;

import java.text.BreakIterator;
import java.util.Scanner;

public class tugas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan pilihan 1/2: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1){
            System.out.println("Pilih reguler A/B/CK/CS :");
            String pilih = input.nextLine();

            switch (pilih) {
                case "A":
                    System.out.println("Reg A");
                    break;
                case "B":
                    System.out.println("Reg B");
                    break;
                case "CK":
                    System.out.println("Reg CK");
                    break;
                case "CS":
                    System.out.println("Reg CS");
                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
                    break;
            }

            System.out.println("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.println("Masukkan Prodi: ");
            String prodi = input.nextLine();


            System.out.println("============================================================");
            System.out.println("Nama: " + nama + "\nprodi: " + prodi + "\nReguler: " + pilih);
            System.out.println("============================================================");

        } else if (pilihan == 2){
            System.out.println("Anda keluar");
        }


    }
    
}
