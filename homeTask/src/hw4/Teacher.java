package hw4;

/**
 * Created by Liberstina on 23.02.2015.
 */

public class Teacher extends Person {
    double salary;
    String subject;

    Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        setSalary(salary);
        setSubject(subject);
    }

    public void setSalary(double a) {
        salary = a;
    }

    public double getSalary() {
        return salary;
    }

    public void setSubject(String a) {
        this.subject = a;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return (super.toString()) + ", subject: " + getSubject() + ", salary: " + getSalary();
    }
}
