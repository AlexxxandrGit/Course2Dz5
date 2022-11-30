public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
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
        System.out.println("Старт для автобуса");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Финиш для автобума");
    }

    @Override
    public void showsTheBestPitStop() {
        System.out.println("Лучшее время Пит Стоп для Автобуса");
    }

    @Override
    public void showsTheBestLapTime() {
        System.out.println("Лучшеев ремя круга для Автобуса");
    }

    @Override
    public void showsTheMaximumSpeed() {
        System.out.println("Максимальная скорость для Автобуса");
    }
}
