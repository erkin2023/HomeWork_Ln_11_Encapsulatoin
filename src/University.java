public class University {
    private String name ;
    private String location;
    private int foundationYear;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setFoundationYear(int foundationYear) {
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