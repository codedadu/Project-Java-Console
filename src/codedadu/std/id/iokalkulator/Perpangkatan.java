package codedadu.std.id.iokalkulator;

import java.util.Scanner;

public class Perpangkatan extends ClassKalkulator{

    public void hitung_perpangkatan() {
        Scanner scan = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("Anda Memilih Opearsi \033[4mPerpangkatan\033[0m");
        System.out.println("-------------------------------------------------");
        System.out.print("Bilangan : ");
        nilai_a = scan.nextInt();
        System.out.print("Pangkat : ");
        nilai_b = scan.nextInt();
        System.out.println("-------------------------------------------------");
        double hasil = Math.pow(nilai_a, nilai_b);
        System.out.format("Hasil Perpangkatan dari \033[4m%d pangkat %d\033[0m adalah \033[4m%.2f\033[0m\n", nilai_a, nilai_b, hasil);
    }
}
