package Arrays;

    /**
     * Created by Liberstina on 17.02.2015.
     */
//Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
// Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
// Если таких строк несколько, то вывести индекс первой встретившейся из них.
    public class SecondArray {
        public static void main(String[] args){
            int x = 0;
            int y = 0;
            int [][] Array = new int[7][4];
            int [] Arr = new int[Array.length];

            for(int n = 0; n < Array.length; n++){

                System.out.print("The string number is "+ n + " ");
                for(int m = 0; m < Array[n].length; m++){
                    Array[n][m]=(int)(Math.random()*11)-5;
                    System.out.print(Array[n][m]+ " ");
                    if(m == 0)
                        Arr[n]=Array[n][m];
                    else
                        Arr[n]*=Array[n][m];

                    if(n == Array[m].length-1)
                        System.out.println(" ");
                }
            }

            for(int i = 0; i < Arr.length; i++){
                if(Math.abs(Arr[i])> x){
                    x = Arr[i];
                    y = i;
                }
            }

            System.out.println("String's index " + y + "with max amount of elements is " + x);
        }
    }

