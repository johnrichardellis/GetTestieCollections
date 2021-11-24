package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void testSize() {
        //given
        TreeSet nsync = new TreeSet();
        nsync.add("Lance Bass");
        nsync.add("JC Chasez");
        nsync.add("Justin Timberlake");
        nsync.add("Chris Kirkpatrick");
        nsync.add("Joey the Fat One");
        nsync.clear();

        int expected = 0;


        // when
        int actual = nsync.size();

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test() {
        //given
        TreeSet nsync = new TreeSet();
        nsync.add("Lance Bass");
        nsync.add("JC Chasez");
        nsync.add("Justin Timberlake");
        nsync.add("Chris Kirkpatrick");
        nsync.add("Joey the Fat One");
        Object expected = "Lance Bass";


        // when
        Object actual = nsync.last();

        // then
        Assert.assertEquals(expected, actual);

    }
}
