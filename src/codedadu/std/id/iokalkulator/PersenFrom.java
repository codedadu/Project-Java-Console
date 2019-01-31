package codedadu.std.id.iokalkulator;

import java.util.Scanner;

public class PersenFrom extends ClassKalkulator{

    public void hitung_persenfrom() {
        Scanner scan = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("Anda Memilih Opearsi \033[4mPersen From\033[0m");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Nilai X : ");
        nilai_a = scan.nextInt();
        System.out.print("Masukan Nilai Y : ");
        nilai_b = scan.nextInt();
        System.out.println("-------------------------------------------------");
        float hasil = (float) ((nilai_a * 100) / nilai_b);;
        System.out.format("Hasil Persen From dari \033[4m%d persen dari %d\033[0m adalah \033[4m%.2f\033[0m\n", nilai_a, nilai_b, hasil);
    }
}
