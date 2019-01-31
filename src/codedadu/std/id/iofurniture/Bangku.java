package codedadu.std.id.iofurniture;

public class Bangku extends FurnitureRumah{

    public void info() {
        System.out.println("Ini adalah Objek Bangku");
        nama_furniture = "Bangku Goyang";
        bahan_furniture = "Kayu";
        harga = 13990000;
        String kelebihan = "Dapat Terbang";
        System.out.println(kelebihan);

        tampilkan_deskripsi();
    }

    public void ganti_bantalan() {
        System.out.println("Anda Mengakses Bangku bisa Mengganti Bantalan");
    }

}
