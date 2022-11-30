public class DriverB<T extends Car> extends Driver {

    public DriverB(String fullName, String driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    String startMoving() {
        return null;
    }

    @Override
    String stay() {
        return null;
    }

    @Override
    String refuel() {
        return null;
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getInfo(T car) {
        return " Водитель: " + getFullName() + "/ Управляет автомобилем: " + car.getBrand() +
                " " + car.getModel() + "/ Имеет водительское удостоверение: " + getDriverLicense() + "/Будет учавствовать в заезде.";
    }
}
