public class DriverD<D extends Bus> extends Driver {
    public DriverD(String fullName, String driverLicense, int experience) {
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

    public String getInfo(D bus) {
        return " Водитель: " + getFullName() + "/ Управляет автомобилем: " + bus.getBrand() +
                " " + bus.getModel() + "/ Имеет водительское удостоверение: " + getDriverLicense() + "/Будет учавствовать в заезде.";
    }
}
