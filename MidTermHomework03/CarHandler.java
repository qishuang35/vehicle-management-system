package MidTermHomework03;

import java.util.Scanner;

public class CarHandler implements RentHandler {
    private RentHandler nextHandler;


    public CarHandler(RentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public MotoVehicle handleRequest(int choice) {
        if (choice == 1) {
            return rentCar();
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(choice);
        }
        return null;
    }

    private MotoVehicle rentCar() {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择品牌: 1、红旗 2、别克");
        int brandChoose = input.nextInt();
        String brand = (brandChoose == 1) ? "红旗" : "别克";

        String type;
        if (brand.equals("红旗")) {
            System.out.println("请选择类型: 1.奔腾B50 2.奔腾B70");
            int typeChoose = input.nextInt();
            type = (typeChoose == 1) ? "奔腾B50" : "奔腾B70";
        } else {
            System.out.println("请选择类型: 1.英朗 2.凯越");
            int typeChoose = input.nextInt();
            type = (typeChoose == 1) ? "英朗" : "凯越";
        }

        System.out.println("请选择颜色: 1.白 2.黑");
        int colorChoose = input.nextInt();
        String color = (colorChoose == 1) ? "白" : "黑";
        return new Car(brand, type,  color);
    }
}
