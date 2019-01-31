package codedadu.std.id;

import codedadu.std.id.ioganjilgenap.ClassBilangan;

import java.util.Scanner;

public class MainBilanganGenapGanjil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ClassBilangan bilangan = new ClassBilangan();

        System.out.println("Informasi Umum");
        System.out.println("===========================================================================");
        System.out.println("Bilangan Genap adalah Bilangan yang Habis dibagi dengan 2\nBilangan Ganjil adalah bilangan yang memiliki sisa ketika dibagi dengan 2");
        for (String i="Y"; i.equals("Y") || i.equals("y");) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.print("Masukan Sebuah Bilangan : ");
            int bilangan_put = scan.nextInt();

            bilangan.inp_bilangan = bilangan_put;

            bilangan.generate_bilangan();

            System.out.print("Apakah Ingin Memilih Lagi Menu? [Y/T] : ");
            i=scan.next();
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Terima Kasih sudah Menggunakan Program Kami:-D");
        System.out.println("===========================================================================");
    }
}
