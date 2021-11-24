package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {

    @Test
    public void testSize() {
        //given
        ArrayList<String> phones = new ArrayList<String>();
        phones.add("iPhone SE 2020");
        phones.add("moto G6");
        phones.add("iPhone XR");
        phones.add("Alcatel Flip Phone");
        int expected = 4;

        // when
        int actual = phones.size();

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test() {
        //given
        ArrayList<String> phones = new ArrayList<String>();
        phones.add("iPhone SE 2020");
        phones.add("moto G6");
        phones.add("iPhone XR");
        phones.add("Alcatel Flip Phone");
        String expected = "moto G6";


        // when
        String actual = phones.get(1);


        // then
        Assert.assertEquals(expected, actual);

    }
}
