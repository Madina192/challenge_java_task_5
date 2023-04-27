public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String printInfo(int i) {
        return name + " works as a/an " + position + " and got "
                + (salary * i) + " $ for " + i + " months.";
    }
}
