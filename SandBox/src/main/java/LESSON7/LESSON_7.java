package LESSON7;

import java.util.Scanner;

public class LESSON_7 {
    public static void main(String[]args){
        System.out.println("Введите 1,2 или3:");
        Scanner inputFigur = new Scanner(System.in);
        int i = inputFigur.nextInt();
        if (i == 1){
            System.out.println("Вы ввели 1");
        } else if (i == 2) {
            System.out.println("Вы ввели 2");
        }else if (i == 3) {
            System.out.println("Вы ввели 3");

        }else {
            System.out.println("Вы ввели число не равное 1,2 или3 ");
        }

    }
}
