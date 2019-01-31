package codedadu.std.id.iokalkulator;

import java.util.Scanner;

public class Penjumlahan extends ClassKalkulator {

    public void hitung_penjumlahan() {
        Scanner scan = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("Anda Memilih Opearsi \033[4mPenjumlahan\033[0m");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Nilai X : ");
        nilai_a = scan.nextInt();
        System.out.print("Masukan Nilai Y : ");
        nilai_b = scan.nextInt();
        System.out.println("-------------------------------------------------");
        int hasil = nilai_a + nilai_b;
        System.out.format("Hasil Penjumlahan dari \033[4m%d ditambah %d\033[0m adalah \033[4m%d\033[0m\n", nilai_a, nilai_b, hasil);
    }
}
