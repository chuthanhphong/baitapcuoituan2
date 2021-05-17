package bt3;
public class khoiA extends Hocsinh {
    private static final String Toan = "MonToan";
    private static final String Ly = "MonLy";
    private static final String hoa = "MonHoa";

    public khoiA() {
    }

    public khoiA(int sobaodanh, String name, String diachi, int level) {
        super(sobaodanh, name, diachi, level);
    }

    @Override
    public String toString() {
        return "khoiA{}" + "thí sinh" +
                super.getName() + "mã số " + super.getSobaodanh() +
                "địa chi" + super.getDiachi() +
                "level " + super.getLevel() +
                Toan + Ly + hoa;
    }
}

