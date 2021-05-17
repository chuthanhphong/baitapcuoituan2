package bt2;

public class Newspaper extends  Library {
    private  String releasedate;

    public Newspaper() {
    }

    public Newspaper(String releasedate) {
        this.releasedate = releasedate;
    }

    public Newspaper(String documentcode, String imprint, int releasenumber, String releasedate) {
        super(documentcode, imprint, releasenumber);
        this.releasedate = releasedate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "releasedate='" + releasedate + '\'' +
                '}';
    }
}
