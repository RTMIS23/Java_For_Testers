package ru.stqa.geometry.figurs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {


    @Test
    void canCalculateArea(){
        double result = Square.Area(5.0);
        Assertions.assertEquals(25.0, result);

    }
    @Test
    void canCulcuLatePerimeter(){
        Assertions.assertEquals(20.0,Square.perimeter(5.0));
    }
}
