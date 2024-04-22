import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void testNot(){
        assertEquals("notATriangle", App.triangle(10, 2, 4));
    }

    @Test
    public void testEquilateral(){
        assertEquals("Equilateral", App.triangle(3, 3, 3));
    }

    @Test
    public void testIsosceles(){
        assertEquals("Isosceles", App.triangle(3, 3, 4));
    }

    @Test
    public void testRight(){
        assertEquals("rightTriangle", App.triangle(5, 3, 4));
    }

    @Test
    public void testScalene(){
        assertEquals("Scalene", App.triangle(2, 3, 4));
    }
}
