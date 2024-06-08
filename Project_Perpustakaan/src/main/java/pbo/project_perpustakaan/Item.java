package pbo.project_perpustakaan;

public class Item {
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public Item(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return "title";
    }

    public String getAuthor() {
        return "author";
    }

    public boolean getIsAvailable() {
        return false;
    }

    public void setIsAvailable(boolean x) {
        this.isAvailable = x;
    }

    public void displayInfo() {
        System.out.println("Judul : " + title);
        System.out.println("Penulis : " + author);
        System.out.println("Ketersediaan " + isAvailable);
    }
}
