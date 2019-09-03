package datamapper.dao;

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
        employe.firsname = firstName;
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

    public class Employe {
        private int id;
        private String lastname;
        private String firsname;
        private int age;
        private int salary;

        public int getId() {
            return id;
        }

        public String getLastname() {
            return lastname;
        }

        public String getFirsname() {
            return firsname;
        }

        public int getAge() {
            return age;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employe{" +
                    "id=" + id +
                    ", lastname='" + lastname + '\'' +
                    ", firsname='" + firsname + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }
}
