package codedadu.std.id.iobilangan;

import codedadu.std.id.iobilangan.ClassBilangan;

import java.util.Scanner;

public class ClassOperasiBilanganNegatifPositif extends ClassBilangan {
    Scanner scan = new Scanner(System.in);

    public void generate_bilanganPositifNegatif() {
        if (inp_bilangan < 0){
            System.out.println("Bilangan " + inp_bilangan + " adalah bilangan NEGATIF");
        }
        if (inp_bilangan > 0){
            System.out.println("Bilangan " + inp_bilangan + " adalah bilangan POSITIF");
        }
        if (inp_bilangan == 0){
            System.out.println("Bilangan " + inp_bilangan + " adalah bukan bilangan POSITIF atau NEGATIF");
        }
    }

    public void run_processPositifNegatif() {
        System.out.println("Operasi Bilangan Positif & Negatif");
        System.out.println("===========================================================================");
        System.out.println("\033[4mBilangan bulat Negatif\033[0m memiliki ciri ciri nya didepan bilangan itu terdapat \ntanda - , misalnya : -1 (dibaca negatif satu), -2 (dibaca negatif dua), -15\n(dibaca negatif lima belas) dsb\n" +
                "\033[4mBilangan bulat Nol\033[0m, adalah hanya ada satu bilangan bulat Nol, yaitu 0 \n(dibaca nol, bukan kosong)\n" +
                "\033[4mBilangan Bulat Positif\033[0m, memiliki ciri ciri nya didepan bilangan tersebut \nterdapat tanda +, misalnya +1 (dibaca Positif satu), +2 (dibaca Positif dua), \n+15 (dibaca Positif lima belas), dsb. tetapi kemudian tanda + itu tidak \ndituliskan, ini berarti bahwa bilangan positif tidak menggunakan tanda +, \ntetapi cukup ditulis bilangannya saja, maka bilangan bulat selain NOL yang \ntidak terdapat tanda - ataupun +,  itu diartikan sebagai bilangan bulat \npositif, misalnya : 1 (dibaca satu/diartikan positif satu), 2 (dibaca dua\n/diartikan positif dua), 15 (dibaca lima belas/diartikan positif lima belas)\n, dsb.");
        for (String i="Y"; i.equals("Y") || i.equals("y");) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Masukan Sebuah Bilangan : ");
            int bilangan_put = scan.nextInt();

            inp_bilangan = bilangan_put;

            generate_bilanganPositifNegatif();

            System.out.print("Ingin Proses Bilangan Positif-Negatif Lagi? [Y/T] : ");
            i=scan.next();
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Anda keluar dari Operasi Bilangan Positif & Negatif, Terima Kasih.");
        System.out.println("===========================================================================");
    }
}
