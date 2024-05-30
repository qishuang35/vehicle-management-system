package MidTermHomework03;

import java.util.Scanner;

public class TruckHandler implements RentHandler{
    private RentHandler nextHandler;

    public TruckHandler(RentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public MotoVehicle handleRequest(int choice) {
        if (choice == 3) {
            return rentTruck();
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(choice);
        }
        return null;
    }

    private MotoVehicle rentTruck() {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择吨位（输入数字）: 1.6吨中型卡车 2.14吨重型卡车");
        int weightChoose = input.nextInt();
        int weight = (weightChoose == 1) ? 6 : 14;

        // 返回一个MotoVehicle对象（假设这是个具体实现类的实例化）
        return new Truck(weight);
    }
}
