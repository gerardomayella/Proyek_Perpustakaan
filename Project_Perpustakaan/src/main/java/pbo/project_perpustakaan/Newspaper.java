package pbo.project_perpustakaan;

public class Newspaper extends Item implements halaman {
    private String date;
    private int jumlahHalaman;

    public Newspaper(String title, String author, String date, int jumlahHalaman, boolean isAvailable) {
        super(title, author, isAvailable);
        this.date = date;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getDate() {
        return date;
    }

    @Override
    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void displayInfo() {
        System.out.println("Newspaper information : ");
        super.displayInfo();
        System.out.println("Date of issue : " + date);
        System.out.println("Jumlah Halaman : " + jumlahHalaman);
    }

}
