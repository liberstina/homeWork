package hw2;

/**
 * Created by Liberstina on 23.02.2015.
 */
// Создать класс, который содержит int и char (не проинициализированные) и распечатать их значения.
public class Intchar {
    int i;
    char ch;

    public static void main(String[] args) {
        //public void print() {
        Intchar intchar = new Intchar();
        System.out.println(intchar.i + intchar.ch);
    }
}
