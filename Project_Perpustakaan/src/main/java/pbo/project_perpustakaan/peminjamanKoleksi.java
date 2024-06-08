/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.project_perpustakaan;

/**
 *
 * @author Gerardo Ardianta
 */

public class peminjamanKoleksi {
    private String tanggalPinjam;
    private String tanggalKembali;
    private Item koleksi;

    public peminjamanKoleksi(Item koleksi, String tanggalPeminjaman, String tanggalKembali) {
        this.koleksi = koleksi;
        this.tanggalKembali = tanggalKembali;
        this.tanggalPinjam = tanggalPeminjaman;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public void setKoleksi(Item koleksi) {
        this.koleksi = koleksi;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public Item getKoleksi() {
        return koleksi;
    }
}
