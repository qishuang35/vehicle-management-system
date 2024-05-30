package MidTermHomework03;

import java.util.Scanner;

public class RentVehicleSys {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("*********欢迎光临腾飞汽车租赁公司***********");
        double totalPrice = 0;
        RentHandler handlerChain = new CarHandler(new BusHandler( new TruckHandler(null)));

        do {
            int vehicleType = getValidVehicleType();
            MotoVehicle moto = handlerChain.handleRequest(vehicleType);
            if (moto == null) {
                System.out.println("租车失败，请重新选择");
                continue;
            }
            int days = getRentalDays();
            MotoOperation motoOpr = new MotoOperation();
            motoOpr.init();
            moto = motoOpr.rentVehicle(moto);
            System.out.println("******租车结果*******");
            System.out.println("租车成功 !分配给您的车是:" + moto.getVehicleId());
            totalPrice += moto.calRent(days);
            System.out.println("请选择是否继续租车：扣1结束");
        } while (scanner.nextInt() != 1);

        System.out.println("您应付租金(元): " + totalPrice);
        System.out.println(totalPrice > 10000 ? "感谢惠顾，祝您一路顺风" : "谢谢惠顾");

        scanner.close();
    }

    private static int getValidVehicleType() {
        int type;
        do {
            System.out.println("请选择租车类型: 1、轿车 2、客车 3、卡车");
            type = scanner.nextInt();
            if (type < 1 || type > 3) {
                System.out.println("输入有误请重新输入");
            }
        } while (type < 1 || type > 3);
        return type;
    }

    private static int getRentalDays() {
        System.out.print("请输入要租赁的天数: ");
        return scanner.nextInt();
    }

        /*（自己写的判断输入太冗杂了，和10一样）
        System.out.println("*********欢迎光临腾飞汽车租赁公司***********");
        String brand = "";
        String type = "";
        int seatCount = 0;
        String color = "";
        int weight = 0;
        int i = 0;
        double price = 0;
        do {
            System.out.println("请选择租车类型:1、轿车2、客车 3、卡车");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
            if (choose > 3 || choose < 0) {
                System.out.println("输入有误请重新输入");
                System.out.println();
                continue;
            }
            switch (choose) {
                case 1:
                    System.out.println("请选择品牌:1.红旗2、别克");
                    int brandChoose = input.nextInt();
                    if (brandChoose == 1) {
                        brand = "红旗";
                        System.out.println("请选择类型：1.奔腾B50 2.奔腾B70");
                        int typeChoose = input.nextInt();
                        if (typeChoose > 2 || typeChoose < 0) {
                            System.out.println("输入有误请重新输入");
                            continue;
                        }
                        type = (typeChoose == 1) ? "奔腾B50" : "奔腾B70";
                        System.out.println("请选择颜色：1.白 2.黑");
                        int colorChoose = input.nextInt();
                        if (colorChoose > 2 || colorChoose < 0) {
                            System.out.println("输入有误请重新输入");
                            continue;
                        }
                        color = (colorChoose == 1) ? "白" : "黑";
                    } else if (brandChoose == 2) {
                        brand = "别克";
                        System.out.println("请选择类型:1.英朗2.凯越");
                        int typeChoose = input.nextInt();
                        if (typeChoose > 2 || typeChoose < 0) {
                            System.out.println("输入有误请重新输入");
                            continue;
                        }
                        type = (typeChoose == 1) ? "英朗" : "凯越";
                        System.out.println("请选择颜色：1.白 2.黑");
                        int colorChoose = input.nextInt();
                        if (colorChoose > 2 || colorChoose < 0) {
                            System.out.println("输入有误请重新输入");
                            continue;
                        }
                        color = (colorChoose == 1) ? "白" : "黑";
                    } else {
                        System.out.println("输入有误请重新输入");
                        continue;
                    }
                    break;
                case 2:
                    System.out.println("请选择品牌:1.金龙2、金杯");
                    brand = (input.nextInt() == 1) ? "金龙" : "金杯";
                    System.out.println("请选择座位数:1.16座2、34座");
                    int typeChoose = input.nextInt();
                    seatCount = (typeChoose == 1) ? 16 : 34;
                    System.out.println("请选择颜色：1.白 2.黑");
                    int colorChoose = input.nextInt();
                    color = (colorChoose == 1) ? "白" : "黑";
                    break;
                case 3:
                    System.out.println("请选择吨位（输入数字）:1.6吨中型卡车 2、14吨重型卡车");
                    weight = (input.nextInt() == 1) ? 6 : 14;
            }
            System.out.print("请输入要租赁的天数:");
            int days = input.nextInt();
            MotoOperation motoOpr = new MotoOperation();
            motoOpr.init();
            MotoVehicle moto = motoOpr.rentVehicle(brand, type, seatCount, color, weight);
            System.out.println("******租车结果*******");
            System.out.println("租车成功 !分配给您的车是:" + moto.getVehicleId());
            price += moto.calRent(days);

            System.out.println("请选择是否继续租车：扣1结束");
            i = input.nextInt();

        } while (i != 1);
        System.out.println(" 您应付租金(元):" + price);
        if (price > 10000) {
            System.out.println("感谢惠顾，祝您一路顺风");
        } else {
            System.out.println("谢谢惠顾");
        }

         */
}
