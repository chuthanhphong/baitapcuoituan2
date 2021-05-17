package bt1;

public class Congnhan extends Canbo {
    private int Level;

    public Congnhan() {
    }

    public Congnhan(String name, int age, String gioitinh, String address, int level) {
        super(name, age, gioitinh, address);
        Level = level;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }
}
