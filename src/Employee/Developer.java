package Employee;

public class Developer extends Employee {
    private String language;

    public Developer(String name, int age, String language) {
        super(name, age);
        this.language = language;
    }

    public void changeLanguage(String language) {
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is writing on " + this.language);
    }

    @Override
    public void readEmployeeInfo() {
        System.out.printf("Employee %s, age %d, language %s\n", this.getName(), this.getAge(), this.language);
    }
}
