package codedadu.std.id;

import codedadu.std.id.iobiodata.ClassSiswa;

import java.util.Scanner;

public class MainBiodata {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ClassSiswa siswa = new ClassSiswa();

        System.out.println("Masukan Data Siswa");
        System.out.println("==============================================");
        System.out.print("Masukan NIS : ");
        String n_i = scan.nextLine();
        System.out.print("Masukan Nama Depan : ");
        String n_d = scan.nextLine();
        System.out.print("Masukan Nama Belakang : ");
        String n_b = scan.nextLine();
        System.out.print("Masukan No. Telp : ");
        String n_t = scan.nextLine();
        System.out.print("Masukan Alamat : ");
        String a_s = scan.nextLine();
        System.out.print("Masukan Kelas : ");
        String k_s = scan.nextLine();
        System.out.print("Masukan Jurusan : ");
        String j_s = scan.nextLine();
        System.out.print("Masukan Tanggal Lahir [Ex: 21, Oktober 1994] : ");
        String t_l = scan.nextLine();
        System.out.print("Masukan Umur : ");
        int u_s = scan.nextInt();
        System.out.print("Masukan Berat Badan : ");
        int bb_s = scan.nextInt();
        System.out.print("Masukan Tinggi Badan : ");
        int tb_s = scan.nextInt();

        siswa.nis = n_i;
        siswa.nama_depan_siswa = n_d;
        siswa.nama_belakang_siswa = n_b;
        siswa.no_telp = n_t;
        siswa.alamat_siswa = a_s;
        siswa.kelas = k_s;
        siswa.jurusan = j_s;
        siswa.tanggal_lahir = t_l;
        siswa.umur = u_s;
        siswa.berat_badan = bb_s;
        siswa.tinggi_badan = tb_s;

        for (String i="Y"; i.equals("Y") || i.equals("y");) {
            System.out.println("==============================================");
            System.out.println("Pilih Opsi Menu Aplikasi");
            System.out.println("----------------------------------------------");
            System.out.println("1. Menampilkan Deskripsi Lengkap Siswa");
            System.out.println("2. Memperkenalkan Diri");
            System.out.println("0. Keluar Dari Program");
            System.out.println("==============================================");
            System.out.print("Masukan Pilihan [0-2] : ");
            int pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    siswa.deskripsi_lengkap();
                    break;
                case 2:
                    siswa.perkenalan_diri();
                    break;
                case 0:
                    siswa.exit_program();
                    break;

                    default:
                        System.out.println("Maaf! pilihan anda tidak ada!....");
                        break;
            }

            System.out.print("Apakah Ingin Memilih Lagi Menu? [Y/T] : ");
            i=scan.next();
        }
        System.out.println("Terima Kasih sudah Menggunakan Program Kami:-D");
        System.out.println("==============================================");
    }
}