package MidTermHomework03;

public abstract class MotoVehicle {
    private String brand;//车辆品牌
    private int perRent;//租金
    private String vehicleId;//车牌号



    MotoVehicle() {
    }


    MotoVehicle(String brand){
        this.brand=brand;
    }
    MotoVehicle(String brand, int perRent, String vehicleId) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.perRent = perRent;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPerRent() {
        return perRent;
    }

    public void setPerRent(int perRent) {
        if (perRent <= 0) {
            System.out.println("日租金不合法");
        } else {
            this.perRent = perRent;
        }
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public abstract double calRent(int days);


}
