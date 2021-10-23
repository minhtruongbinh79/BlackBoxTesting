import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecisionTableTesting {
    @Test
    public void testCalculateBMI1() {
        assertEquals("Invalid input", BMI.calculateBMI(0, 1.70));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Invalid input", BMI.calculateBMI(150.5, 1.70));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Invalid input", BMI.calculateBMI(60, -0.5));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Invalid input", BMI.calculateBMI(60, 2.15));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Thiếu cân", BMI.calculateBMI(40, 1.80));
    }

    @Test
    public void testCalculateBMI6() {
        assertEquals("Bình thường", BMI.calculateBMI(60.8, 1.72));
    }

    @Test
    public void testCalculateBMI8() {
        assertEquals("Thừa cân", BMI.calculateBMI(80.5, 1.80));
    }

    @Test
    public void testCalculateBMI11() {
        assertEquals("Béo phì", BMI.calculateBMI(150, 1.90));
    }
}
