package pbo.project_perpustakaan;

public class CD extends Item {

    private String artist;
    private int trackCount;

    public CD(String artist, int trackCount, String title, String author, boolean isAvailable) {
        super(title, author, isAvailable);
        this.artist = artist;
        this.trackCount = trackCount;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    @Override
    public void displayInfo() {
        System.out.println("CD information : ");
        super.displayInfo();
        System.out.println("Artist : " + artist);
        System.out.println("Track Count : " + trackCount);
    }

}