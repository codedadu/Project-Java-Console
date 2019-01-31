package codedadu.std.id;

import codedadu.std.id.iokalkulator.*;

import java.util.Scanner;

public class MainKalkulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Penjumlahan penjumlahan = new Penjumlahan();
        Perkalian perkalian = new Perkalian();
        Pembagian pembagian = new Pembagian();
        Pengurangan pengurangan = new Pengurangan();
        Perpangkatan perpangkatan = new Perpangkatan();
        PersenFrom persenFrom = new PersenFrom();

        for (String i="Y"; i.equals("Y") || i.equals("y");) {
            System.out.println("=================================================");
            System.out.println("Program Aplikasi Kalkukaltor");
            System.out.println("-------------------------------------------------");
            System.out.println("1. Operasi Hitung Penjumlahan");
            System.out.println("2. Operasi Hitung Perkalian");
            System.out.println("3. Operasi Hitung Pembagian");
            System.out.println("4. Operasi Hitung Pengurangan");
            System.out.println("5. Operasi Hitung Perpangkatan");
            System.out.println("6. Operasi Hitung Persen Dari");
            System.out.println("0. Exit");
            System.out.println("=================================================");
            System.out.print("Pilih Operasi [0-6] : ");
            int pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    penjumlahan.hitung_penjumlahan();
                    break;
                case 2:
                    perkalian.hitung_perkalian();
                    break;
                case 3:
                    pembagian.hitung_pembagian();
                    break;
                case 4:
                    pengurangan.hitung_pengurangan();
                    break;
                case 5:
                    perpangkatan.hitung_perpangkatan();
                    break;
                case 6:
                    persenFrom.hitung_persenfrom();
                    break;
                case 0:
                    System.out.println("Anda Keluar dari Program!");
                    break;

                    default:
                        System.out.println("-------------------------------------------------");
                        System.out.println("Maaf! Pilihan anda tidak ada..\nSilahkan pilih nomor sesuai pada Menu");
                        break;
            }

            System.out.println("-------------------------------------------------");
            System.out.print("Apakah Ingin Memilih Operasi Lain? [Y/T] : ");
            i=scan.next();
        }
        System.out.println("=================================================");
        System.out.println("Terima Kasih sudah Menggunakan Program Kami:-D");
        System.out.println("=================================================");
    }
}
