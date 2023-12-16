public class geomtry {
    public static void main(String[] args) {
        printSquareArea(7.0);
        printSquareArea(5.0);
        printSquareArea(3.0);

        prinRectangleArea(3.0, 5.0);
        prinRectangleArea(7.0, 9.0);

    }

    private static void prinRectangleArea(double a, double b) {
        System.out.println("Площадь прямогугольника со сторонами "+ a + "и" +b + "="+ rectangleArea(a,b));
    }

    private static double rectangleArea(double a, double b) {
        return a* b ;
    }

    static void printSquareArea(double side) {
       System.out.println("Площадь квадрата со стороной " + side+ "="+ squareArea(side));
   }

    private static double squareArea(double a) {
        return a * a;
    }
}
