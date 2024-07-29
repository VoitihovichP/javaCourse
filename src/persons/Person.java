package persons;

import java.util.Optional;

public class Person {
    private String name;
    private String surname;
    private int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public Boolean checkIsPersonAdult(Optional<Integer> ageOfMajority) {
        int defaultAgeOfMajority = 18;
        int ageThreshold = ageOfMajority.orElse(defaultAgeOfMajority);
        return this.age >= ageThreshold;
    }

    public String changeName(String newName) {
        this.name = newName;
        return this.name;
    }

    public String changeSurname(String newSurname) {
        this.surname = newSurname;
        return this.surname;
    }
}
