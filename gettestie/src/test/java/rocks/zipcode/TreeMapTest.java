package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void testIsEmpty() {
        //given
        TreeMap<Integer, Integer> famousNumbers = new TreeMap<>();


        // when
        boolean actual = famousNumbers.isEmpty();

        // then
        Assert.assertTrue(actual);

    }

    @Test
    public void test() {
        //given
        TreeMap<Integer, Integer> famousNumbers = new TreeMap<>();
        int expected = 10;

        // when
        int actual = famousNumbers.size();

        // then
        Assert.assertNotEquals(expected, actual);

    }
}
