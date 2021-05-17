package bt2;

public class Journal extends Library {
    private int Issuenumber;
    private int Releasemonth;

    public Journal() {
    }

    public Journal(int issuenumber, int releasemonth) {
        Issuenumber = issuenumber;
        Releasemonth = releasemonth;
    }

    public Journal(String documentcode, String imprint, int releasenumber, int issuenumber, int releasemonth) {
        super(documentcode, imprint, releasenumber);
        Issuenumber = issuenumber;
        Releasemonth = releasemonth;
    }

    public int getIssuenumber() {
        return Issuenumber;
    }

    public void setIssuenumber(int issuenumber) {
        Issuenumber = issuenumber;
    }

    public int getReleasemonth() {
        return Releasemonth;
    }

    public void setReleasemonth(int releasemonth) {
        Releasemonth = releasemonth;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "Issuenumber=" + Issuenumber +
                ", Releasemonth=" + Releasemonth +
                '}';
    }
}
