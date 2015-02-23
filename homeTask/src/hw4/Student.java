package hw4;

/**
 * Created by Liberstina on 23.02.2015.
 */
public class Student extends Person {
    String idNumber;
    double gpa;

    Student(String name, int age, String gender, String idNumber, double gpa) {
        super(name, age, gender);
        setIdNumber(idNumber);
        setGpa(gpa);
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String s) {
        idNumber = s;
    }

    public void setGpa(double d) {
        gpa = d;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", idNumber: " + getIdNumber() + ", gpa: " + getGpa();
    }
}