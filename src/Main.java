public class Main {
    public static void main(String[] args) {
        // University
        University [] universities = new University[2];
        University university1= new University();
        university1.setName("Oxford University");
        university1.setLocation("Oxford , UK");
        university1.setFoundationYear(1980);
        universities[0]=university1;

        University university2 = new University();
        university2.setName("Harvard University");
        university2.setLocation("Harvard , USA");
        university2.setFoundationYear(1790);
        universities [1]=university2;

        // Car
        Car[] cars = new Car [2];
        Car car1=new Car();
        car1.setCompany("Lamborghini ");
        car1.setModel("Lamborghini Авентадор S");
        car1.setYears(2023);
        cars [0]=car1;

        Car car2 = new Car ();
        car2.setCompany("Ferrari");
        car2.setModel("Ferrari 488");
        car2.setYears(2023);
        cars[1]=car2;

        //  Person
        Person[]persons = new Person[2];
        Person person1= new Person();
        person1.setName("Erkin Toigonbaev");
        person1.setAge(21);
        person1.setGender("Man");
        persons [0]= person1;

        Person person2 = new Person();
        person2.setName("Leyla");
        person2.setAge(19);
        person2.setGender("Woman");

//        // Вывод

        System.out.println("Universities:");
        for (University university : universities) {
            System.out.println(university);
        }

        System.out.println("\nCars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nPersonals:");
        for (Person personal : persons) {
            System.out.println(persons);
        }

    }
    }
