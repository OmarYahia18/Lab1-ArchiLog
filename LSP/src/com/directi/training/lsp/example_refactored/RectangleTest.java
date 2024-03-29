package com.directi.training.lsp.example_refactored;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest
{
    @Test
    public void testSetWidth_Rectangle()
    {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        assertEquals(5, rectangle.getWidth());
        assertEquals(20, rectangle.getArea());
    }
}