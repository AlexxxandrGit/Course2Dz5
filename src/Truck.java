public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void startMoving() {
        System.out.println("Старт для грузового авто");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Финиш для грузового авто");
    }

    @Override
    public void showsTheBestPitStop() {
        System.out.println("Лучшее время Пит Стоп для грузового авто");
    }

    @Override
    public void showsTheBestLapTime() {
        System.out.println("Лучшеев время круга для грузового авто");
    }

    @Override
    public void showsTheMaximumSpeed() {
        System.out.println("Максимальная скорость для грузового авто");
    }
}


