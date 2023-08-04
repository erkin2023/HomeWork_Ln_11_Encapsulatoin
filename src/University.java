public class University {
    private String name;
    private String location;
    private int foundationYear;

    public void installName(String name) {
        this.name = name;
    }

    public void installLocation(String location) {
        this.location = location;
    }

    public void installFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}
