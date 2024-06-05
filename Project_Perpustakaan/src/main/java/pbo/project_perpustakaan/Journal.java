package pbo.project_perpustakaan;

public class Journal extends Item {

    private String volume;
    private String issue;

    // constructor
    public Journal(String title, String author, String volume, String issue, boolean isAvailable) {
        super(title, author, isAvailable);
        this.volume = volume;
        this.issue = issue;

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
        System.out.println("Journal Information : ");
        super.displayInfo();
        System.out.println("Volume : " + volume);
        System.out.println("Issue : " + issue);
    }

}