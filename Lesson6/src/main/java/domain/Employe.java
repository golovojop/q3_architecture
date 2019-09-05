package domain;

public class Employe {
    protected int id;
    protected String lastname;
    protected String firstname;
    protected int age;
    protected int salary;

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirsname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "\tEmploye{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}