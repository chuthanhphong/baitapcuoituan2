package bt3;

public class KhoiC extends Hocsinh {
    private static final String van = "Monvan";
    private static final String su = "Monsu";
    private static final String dia = "Mondia";

    public KhoiC() {
    }

    public KhoiC(int sobaodanh, String name, String diachi, int level) {
        super(sobaodanh, name, diachi, level);
    }

    @Override
    public String toString() {
        return  "khoiA{}" + "thí sinh" +
                getName() + "mã số " + getSobaodanh() +
                "địa chi" + getDiachi() +
                "level " + getLevel() + "các môn học" + van + su +dia;
    }
}
