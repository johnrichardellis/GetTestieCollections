package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void testGetLast() {
        //given
        LinkedList cats = new LinkedList();
        cats.add("Henry");
        cats.add("Flounder");
        cats.add("Pasquale");
        cats.add("Dido");
        Object expected = "Lance Bass";


        // when
        Object actual = cats.getLast();

        // then
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void testPop() {
        //given
        LinkedList cats = new LinkedList();
        cats.add("Henry");
        cats.add("Flounder");
        cats.add("Pasquale");
        cats.add("Dido");
        Object expected = "Henry";



        // when
        Object actual = cats.pop();

        // then
        Assert.assertEquals(expected, actual);

    }
}
