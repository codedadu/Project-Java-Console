package codedadu.std.id.iobilangan;

import codedadu.std.id.iobilangan.ClassBilangan;

import java.util.Scanner;

public class ClassOperasiBilanganGanjilGenap extends ClassBilangan {
    Scanner scan = new Scanner(System.in);

    public void generate_bilanganGanjilGenap() {
        if(inp_bilangan % 2 == 0) {
            System.out.println(inp_bilangan + " adalah bilangan GENAP");
        }
        else {
            System.out.println(inp_bilangan + " adalah bilangan GANJIL");
        }
    }

    public void run_processGanjilGenap() {
        System.out.println("Operasi Bilangan Genap Ganjil");
        System.out.println("===========================================================================");
        System.out.println("Bilangan Genap adalah Bilangan yang Habis dibagi dengan 2\nBilangan Ganjil adalah bilangan yang memiliki sisa ketika dibagi dengan 2");
        for (String i="Y"; i.equals("Y") || i.equals("y");) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Masukan Sebuah Bilangan : ");
            int bilangan_put = scan.nextInt();

            inp_bilangan = bilangan_put;

            generate_bilanganGanjilGenap();

            System.out.print("Ingin Proses Bilangan Ganjil Genap Lagi? [Y/T] : ");
            i=scan.next();
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Anda keluar dari Operasi Bilangan Genap & Ganjil, Terima Kasih.");
        System.out.println("===========================================================================");
    }

}

