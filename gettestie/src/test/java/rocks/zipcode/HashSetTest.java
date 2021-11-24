package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {

    @Test
    public void testAdd() {
        //given
        HashSet<String> cars = new HashSet<String>();
        cars.add("Toyota");
        cars.add("Pontiac");
        cars.add("Subaru");
        cars.add("Jeep");
        int expected = 4;


        // when
        int actual = cars.size();


        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test() {
        //given
        HashSet<Integer> lotto = new HashSet<Integer>();
        lotto.add(34);
        lotto.add(55);
        lotto.add(78);
        lotto.add(9);
        lotto.add(35);
        lotto.add(2);
//        boolean expected = true;

        // when
        boolean actual = lotto.contains(78);


        // then
        Assert.assertTrue(actual);

    }
}
