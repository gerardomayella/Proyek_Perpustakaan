/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.project_perpustakaan;

/**
 *
 * @author Gerardo Ardianta
 */
public class peminjamanKoleksi {
    private int tanggalPinjam;
    private int tanggalKembali;
    private Item koleksi;

    public peminjamanKoleksi(Item koleksi, int tanggalPeminjaman, int tanggalKembali) {
        this.koleksi = koleksi;
        this.tanggalKembali = tanggalKembali;
        this.tanggalPinjam = tanggalPeminjaman;
    }

    public void setTanggalPinjam(int tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public void setTanggalKembali(int tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public void setKoleksi(Item koleksi) {
        this.koleksi = koleksi;
    }

    public int getTanggalPinjam() {
        return tanggalPinjam;
    }

    public int getTanggalKembali() {
        return tanggalKembali;
    }

    public Item getKoleksi() {
        return koleksi;
    }
}