package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class StackTest {

    @Test
    public void testSearch() {
        //given
        Stack thingsThatAreMysterious = new Stack();
        thingsThatAreMysterious.add("enigmas");
        thingsThatAreMysterious.add("ducks");
        thingsThatAreMysterious.add("birds");
        thingsThatAreMysterious.add("mimes");
        thingsThatAreMysterious.add("frank snyder");
        int expected = 4;


        // when
        int actual = thingsThatAreMysterious.search("ducks");

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test() {
        //given
        Stack thingsThatAreMysterious = new Stack();
        thingsThatAreMysterious.add("enigmas");
        thingsThatAreMysterious.add("ducks");
        thingsThatAreMysterious.add("birds");
        thingsThatAreMysterious.add("mimes");
        thingsThatAreMysterious.add("frank snyder");
        Object expected = "frank snyder";

        // when
        Object actual = thingsThatAreMysterious.pop();

        // then
        Assert.assertEquals(expected, actual);

    }
}
