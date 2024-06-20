package pbo.project_perpustakaan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Member {
    public static Scanner input = new Scanner(System.in);
    private String nama;
    private int nim;
    private int batasPeminjaman = 0;

    private peminjamanKoleksi peminjaman[] = new peminjamanKoleksi[20];
    private int denda = 0;

    public Member(String name, int nim) {
        this.nama = name;
        this.nim = nim;
        for (int i = 0; i < peminjaman.length; i++) {
            peminjaman[i] = new peminjamanKoleksi(null, 0, 0);
        }
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

        if (batasPeminjaman < peminjaman.length || koleksi.getIsAvailable()) {

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
                    input.nextLine();
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
                    input.nextLine();
                }
            }

            peminjaman[batasPeminjaman] = new peminjamanKoleksi(koleksi, tanggalPinjam, tanggalKembali);
            batasPeminjaman++;
            return "peminjaman berhasil";

        } else {
            return "maaf terjadi kesalahan : mungkin karena batas sudah terpenuhi yaitu 20 koleksi atau koleksi sedang tidak tersedia";
        }
    }

    public Item setPengembalianBarang() {
        if (batasPeminjaman == 0) {
            System.out.println("belum ada peminjaman");
            return null;
        } else {
            int pilihan;
            for (int i = 0; i < batasPeminjaman; i++) {
                System.out.println((i + 1) + ". " + peminjaman[i].getKoleksi().getTitle());
            }
            while (true) {
                System.out.println("pilih koleksi yang ingin anda kembalikan (angka) : ");
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
            Item koleksiYangDikembalikan = peminjaman[pilihan - 1].getKoleksi();
            peminjaman[pilihan - 1].setKoleksi(null);
            peminjaman[pilihan - 1].setTanggalKembali(0);
            peminjaman[pilihan - 1].setTanggalPinjam(0);
            for (int i = pilihan - 1; i < peminjaman.length; i++) {
                if (i == peminjaman.length - 1) {
                    peminjaman[i].setKoleksi(null);
                    peminjaman[i].setTanggalKembali(0);
                    peminjaman[i].setTanggalPinjam(0);
                } else {
                    peminjaman[i].setKoleksi(peminjaman[i + 1].getKoleksi());
                    peminjaman[i].setTanggalKembali(peminjaman[i + 1].getTanggalKembali());
                    peminjaman[i].setTanggalPinjam(peminjaman[i + 1].getTanggalKembali());
                }
            }

            System.out.println();
            batasPeminjaman--;
            System.out.println("pengembalian berhasil");
            return koleksiYangDikembalikan;
        }
    }

    public int getDenda() {
        return denda;
    }

    public void getInfoMember() {
        System.out.println("Nama member : " + getNama());
        System.out.println("NIM member : " + getNim());
        System.out.println("Denda sekarang : Rp " + getDenda());
        System.out.println("Koleksi yang dipinjam : ");
        if (batasPeminjaman == 0) {
            System.out.println("slot peminjaman masih kosong");
        } else {
            for (int i = 0; i < batasPeminjaman; i++) {
                System.out.println((i + 1) + ". " + peminjaman[i].getKoleksi().getTitle());
            }
        }
        System.out.println();
    }
}