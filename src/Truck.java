public class Truck extends Transport implements Competing {
    private Weight weight;

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Truck(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;


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
    public void printType() {
        if (weight == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = weight.getFrom() == null ? "" : " от " + weight.getFrom() + " т ";
            String to = weight.getTo() == null ? "" : " до " + weight.getTo() + " т ";
            System.out.println("Грузоподъемность авто " + from + to);
        }
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


