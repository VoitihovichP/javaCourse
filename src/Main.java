import Employee.*;

public class Main {

    public static void main(String[] args) {
        Employee PM = new Employee("Alex", 18);
        Developer JsDev = new Developer("Pasha", 20, "JavaScript");

        JsDev.changeLanguage("Java");
        JsDev.changeEmployeeAge(21);

        JsDev.readEmployeeInfo();
    }
}
