package hw2;
/**
 * Created by Liberstina on 13.02.2015.
 */
//Создать класс, который будет хранить в одной целочисленной переменной несколько значений меньшей длины.
// Например, возраст, вес, рост и год рождения.
// Добавить методы получения и добавления параметров отдельно.
public class SeveralInOne {
    public static void main(String[] args) {

        int age, height, weight, combined, mask, birthday;
        age = 28;
        height = 156;
        weight = 52;
        birthday = 86;
        combined = (age) | (height << 8) | (weight << 16) | (birthday << 24);
        mask = 0b11111111;

        System.out.printf("Age: %d, height: %d, weight: %d, birthday: %d",
                mask & combined,
                mask & combined >>> 8,
                mask & combined >>> 16,
                mask & combined >>> 24);
    }

}