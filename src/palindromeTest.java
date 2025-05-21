
import org.junit.Assert;
import org.junit.Test;

public class NumberUtilityTest {
    private NumberUtility numberUtility = new NumberUtility();

    @Test
    public void testReverseNumber() {
        int result = numberUtility.reverseNumber(12345);
        Assert.assertEquals(54321, result);
    }

    @Test
    public void testReverseNumberWithZero() {
        int result = numberUtility.reverseNumber(10000);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testReverseNumberWithSingleDigit() {
        int result = numberUtility.reverseNumber(7);
        Assert.assertEquals(7, result);
    }

    @Test
    public void testReverseNumberWithNegative() {
        int result = numberUtility.reverseNumber(-12345);
        Assert.assertEquals(0, result);
    }
}
