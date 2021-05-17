package bt2;

public class Book extends Library {
    private  String author;
    private int Numberofpages;

    public Book() {
    }

    public Book(String author , int Numberofpages) {
        this.author = author;
        this.Numberofpages = Numberofpages;
    }

    public Book(String documentcode, String imprint, int releasenumber, String author,int Numberofpages) {
        super(documentcode, imprint, releasenumber);
        this.author = author;
        this.Numberofpages = Numberofpages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberofpages() {
        return Numberofpages;
    }

    public void setNumberofpages(int numberofpages) {
        Numberofpages = numberofpages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", Numberofpages=" + Numberofpages +
                '}';
    }
}
