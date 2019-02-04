package codedadu.std.id;

import codedadu.std.id.iobilangan.ClassOperasiBilanganGanjilGenap;
import codedadu.std.id.iobilangan.ClassOperasiBilanganNegatifPositif;

import java.util.Scanner;

public class MainBilangan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ClassOperasiBilanganGanjilGenap bilanganGanjilGenap = new ClassOperasiBilanganGanjilGenap();
        ClassOperasiBilanganNegatifPositif bilanganNegatifPositif = new ClassOperasiBilanganNegatifPositif();

        for (String i="Y"; i.equals("Y") || i.equals("y");) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Pilih Program Aplikasi");
            System.out.println("===========================================================================");
            System.out.println("1. Operasi Bilangan Ganjil-Genap");
            System.out.println("2. Operasi Bilangan Positif-Negatif");
            System.out.println("0. Keluar");
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Pilih Program [0-2] : ");
            int pilih_program = scan.nextInt();
            System.out.println("===========================================================================");

            if (pilih_program == 1) {
                bilanganGanjilGenap.run_processGanjilGenap();
            } else if (pilih_program == 2) {
                bilanganNegatifPositif.run_processPositifNegatif();
            } else {
                System.out.println("Pilihan Menu Anda Tidak Tersedia dalam List Menu!");
                System.out.println("===========================================================================");
            }

            System.out.print("Ingin Memilih Menu Program Lagi? [Y/T] : ");
            i=scan.next();
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Anda Keluar dari Program!, Terima Kasih sudah Menggunakan Program Kami:-D");
        System.out.println("===========================================================================");
    }
}
