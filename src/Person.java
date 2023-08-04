public class Person {
    private String name;
    private int age;
    private String gender;

    public void installName(String name) {
        this.name = name;
    }

    public void installAge(int age) {
        this.age = age;
    }

    public void installGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
