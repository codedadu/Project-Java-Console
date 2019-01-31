package codedadu.std.id.iobiodata;

public class ClassSiswa {
    public String nama_depan_siswa, nama_belakang_siswa, alamat_siswa, no_telp, nis, kelas, jurusan, tanggal_lahir;
    public int umur, tinggi_badan, berat_badan;

    public void deskripsi_lengkap() {
        System.out.println("==============================================");
        System.out.println("Deksripsi Siswa Lengkap");
        System.out.println("==============================================");
        System.out.println("NIS : \033[4m" + nis + "\033[0m");
        System.out.format("Nama Lengkap : \033[4m%s %s", nama_depan_siswa, nama_belakang_siswa + "\033[0m");
        System.out.println("Alamat Siswa : \033[4m" + alamat_siswa + "\033[0m");
        System.out.println("No. Telp : \033[4m" + no_telp + "\033[0m");
        System.out.println("Kelas : \033[4m" + kelas + " " + jurusan + "\033[0m");
        System.out.println("Tanggal Lahir : \033[4m" + tanggal_lahir + "\033[0m");
        System.out.println("Umur : \033[4m" + umur + "\033[0m");
        System.out.println("Tinggi Badan : \033[4m" + tinggi_badan + "\033[0m");
        System.out.println("Berat Badan : \033[4m" + berat_badan + "\033[0m");
        System.out.println("==============================================");
    }

    public void perkenalan_diri() {
        System.out.println("==============================================");
        System.out.format("Hi, Perkenalkan nama saya \033[4m%s %s\033[0m dan saya tinggal di \033[4m%s\033[0m, biasa saya dipanggil dengan " +
                        "\nnama \033[4m%s\033[0m, dan ini adalah kontak saya di nomor (\033[4m%s\033[0m), sekarang saya duduk di kelas \033[4m%s\033[0m \n" +
                        "dan berfokus di jurusan \033[4m%s\033[0m, saya lahir pada \033[4m%s\033[0m, dan umur saya sekarang adalah \033[4m%d\033[0m tahun, dengan \n" +
                        "tinggi badan \033[4m%d\033[0m KG, sedangkan tinggi badan saya adalah \033[4m%d\033[0m CM\n"
                , nama_depan_siswa, nama_belakang_siswa, alamat_siswa, nama_depan_siswa, no_telp, kelas, jurusan,
                tanggal_lahir, umur, tinggi_badan, berat_badan);
        System.out.println("==============================================");
    }

    public void exit_program() {
        System.out.println("==============================================");
        System.out.println("Anda memilih Menu Exit");
        System.out.println("==============================================");
    }
}
