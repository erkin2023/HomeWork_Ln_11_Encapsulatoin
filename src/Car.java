public class Car {
    private String make;
    private String model;
    private int year;

    public void installMake(String make) {
        this.make = make;
    }

    public void installModel(String model) {
        this.model = model;
    }

    public void installYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
