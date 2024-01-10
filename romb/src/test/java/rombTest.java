import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;

public class rombTest {
    Romb romb;

    @BeforeTest
    public void setup() {
        this.romb = new Romb();
    }
    @Test
    public void testCalcArea() {
        double actual = this.romb.calcArea(27.0);
        double expected = 21899.090827700194;
        Assert.assertEquals(actual, expected, 0.1, "Hiba! A megadott érték nem egyezik a várt értékkel!");
    }
    @Test
    public void testCalcRange() {
        double actual2 = this.romb.calcRange(59.0);
        double expected2 = 236.0;
        Assert.assertEquals(actual2, expected2, 0.1, "Hiba! A megadott érték nem egyezik a várt értékkel!");
    }
    @Test
    public void testCalcAreaNotWorking() {
        double actual3 = this.romb.calcArea(27.0);
        double expected3 = 1.0;
        Assert.assertEquals(actual3, expected3, 0.1, "Hiba! A megadott érték nem egyezik a várt értékkel!");
    }
    @Test
    public void testCalcRangeNotWorking() {
        double actual4 = this.romb.calcRange(55.0);
        double expected4 = 1.0;
        Assert.assertEquals(actual4, expected4, 0.1, "Hiba! A megadott érték nem egyezik a várt értékkel!");
    }
}
