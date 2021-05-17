package bt1;

public class Nhanvien extends Canbo {
    private String Job;

    public Nhanvien() {
    }

    public Nhanvien(String name, int age, String gioitinh, String address, String job) {
        super(name, age, gioitinh, address);
        Job = job;
    }
}
