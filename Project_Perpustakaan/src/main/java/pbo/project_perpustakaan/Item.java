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


}