package pbo.project_perpustakaan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Member {
    private String name;
    private int nim;
    private int batasPeminjaman = 0;
    private peminjamanKoleksi peminjaman[] = new peminjamanKoleksi[20];

    public Member(String name, int nim) {
        this.name = name;
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String setPeminjamanBarang(Item koleksi) {
        if (batasPeminjaman < peminjaman.length && (koleksi.getIsAvailable() == true)) {
            Scanner input = new Scanner(System.in);
            System.out.println("Tanggal peminjaman : ");
            String tanggalPinjam = input.nextLine();
            System.out.println("Tanggal kembali : ");
            String tanggalKembali = input.nextLine();

            peminjaman[batasPeminjaman] = new peminjamanKoleksi(koleksi, tanggalPinjam, tanggalKembali);
            batasPeminjaman++;

            return "peminjaman berhasil";
        } else {
            return "maaf terjadi kesalahan : mungkin karena batas sudah terpenuhi yaitu 20 koleksi atau anda b atau barang sedang tidak tersedia";
        }
    }

    public String setPengembalianBarang() {
        Scanner input = new Scanner(System.in);
        if (batasPeminjaman == 0) {
            return "belum ada peminjaman";
        } else {
            for (int i = batasPeminjaman; i >= 0; i--) {
                System.out.println((i + 1) + " " + peminjaman[i]);
            }
            while (true) {
                System.out.println("pilih koleksi yang ingin anda kembalikan : ");
                try {
                    int pilihan = input.nextInt();
                    if (pilihan > 0 && pilihan < batasPeminjaman + 1) {
                        break;
                    } else {
                        System.out.println("maaf inputan anda salah");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("maaf inputan anda salah");
                }
            }

        }
    }

}
