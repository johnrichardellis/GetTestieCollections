package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    @Test
    public void testIsEmpty() {
        //given
        HashMap<String, Integer> howOld = new HashMap<>();
        howOld.put("John", 34);
        howOld.put("Patty", 30);
        howOld.put("Johnny", 4);
        howOld.put("Tommy", 2);


        // when
        boolean actual = howOld.isEmpty();

        // then
        Assert.assertFalse(actual);

    }

    @Test
    public void testClear() {
        //given
        HashMap<String, Integer> howOld = new HashMap<>();
        howOld.put("John", 34);
        howOld.put("Patty", 30);
        howOld.put("Johnny", 4);
        howOld.put("Tommy", 2);
        howOld.clear();
        Integer expected = 0;

        // when
        Integer actual = howOld.size();

        // then
        Assert.assertEquals(expected, actual);

    }
}
