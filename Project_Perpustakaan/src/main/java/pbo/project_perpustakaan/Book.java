package pbo.project_perpustakaan;

public class Book extends Item {

    private String isbn;
    private int pageCount;

    // constructor
    public Book(String title, String author, String isbn, int pageCount, boolean isAvailable) {
        super(title, author, isAvailable);
        this.isbn = isbn;
        this.pageCount = pageCount;
    }

    // getter
    public String getIsbn() {
        return isbn;
    }

    public int getPageCount() {
        return pageCount;

    }

    // setter
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;

    }

    // display info
    @Override
    public void displayInfo() {
        System.out.println("Book Information : ");
        super.displayInfo();
        System.out.println("ISBN : " + isbn);
        System.out.println("Number of pages : " + pageCount);
    }
}