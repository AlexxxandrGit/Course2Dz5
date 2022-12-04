public class Bus extends Transport implements Competing {
    private Capacity capacity;

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
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
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость авто от " + capacity.getFrom() + " мест до " + capacity.getTo() + " мест");
        }
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

    public void printBas() {
        System.out.println("Автобус: " + getBrand() +
                " " + getModel() + " Объум двигателя: " + getEngineVolume());
    }
}
