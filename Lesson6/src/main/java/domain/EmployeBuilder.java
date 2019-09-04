package domain;

public class EmployeBuilder {

    private final Employe employe;

    public EmployeBuilder() {
        this.employe = new Employe();
    }

    public EmployeBuilder id(int id) {
        employe.id = id;
        return this;
    }

    public EmployeBuilder lastName(String lastName) {
        employe.lastname = lastName;
        return this;
    }

    public EmployeBuilder firstName(String firstName) {
        employe.firstname = firstName;
        return this;
    }

    public EmployeBuilder age(int age) {
        employe.age = age;
        return this;
    }

    public EmployeBuilder salary(int salary) {
        employe.salary = salary;
        return this;
    }

    public Employe build() {
        return employe;
    }

}
