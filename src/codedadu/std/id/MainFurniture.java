package codedadu.std.id;


import codedadu.std.id.iofurniture.Bangku;
import codedadu.std.id.iofurniture.Lemari;

import java.util.Scanner;

public class MainFurniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Membuat Sebuah Objek Instance
        Lemari lemari = new Lemari();
        Bangku bangku = new Bangku();

        System.out.println("Pilih Furniture Anda :");
        System.out.println("1. Lemari");
        System.out.println("2. Bangku");
        System.out.println("3. Dipan");
        System.out.print("Masukan Pilihan Anda : ");
        int pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                lemari.info();
                lemari.membuka_lemari();
                break;
            case 2:
                bangku.info();
                bangku.ganti_bantalan();
                break;
            case 3:
                System.out.println("Service belum ada");
                break;

                default:
                    System.out.println("Pilihan anda gak ada!");
                    break;
        }

    }
}
