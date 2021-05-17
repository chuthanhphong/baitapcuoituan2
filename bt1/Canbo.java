package bt1;

public class Canbo {
    private String name;
    private int age;
    private String gioitinh;
    private String address;

    public Canbo() {
    }

    public Canbo(String name, int age, String gioitinh, String address) {
        this.name = name;
        this.age = age;
        this.gioitinh = gioitinh;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Canbo{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gioitinh='" + getGioitinh() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
