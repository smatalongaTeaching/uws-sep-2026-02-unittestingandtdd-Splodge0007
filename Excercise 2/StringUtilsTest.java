import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {
    
    @Test
    public void testCountVowelsWithEmptyString() {
        StringUtils utils = new StringUtils();
        assertEquals(0, utils.countVowels(""));
    }
    
    @Test
    public void testCountVowelsWithNoVowels() {
        StringUtils utils = new StringUtils();
        assertEquals(0, utils.countVowels("xyz"));
    }
    
    @Test
    public void testCountVowelsWithMixedCase() {
        StringUtils utils = new StringUtils();
        assertEquals(2, utils.countVowels("Hello"));
    }
    
    @Test
    public void testCountVowelsWithMultipleVowels() {
        StringUtils utils = new StringUtils();
        assertEquals(5, utils.countVowels("beautiful"));
    }
}

// Now implement StringUtils.java to make the tests pass
