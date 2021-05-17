package bt1;

public class Kysu extends Canbo {
    private String Industry;

    public Kysu() {
    }

    public Kysu(String name, int age, String gioitinh, String address, String industry) {
        super(name, age, gioitinh, address);
        Industry = industry;
    }

    public Kysu(String industry) {
        Industry = industry;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }
}
