package MidTermHomework03;

public class Car extends MotoVehicle {
    private String type;
    private String color;

    Car() {
    }

    Car(String brand, String type, String color) {
        super(brand);
        this.type = type;
        this.color=color;

    }

    Car(String brand, int perRent, String vehicleId, String type, String color) {
        super(brand, perRent, vehicleId);
        this.type = type;
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double calRent(int days) {//计算轿车租金(白色轿车每天加多10元清洗费)
        double price = this.getPerRent() * days;
        if ("白".equals(getColor())) {
            price += 10 * days;
        }
        if (days > 150) {
            price = price * 0.7;
        } else if (days > 30) {
            price = price * 0.8;
        } else if (days > 7) {
            price = price * 0.9;
        }
        return price;
    }



}
