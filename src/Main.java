import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void doTask1(){ //Сумма и среднее значение
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumOfArray = 0;
        for (int j : array) {
            sumOfArray += j;
        }
        System.out.println("Sum: " + sumOfArray);
        System.out.println("Wed/ar: " + sumOfArray / array.length);
        System.out.println();
    }

    static void doTask2(){ //макс и мин число
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int number = -1;
        int maxNumber = -1000;
        int minNumber = 1000;
        System.out.println("Вводите числа в пределах [-1000; 1000] в массив. Число 0 будет считаться концом воода.");
        while (number != 0){
            number = scanner.nextInt();
            list.add(number);
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber && number!=0){
                minNumber = number;
            }
        }
        System.out.println("Max: " + maxNumber + " Min: " + minNumber);
        System.out.println();

    }

    static void doTask3(String[] args){
        for (String arg: args){
            System.out.println(arg);
        }
        System.out.println();
    }

    static void doTask4(){
        for (double i = 1; i < 11; i++) {
            System.out.println(1 / i);
        }
        System.out.println();
    }


    static void doTask5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        long number = scanner.nextLong();
        number = findFactorial(number);
        System.out.println("Факториал: " + number);
        System.out.println();
    }
    static long findFactorial(long number){
        long factorial = 1;
        for (int i = 2;i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3(args);
        doTask4();
        doTask5();
    }
}