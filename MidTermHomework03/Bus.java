package MidTermHomework03;

public class Bus extends MotoVehicle {
    private int seatCount;
    private String color;

    Bus() {
    }

    Bus(String brand, int seatCount, String color) {
        super(brand);
        this.color = color;
        this.seatCount = seatCount;

    }

    Bus(String brand, int perRent, String vehicleId, int seatCount, String color) {
        super(brand, perRent, vehicleId);
        this.seatCount = seatCount;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public double calRent(int days) {//计算巴士租金(白色巴士每天加多10元清洗费)
        double price = this.getPerRent() * days;
        if ("白".equals(getColor())) {
            price += 20 * days;
        }
        if (days >= 150) {
            price = price * 0.6;
        } else if (days >= 30) {
            price = price * 0.7;
        } else if (days >= 7) {
            price = price * 0.8;
        } else if (days >= 3) {
            price = price * 0.9;
        }
        return price;
    }
}
