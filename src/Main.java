public class Main {
    public static void main(String[] args) {
        // University
        University[] universities = new University[2];
        University university1 = new University();
        university1.installName("Oxford University");
        university1.installLocation("Oxford, UK");
        university1.installFoundationYear(1096);
        universities[0] = university1;

        University university2 = new University();
        university2.installName("Harvard University");
        university2.installLocation("Harvard, USA");
        university2.installFoundationYear(1885);
        universities[1] = university2;

        // Car
        Car[] cars = new Car[2];
        Car car1 = new Car();
        car1.installMake("Toyota");
        car1.installModel("Camry");
        car1.installYear(2022);
        cars[0] = car1;

        Car car2 = new Car();
        car2.installMake("Tesla");
        car2.installModel("model X");
        car2.installYear(2023);
        cars[1] = car2;

        //  Person
        Person[] personals = new Person[2];
        Person person1 = new Person();
        person1.installName("Erkin Toigonbaev");
        person1.installAge(30);
        person1.installGender("Man");
        personals[0] = person1;

        Person person2 = new Person();
        person2.installName("Jandar Talaybekov");
        person2.installAge(25);
        person2.installGender("Man");
        personals[1] = person2;

        // Вывод
        System.out.println("Universities:");
        for (University university : universities) {
            System.out.println(university);
        }

        System.out.println("\nCars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nPersonals:");
        for (Person personal : personals) {
            System.out.println(personal);
        }
    }
    }
