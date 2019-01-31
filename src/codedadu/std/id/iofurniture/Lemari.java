package codedadu.std.id.iofurniture;

public class Lemari extends FurnitureRumah{

    public void info() {
        System.out.println("Ini adalah Objek Lemari");
        nama_furniture = "Lemari Olimpic";
        bahan_furniture = "Kayu";
        harga = 150000;

        tampilkan_deskripsi();
    }

    public void membuka_lemari() {
        System.out.println("Anda Mengakses Lemari untuk Dibuka");
    }
}
