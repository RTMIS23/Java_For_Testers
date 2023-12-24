package ru.stqa.geometry;

import ru.stqa.geometry.figurs.Square;
import ru.stqa.geometry.figurs.rectangle;

public class geomtry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7.0));
        Square.printSquareArea(new Square(5.0));
        Square.printSquareArea(new Square(3.0));

        rectangle.prinRectangleArea(3.0, 5.0);
        rectangle.prinRectangleArea(7.0, 9.0);

    }

}
