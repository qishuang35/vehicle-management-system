package MidTermHomework03;
import java.util.Scanner;
public class BusHandler implements RentHandler{
    private RentHandler nextHandler;
    public BusHandler(RentHandler nextHandler){
        this.nextHandler=nextHandler;
    }

    @Override
    public MotoVehicle handleRequest(int choice) {
        if (choice == 2) {
            return rentBus();
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(choice);
        }
        return null;
    }
    private MotoVehicle rentBus() {
        Scanner input = new Scanner(System.in);
        System.out.println("请选择品牌: 1、金龙 2、金杯");
        int brandChoose = input.nextInt();
        String brand = (brandChoose == 1) ? "金龙" : "金杯";

        System.out.println("请选择座位数: 1.16座 2.34座");
        int seatChoose = input.nextInt();
        int seatCount = (seatChoose == 1) ? 16 : 34;

        System.out.println("请选择颜色: 1.白 2.黑");
        int colorChoose = input.nextInt();
        String color = (colorChoose == 1) ? "白" : "黑";

        // 返回一个MotoVehicle对象（假设这是个具体实现类的实例化）
        return new Bus(brand, seatCount, color);
    }
}
