import java.util.*;

public abstract class Driver<T extends Transport> {
    private String fullName;
    private String driverLicense;
    private int experience;

    private final Set<Driver<?>> drivers = new HashSet<>();

    private T car;


    public Driver(String fullName, String driverLicense, int experience, T car ) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "Введите корректные данные";
        } else {

            this.fullName = fullName;
        }
        this.driverLicense = driverLicense;
        this.experience = experience;
        this.car = car;
    }




    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // @Override
    // public String toString() {
    //return String.format(
    // "Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
    // this.fullName, this.car.getBrand(), this.car.getModel());
    //}

    public void startDriving() {
        System.out.printf("Водитель %s начал двигаться", this.fullName);
        this.car.startMoving();
    }

    public void finishDriving() {
        System.out.printf("Водитель %s закончил движение", this.fullName);
        this.car.finishTheMove();
    }

    public void refill() {
        System.out.printf("Водитель %s заправляет  %s %s",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }

    @Override
    public String toString() {
        return getFullName() + " / Kатегория " + getDriverLicense() + " / Стаж вождения " + getExperience();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(driverLicense, driver.driverLicense) && Objects.equals(drivers, driver.drivers) && Objects.equals(car, driver.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experience, drivers, car);
    }
}



