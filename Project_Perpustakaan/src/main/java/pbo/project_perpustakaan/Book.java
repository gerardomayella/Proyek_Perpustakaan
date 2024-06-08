package pbo.project_perpustakaan;

public class Book extends Item implements halaman {
    private String isbn;
    private int jumlahHalaman;

    // constructor
    public Book(String title, String author, String isbn, int jumlahHalaman, boolean isAvailable) {
        super(title, author, isAvailable);
        this.isbn = isbn;
        this.jumlahHalaman = jumlahHalaman;
    }

    // getter
    public String getIsbn() {
        return isbn;
    }

    // setter
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // display info
    @Override
    public void displayInfo() {
        System.out.println("informasi buku : ");
        super.displayInfo();
        System.out.println("ISBN : " + isbn);
        System.out.println("Jumlah halaman : ");
    }

    @Override
    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
}
