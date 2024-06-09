package pbo.project_perpustakaan;

public class Magazine extends Item implements halaman {
    private String edition;
    private int jumlahHalaman;

    public Magazine(String title, String author, String edition, boolean isAvailable, int jumlahHalaman) {
        super(title, author, isAvailable);
        this.edition = edition;
        this.jumlahHalaman = jumlahHalaman;
    }

    // getter
    public String getEdition() {
        return edition;
    }

    // setter
    public void setEdition(String edition) {
        this.edition = edition;
    }

    // display information
    @Override
    public void displayInfo() {
        System.out.println("Magazine information : ");
        super.displayInfo();
        System.out.println("Edition : " + edition);
    }

    @Override
    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

}
