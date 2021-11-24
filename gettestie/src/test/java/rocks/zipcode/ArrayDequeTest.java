package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;

public class ArrayDequeTest {


    @Test
    public void testOffer() {
        //given
        ArrayDeque<String> lamps = new ArrayDeque<>();
        lamps.add("Tall lamp");
        lamps.add("Shiny lamp");
        lamps.add("Leg lamp");
        lamps.add("Blue pyramid lamp");
        String expected = "Blue pyramid lamp";

        // when
        boolean actual = lamps.offer("Bollywood");

        // then
        Assert.assertTrue(actual);

    }

    @Test
    public void test() {
        //given
        ArrayDeque<String> lamps = new ArrayDeque<>();
        lamps.add("Tall lamp");
        lamps.add("Shiny lamp");
        lamps.add("Leg lamp");
        lamps.add("Blue pyramid lamp");
        String expected = "Bollywood";


        // when
        String actual = lamps.getLast();

        // then
        Assert.assertNotEquals(expected, actual);

    }
}

