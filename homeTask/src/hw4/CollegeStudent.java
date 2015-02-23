package hw4;

/**
 * Created by Liberstina on 23.02.2015.
 */
public class CollegeStudent extends Student {
    int year;
    String major;

    CollegeStudent(String name, int age, String gender, String idNumber, double gpa, int year, String major) {
        super(name, age, gender, idNumber, gpa);
        setYear(year);
        setMajor(major);
    }

    @Override
    public String toString() {
        return super.toString() + ", year: " + getYear() + ", major:" + getMajor();
    }

    public void setYear(int i) {
        year = i;
    }

    public int getYear() {
        return year;
    }

    public void setMajor(String m) {
        major = m;
    }

    public String getMajor() {
        return major;
    }
}