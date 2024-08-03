package Employee;

public class Employee {
    private final String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeEmployeeAge(int newAge) {
        this.age = newAge;
    }

    public void readEmployeeInfo() {
        System.out.printf("Employee %s, age %d\n", this.name, this.age);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void work() {
        System.out.println(this.name + " is work");
    }
}
