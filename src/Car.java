public class Car {
    private String company;
    private String model;
    private int years;

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYears() {
        return years;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", years=" + years +
                '}';
    }
}