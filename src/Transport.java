import java.util.*;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set <Mechanic<?>> mechanics = new HashSet<>();

    private final Set <Sponsor> sponsors = new HashSet<>();








    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Введите корректные данные";
        } else {

            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Введите корректные данные";
        } else {

            this.model = model;
        }

        if (Double.compare(engineVolume, 0) <= 0) {
            this.engineVolume = 0;
        } else {

            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Введите корректные данные";
        } else {

            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Введите корректные данные";
        } else {

            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0) <= 0) {
            this.engineVolume = 0;
        } else {

            this.engineVolume = engineVolume;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Информация об авто " + getBrand() + getModel();
    }

    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void finishTheMove() {
        System.out.println("Закончить движение");
    }

    public void addDriver(Driver<?>driver) {
        drivers.add(driver);

    }

    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

    public Set <Driver<?>> getDrivers() {
        return drivers;
    }

    public Set <Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set <Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract boolean service();

    public abstract void repair();

}


