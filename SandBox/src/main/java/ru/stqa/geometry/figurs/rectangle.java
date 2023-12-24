package ru.stqa.geometry.figurs;

public class rectangle {

   public static void prinRectangleArea(double a, double b) {
        var text = String.format("Площадь прямогугольника со сторонами %f and %f = %f", a, b,rectangleArea(a,b));
        System.out.println(text);
   }

     public static double rectangleArea(double a, double b) {
        return a* b ;
    }
}
