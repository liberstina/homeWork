package hw4;

/**
 * Created by Liberstina on 23.02.2015.
 */
public class Person {
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {

        return name;
    }

    public void setName(String m) {
        name = m;
    }

    public void setAge(int i) {
        age = i;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String m) {
        gender = m;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        String m1 = getName() + ", age: " + getAge() + ", gender: " + getGender();
        return m1;
    }
}