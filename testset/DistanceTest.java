import static org.junit.Assert.*;


import java.beans.Transient;


import org.junit.Test;
public class DistanceTest {


    @Test(expected=IllegalArgumentException.class)
    public void testX1TooSmall() {
        Distance.distance(-100, 75.1652, 21.3069, 157.8583);
    }


    @Test
    public void testValidDistance() {
        double result = Distance.distance(34.05, -118.25, 40.7128, -74.0060);
        assertEquals(2462.7836473726434, result, 0.001);
    }


    @Test(expected=IllegalArgumentException.class)
    public void testInvalidDistance() {
        Distance.distance(91, 0, -91, 0);
    }


    @Test(expected=IllegalArgumentException.class)
    public void testInvalidx2() {
        Distance.distance(0, 0, 100, 0);
    }


    @Test(expected=IllegalArgumentException.class)
    public void testInvalidY1() {
        Distance.distance(0, -190, 0, 0);
    }


    @Test(expected=IllegalArgumentException.class)
    public void testInvalidY2() {
        Distance.distance(0, 0, 0, 181);
    }


    @Test(expected=IllegalArgumentException.class)
    public void testInvalidCoordinates() {
        Distance.distance(91, 0, -91, 0);
    }






}

