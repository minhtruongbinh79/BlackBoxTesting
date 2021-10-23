import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoundaryValueTesting {
    @Test
    public void testCalculateBMI1() {
        assertEquals("Béo phì", BMI.calculateBMI(75, 1));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Béo phì", BMI.calculateBMI(75, 0.1));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Béo phì", BMI.calculateBMI(75, 0.2));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Bình thường", BMI.calculateBMI(75, 1.9));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Bình thường", BMI.calculateBMI(75, 2));
    }

    @Test
    public void testCalculateBMI6() {
        assertEquals("Thiếu cân", BMI.calculateBMI(0.1, 1));
    }

    @Test
    public void testCalculateBMI7() {
        assertEquals("Thiếu cân", BMI.calculateBMI(0.2, 1));
    }

    @Test
    public void testCalculateBMI8() {
        assertEquals("Béo phì", BMI.calculateBMI(150, 1));
    }

    @Test
    public void testCalculateBMI9() {
        assertEquals("Béo phì", BMI.calculateBMI(149.9, 1));
    }
}
