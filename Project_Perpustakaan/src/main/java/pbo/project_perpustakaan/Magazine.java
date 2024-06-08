package pbo.project_perpustakaan;

public class Magazine extends Item {
    private String edition;

    public Magazine(String title, String author, String edition, boolean isAvailable) {
        super(title, author, isAvailable);
        this.edition = edition;
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

}
