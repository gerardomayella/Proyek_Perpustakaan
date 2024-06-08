package pbo.project_perpustakaan;

public class Journal extends Item implements halaman {
    private String volume;
    private String issue;
    private int jumlahHalaman;

    // constructor
    public Journal(String title, String author, String volume, String issue, boolean isAvailable, int jumlahHalaman) {
        super(title, author, isAvailable);
        this.volume = volume;
        this.issue = issue;
        this.jumlahHalaman = jumlahHalaman;
    }

    // getters
    public String getVolume() {
        return volume;
    }

    public String getIssue() {
        return issue;

    }

    // setters
    public void setIssue(String issue) {
        this.issue = issue;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    // display information
    @Override
    public void displayInfo() {
        System.out.println("Informasi Jurnal : ");
        super.displayInfo();
        System.out.println("Volume : " + volume);
        System.out.println("Terbitan : " + issue);
        System.out.println("Jumlah halaman : " + jumlahHalaman);
    }

    @Override
    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
}