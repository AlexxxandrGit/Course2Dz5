import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {


    public static void main(String[] args) {
        Mechanic<Car> vasiliy = new Mechanic<Car>("Артем Евгеньевич", " Васильев ", "Лукойл");
        Sponsor gazprom = new Sponsor("Газпром", 500000);

        Car lada = new Car("Лада", "Гранта", 1.6, BodyType.SEDAN);
        lada.addDriver(new DriverB("Тулайкин Дмитрий Васильевич", "B", 10, lada));
        lada.addMechanic(vasiliy);
        lada.addSponsor(gazprom);

        Car bmw = new Car("BMW", "X5", 3.0, BodyType.OFFROADCAR);
        Car audi = new Car("Audi", "Q7", 2.5, BodyType.OFFROADCAR);
        Car kia = new Car("Киа", "Рио", 1.5, BodyType.SEDAN);


        Truck hyundai = new Truck("Hyundai", "Mighty", 3.9, Weight.N1);
        Truck maz = new Truck("Маз", "5440", 6, Weight.N2);
        Truck kamaz = new Truck("КамАЗ", "65207", 6, Weight.N2);
        Truck scania = new Truck("Scania", "S-Series", 8, Weight.N3);


        Sponsor apple = new Sponsor("Билл", 40000000);
        maz.addDriver(new DriverC("Перов Евгений Васильевич", "C", 10, maz));
        maz.addMechanic(new Mechanic<>("Иван Иванович", " Иванов", "Пирелли"));
        maz.addSponsor(new Sponsor("МТС", 1000000));
        maz.addSponsor(apple);


        DriverC anton = new DriverC("Петров Антон Семенович", "С", 15, maz);
        maz.addDriver(anton);


        Bus paz = new Bus("Паз", "3205", 5, Capacity.LARGE);
        Bus liaz = new Bus("Лиаз", "677", 6, Capacity.AVERAGE);
        Bus nefaz = new Bus("НефАз", "677", 5.5, Capacity.EXTRA_SMALL);
        Bus laz = new Bus("ЛАЗ", "695", 4.3, Capacity.ESPECIALLY_LARGE);


        List<Transport> transports = List.of(lada, bmw, audi, kia,
                kamaz, maz, hyundai, scania,
                paz, laz, liaz, nefaz);


        //service(kia, bmw, paz, laz, audi);


        //System.out.println();

        // printInfo(lada);
        // printInfo(bmw);
        // printInfo(audi);
        //printInfo(kia);

        //System.out.println();

        //printInfo(hyundai);
        // printInfo(maz);
        // printInfo(kamaz);
        // printInfo(scania);

        //System.out.println();

        //printInfo(paz);
        //printInfo(liaz);
        //printInfo(nefaz);
        //printInfo(laz);

        //System.out.println();

        // lada.startMoving();
        // maz.finishTheMove();
        // bmw.showsTheBestPitStop();
        // laz.showsTheMaximumSpeed();
        //kamaz.showsTheBestLapTime();


        //System.out.println();

        //DriverC driverC = new DriverC("Иванов Иван Иванович", "Категория C", 10, scania);
        //System.out.println(driverC);


        // lada.printType();
        // kamaz.printType();
        // paz.printType();

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(lada);
        serviceStation.addTruck(maz);
        serviceStation.service();
        serviceStation.service();

        for (Transport transport : transports) {
            stringPrintInfo(transport);
        }


    }

    // public static void infoPrint(Transport transport) {
    //System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
    // System.out.print("Водители: ");
    // for (Driver<?> driver : transport.getDrivers()) {
    //     System.out.println(driver.getFullName());
    //  }
    //  System.out.print("Механики: ");
    // for (Mechanic mechanic : transport.getMechanics()) {
    //    System.out.println(mechanic.getName());
    // }
    // for (Sponsor sponsor : transport.getSponsors()) {
    //     System.out.println("Спонсор:" + sponsor.getName() + "/сумма " + sponsor.getAmount());
    // }
    // }


    // public static void printInfo(Transport transport) {
    //System.out.println("Марка: " + transport.getBrand() + " / Модель: " + transport.getModel() + " / Объем двтгателя: " + transport.getEngineVolume());
    //}

    //private static void service(Transport... transports) {
    //for (Transport transport : transports) {
    // serviceTransport(transport);
    //}
    // }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль" + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");

            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void stringPrintInfo(Transport transport) {
        System.out.println("Информация по авто: " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println("Спонсоры: " + transport.getSponsors());
    }


}

