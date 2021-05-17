package bt3;
public class Hocsinh {
    private int Sobaodanh ;
    private String name;  ;
    private String diachi;
    private int level;

    public Hocsinh() {
    }

    public Hocsinh(int sobaodanh, String name, String diachi, int level) {
        Sobaodanh = sobaodanh;
        this.name = name;
        this.diachi = diachi;
        this.level = level;
    }

    public int getSobaodanh() {
        return Sobaodanh;
    }

    public void setSobaodanh(int sobaodanh) {
        Sobaodanh = sobaodanh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Hocsinh{" +
                "Sobaodanh=" + Sobaodanh +
                ", name='" + name + '\'' +
                ", diachi='" + diachi + '\'' +
                ", level=" + level +
                '}';
    }
}
