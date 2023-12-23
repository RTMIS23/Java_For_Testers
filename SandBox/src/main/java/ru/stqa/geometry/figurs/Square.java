package ru.stqa.geometry;

public class Square {
    static void printSquareArea(double side) {
       System text = String.format("Площадь квадрата со стороной %f  = %f", side, squareArea(side)));
       System.out.println(text);

   }

    private static double squareArea(double a) {
        return a * a;
    }
}
