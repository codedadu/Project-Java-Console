package codedadu.std.id.iowarungmakan;

import java.util.Scanner;

public class ClassKasir extends ClassWarungMakan{

    Scanner inputan = new Scanner(System.in);

    public void cek_kasir () {
        System.out.print("Silahkan Masukan [Kode Kasir] : ");
        kode_kasir = inputan.nextLine();

        switch (kode_kasir) {
            case "K0001":
                nama_kasir = "Hendri Gunawan";
                pilih_menu();
                break;
            case "K0002":
                nama_kasir = "Fina Rahmawati";
                pilih_menu();
                break;
            case "K0003":
                nama_kasir = "Suci Ghina Putri";
                pilih_menu();
                break;
            case "K0004":
                nama_kasir = "Sufyan Alfarashy";
                pilih_menu();
                break;
            case "K0005":
                nama_kasir = "Indah Dian Putri Sekar";
                pilih_menu();
                break;
            case "K0006":
                nama_kasir = "Lani Kurniawan";
                pilih_menu();
                break;

                default:
                    nama_kasir = "Maaf!, Data Kasir Tidak dapat Diidentifikasi.";
                    break;
        }
    }

    public void pilih_menu() {
        System.out.println("--------------------------------------------");
        System.out.println("Login Kasir : " + nama_kasir);
    }
}
