package hw5;

public class Employee {
    String name;
    String position;
    String email;
    String telephone;
    int salary;
    int age;

    public Employee (String name, String position, String email, String telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public String  getName(){
        return name;
    }

    public String  getPosition() {
        return position;
    }
    public String  getEmail() {
        return email;
    }
    public String  getTelephone() {
        return telephone;
    }
    public int  getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }



}
