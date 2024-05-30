package MidTermHomework03;

public class MotoOperation {
    MotoVehicle[] motos = new MotoVehicle[18];

    public void init() {
        motos[0] = new Car("红旗", 800, "京NY28588", "奔腾B50", "白");
        motos[1] = new Car("红旗", 800, "京NY28588", "奔腾B50", "黑");
        motos[2] = new Car("红旗", 600, "京CNY3284", "奔腾B70", "白");
        motos[3] = new Car("红旗", 600, "京CNY3284", "奔腾B70", "黑");
        motos[4] = new Car("别克", 400, "京NT37465", "英朗", "白");
        motos[5] = new Car("别克", 400, "京NT37465", "英朗", "黑");
        motos[6] = new Car("别克", 200, "京NT96968", "凯越", "白");
        motos[7] = new Car("别克", 200, "京NT96968", "凯越", "黑");

        motos[8] = new Bus("金龙", 800, "京 8696997", 16, "白");
        motos[9] = new Bus("金龙", 800, "京 8696997", 16, "黑");
        motos[10] = new Bus("金龙", 1500, "京8696998", 34, "白");
        motos[11] = new Bus("金龙", 1500, "京8696998", 34, "黑");
        motos[12] = new Bus("金杯", 800, "京6566754", 16, "白");
        motos[13] = new Bus("金杯", 800, "京6566754", 16, "黑");
        motos[14] = new Bus("金杯", 1500, "京 9696996", 34, "白");
        motos[15] = new Bus("金杯", 1500, "京 9696996", 34, "黑");

        motos[16] = new Truck("欧曼", 2500, "京 666666", 6);
        motos[17] = new Truck("欧曼", 5000, "京 888888", 14);

    }

    public MotoVehicle rentVehicle(MotoVehicle moto1) {
        MotoVehicle rentMoto = null;
        for (int i = 0; i < motos.length; i++) {
            MotoVehicle moto = motos[i];
            if (moto instanceof Car && moto1 instanceof Car) {
                Car car = (Car) moto;
                Car car1 = (Car) moto1;
                if (car1.getBrand().equals(car.getBrand()) && car1.getType().equals(car.getType()) && car1.getColor().equals(car.getColor())) {
                    rentMoto = car;
                    break;
                }
            }
            if (moto instanceof Bus && moto1 instanceof Bus) {
                Bus bus = (Bus) moto;
                Bus bus1 = (Bus) moto1;
                if (bus1.getBrand().equals(bus.getBrand()) && bus.getSeatCount() == bus1.getSeatCount() && bus1.getColor().equals(bus.getColor())) {
                    rentMoto = bus;
                    break;
                }
            }
            if (moto instanceof Truck && moto1 instanceof Truck) {
                Truck truck = (Truck) moto;
                Truck truck1 = (Truck) moto1;
                if (truck.getWeight() == truck1.getWeight()) {
                    rentMoto = truck;
                    break;
                }
            }

        }
        return rentMoto;
    }
}
