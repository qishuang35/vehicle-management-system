package MidTermHomework03;

public class Truck extends MotoVehicle {
    private int weight;

    Truck() {
    }

    Truck(int weight) {
        this.weight = weight;
    }

    Truck(String brand, int perRent, String vehicleId, int weight) {
        super(brand, perRent, vehicleId);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double calRent(int days) {//计算卡车租金
        double price = this.getPerRent() * days;
        if (days >= 14) {
            price = price * 0.6;
        } else if (days >= 7) {
            price = price * 0.7;
        } else if (days >= 5) {
            price = price * 0.8;
        } else if (days >= 3) {
            price = price * 0.9;
        }
        return price;
    }
}
