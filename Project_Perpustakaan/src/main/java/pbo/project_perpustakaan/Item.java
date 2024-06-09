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
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean x) {
        this.isAvailable = x;
    }

    public void displayInfo() {
        System.out.println("Judul : " + getTitle());
        System.out.println("Penulis : " + getAuthor());
        System.out.println("Ketersediaan : " + getIsAvailable());
    }
}
