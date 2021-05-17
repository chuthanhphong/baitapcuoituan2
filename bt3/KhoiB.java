package bt3;

public class KhoiB extends Hocsinh {
    private static final String toan = "MonToan";
    private static final String hoa = "Monhoa";
    private static final String sinh = "Monsinh";

    public KhoiB() {
    }

    public KhoiB(int sobaodanh, String name, String diachi, int level) {
        super(sobaodanh, name, diachi, level);
    }

    @Override
    public String toString() {
        return  "khoiB{}" + "thí sinh" +
                getName() + "mã số " +getSobaodanh() +
                "địa chi" + getDiachi() +
                "level " + getLevel() + "các mô học" + toan + hoa + sinh;
    }
}
