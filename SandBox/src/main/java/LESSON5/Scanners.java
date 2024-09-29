package LESSON5;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        getName();
        getAge();
        familySityation();
        homeLife();
    }
    public static void getName(){
        Scanner UserName = new Scanner(System.in);
        System.out.println("Введите ваге имя ");
        String name = UserName.nextLine();
        System.out.println("Ваше имя:" + name);
    }
    public static void getAge(){
        Scanner getAge = new Scanner(System.in);
        System.out.println("Введите ваш возвраст ");
        String age = getAge.nextLine();
        System.out.println("Ваш возвраст:" + age);
    }
    public static void familySityation(){
        Scanner familySityation = new Scanner(System.in);
        System.out.println("Ваше семейное положение");
        String sityaation = familySityation.nextLine();
        System.out.println("Семейное положние " + sityaation);
    }
    public static void homeLife(){
        Scanner home = new Scanner(System.in);
        System.out.println("Укажите место постоянной регистарции");
        String homi = home.nextLine();
        System.out.println("Ваш адрес "+ homi);
    }
}
