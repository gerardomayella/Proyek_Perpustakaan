package pbo.project_perpustakaan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Member {
    private String nama;
    private int nim;
    private int batasPeminjaman = 0;
    private peminjamanKoleksi peminjaman[] = new peminjamanKoleksi[20];
    private int denda = 0;

    public Member(String name, int nim) {
        this.nama = name;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String name) {
        this.nama = name;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String setPeminjamanBarang(Item koleksi) {
        if (batasPeminjaman < peminjaman.length && koleksi.getIsAvailable()) {
            Scanner input = new Scanner(System.in);
            int tanggalPinjam = 0;
            int tanggalKembali = 0;

            while (true) {
                System.out.println("Tanggal peminjaman (1-30): ");
                try {
                    tanggalPinjam = input.nextInt();
                    if (tanggalPinjam < 1 || tanggalPinjam > 30) {
                        System.out.println("Tanggal peminjaman harus antara 1-30");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: input tidak valid");
                    input.next();
                }
            }

            System.out.println("Tanggal kembali (1-30): ");
            while (true) {
                try {
                    tanggalKembali = input.nextInt();
                    if (tanggalKembali < 1 || tanggalKembali > 30) {
                        System.out.println("Tanggal kembali harus antara 1-30");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: input tidak valid");
                    input.next();
                }
            }

            peminjaman[batasPeminjaman] = new peminjamanKoleksi(koleksi, tanggalPinjam, tanggalKembali);
            batasPeminjaman++;
            input.close();
            return "peminjaman berhasil";

        } else {
            return "maaf terjadi kesalahan : mungkin karena batas sudah terpenuhi yaitu 20 koleksi atau koleksi sedang tidak tersedia";
        }
    }

    public String setPengembalianBarang() {
        if (batasPeminjaman == 0) {
            return "belum ada peminjaman";
        } else {
            Scanner input = new Scanner(System.in);
            int pilihan;
            for (int i = batasPeminjaman; i >= 0; i--) {
                System.out.println((i + 1) + " " + peminjaman[i]);
            }
            while (true) {
                System.out.println("pilih koleksi yang ingin anda kembalikan : ");
                try {
                    pilihan = input.nextInt();
                    if (pilihan > 0 && pilihan < batasPeminjaman + 1) {
                        break;
                    } else {
                        System.out.println("maaf inputan anda salah");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("maaf inputan anda salah");
                    input.next();
                }
            }

            int tanggalPengembalian;
            while (true) {
                System.out.println("Tanggal pengembalian (1-30): ");
                try {
                    tanggalPengembalian = input.nextInt();
                    if (tanggalPengembalian >= 1 && tanggalPengembalian <= 30) {
                        break;
                    } else {
                        System.out.println("maaf inputan anda salah");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("maaf inputan anda salah");
                    input.next();
                }
            }

            int tanggalKembali = peminjaman[pilihan - 1].getTanggalKembali();
            int keterlambatan = tanggalPengembalian - tanggalKembali;
            if (keterlambatan > 0) {
                denda += keterlambatan * 1000; // tambah denda dengan total 1000 rupiah per hari
                System.out.println("anda memiliki denda sebesar Rp " + denda);
            }

            peminjaman[pilihan - 1] = null;
            for (int i = pilihan - 1; i < peminjaman.length; i++) {
                if (i == peminjaman.length - 1) {
                    peminjaman[i] = null;
                } else {
                    peminjaman[i] = peminjaman[i + 1];
                }
            }
            input.close();
            System.out.println();
            return "pengembalian berhasil";
        }
    }

    public int getDenda() {
        return denda;
    }
}