package bt2;

public class Library {
    private  String Documentcode;
    private  String Imprint;
    private  int  Releasenumber;

    public Library() {
    }

    public Library(String documentcode, String imprint, int releasenumber) {
        Documentcode = documentcode;
        Imprint = imprint;
        Releasenumber = releasenumber;
    }

    public String getDocumentcode() {
        return Documentcode;
    }

    public void setDocumentcode(String documentcode) {
        Documentcode = documentcode;
    }

    public String getImprint() {
        return Imprint;
    }

    public void setImprint(String imprint) {
        Imprint = imprint;
    }

    public int getReleasenumber() {
        return Releasenumber;
    }

    public void setReleasenumber(int releasenumber) {
        Releasenumber = releasenumber;
    }

    @Override
    public String toString() {
        return "Library{" +
                "Documentcode='" + Documentcode + '\'' +
                ", Imprint='" + Imprint + '\'' +
                ", Releasenumber=" + Releasenumber +
                '}';
    }
}
