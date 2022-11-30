public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Лада", "Гранта", 1.6);
        Car bmw = new Car("BMW", "X5", 3.0);
        Car audi = new Car("Audi", "Q7", 2.5);
        Car kia = new Car("Киа", "Рио", 1.5);

        Truck hyundai = new Truck("Hyundai", "Mighty", 3.9);
        Truck maz = new Truck("Маз", "5440", 6);
        Truck kamaz = new Truck("КамАЗ", "65207", 6);
        Truck scania = new Truck("Scania", "S-Series", 8);

        Bus paz = new Bus("Паз", "3205", 5);
        Bus liaz = new Bus("Лиаз", "677", 6);
        Bus nefaz = new Bus("НефАз", "677", 5.5);
        Bus laz = new Bus("ЛАЗ", "695", 4.3);


        System.out.println();

        printInfo(lada);
        printInfo(bmw);
        printInfo(audi);
        printInfo(kia);

        System.out.println();

        printInfo(hyundai);
        printInfo(maz);
        printInfo(kamaz);
        printInfo(scania);

        System.out.println();

        printInfo(paz);
        printInfo(liaz);
        printInfo(nefaz);
        printInfo(laz);

        System.out.println();

        lada.startMoving();
        maz.finishTheMove();
        bmw.showsTheBestPitStop();
        laz.showsTheMaximumSpeed();
        kamaz.showsTheBestLapTime();

        System.out.println();


        DriverB<Car> ivanov = new DriverB<>("Иванов Иван Иванович", "Категория B", 10);
        DriverC<Truck> petrov = new DriverC<>("Петров Петр Петрович", "Категория C", 15);
        DriverD<Bus> perov = new DriverD<>("Перов Евгений Дмитриевич", "Категория D", 8);

        System.out.println(ivanov.getInfo(audi));
        System.out.println(petrov.getInfo(kamaz));
        System.out.println(perov.getInfo(laz));


    }


    public static void printInfo(Transport transport) {
        System.out.println("Марка: " + transport.getBrand() + " / Модель: " + transport.getModel() + " / Объем двтгателя: " + transport.getEngineVolume());
    }


}