package P7_RIZKA;

import java.util.Scanner;

public class latihan {
    public static void main(String[] args){
      Scanner input = new Scanner (System.in);

      System.out.println("Masukan pilihan Masuk/Keluar: ");
      String mulai = input.next();

      if (mulai.equalsIgnoreCase("Masuk")) {

      String menu = "";
      System.out.println("Pilih Menu Kopi: ");
      String pilihan = input.next();
        switch (pilihan) {
          case "Americano":
            menu = "Americano";  
            break; 
          case "Capucino":
            menu = "Capucino";
            break;
          case "Matcha":
            menu = "Matcha";
            break;
          case "Keluar":
            input.close();
          default:
            break;
        }
        
        System.out.println("Masukan Nama: ");
        String nama = input.next();
        
        System.out.println("No Pesanan: ");
        int pesan = input.nextInt();
        
        System.out.println("=======================================");
        System.out.println("Nama: " + nama);
        System.out.println("Pesanan: " + pesan);
        System.out.println("Menu: " + menu);
        System.out.println("=======================================");

      } else {
        System.out.println("Anda Keluar");
      }
      input.close();

  }
} 