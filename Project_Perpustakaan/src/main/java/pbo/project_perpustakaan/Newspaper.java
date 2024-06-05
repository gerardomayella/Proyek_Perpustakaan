package pbo.project_perpustakaan;

public class Newspaper extends Item {

    private String date;
    private int pageCount;

    public Newspaper(String title, String author, String date, int pageCount, boolean isAvailable) {
        super(title, author, isAvailable);
        this.date = date;
        this.pageCount = pageCount;
    }

    public String getDate() {
        return date;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("Newspaper information : ");
        super.displayInfo();
        System.out.println("Date of issue : " + date);
        System.out.println("Number of pages : " + pageCount);
    }

}