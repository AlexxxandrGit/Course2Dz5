public class DriverC<A extends Truck> extends Driver {

    public DriverC(String fullName, String driverLicense, int experience) {
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

    public String getInfo(A track) {
        return " Водитель: " + getFullName() + "/ Управляет автомобилем: " + track.getBrand() +
                " " + track.getModel() + "/ Имеет водительское удостоверение: " + getDriverLicense() + "/Будет учавствовать в заезде.";
    }
}