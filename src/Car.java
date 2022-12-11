import java.util.ArrayList;

public class Car extends Transport implements Competing {

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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
        System.out.println("Старт для легкового авто");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Финиш для легкового авто");
    }


    @Override
    public void showsTheBestPitStop() {
        System.out.println("Лучшее время Пит Стоп для Легкового авто");
    }

    @Override
    public void showsTheBestLapTime() {
        System.out.println("Лучшеев время круга для легкового авто");
    }

    @Override
    public void showsTheMaximumSpeed() {
        System.out.println("Максимальная скорость для легкового авто");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип авто: " + bodyType);
        }

    }


    public void printCar() {
        System.out.println("Легковой автомобиль: " + getBrand() +
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л");


    }

    public boolean service() {
        return Math.random() > 0.7 ;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена");

    }

}