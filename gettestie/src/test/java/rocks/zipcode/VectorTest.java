package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void testCapacity() {
        //given
        Vector<String> famousClowns = new Vector<>();
        famousClowns.add("Oleg Popov");
        famousClowns.add("John Wayne Gacy");
        famousClowns.add("Emmett Kelly");
        famousClowns.add("Joseph Grimaldi");
        famousClowns.add("Grock");
        int expected = 55;


        // when
        int actual = famousClowns.capacity();

        // then
        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void test() {
        //given
        Vector<String> famousClowns = new Vector<>();
        famousClowns.add("Oleg Popov");
        famousClowns.add("John Wayne Gacy");
        famousClowns.add("Emmett Kelly");
        famousClowns.add("Joseph Grimaldi");
        famousClowns.add("Grock");
        Object expected = "Some cat named Randy";


        // when
        Object actual = famousClowns.clone();

        // then
        Assert.assertNotEquals(expected, actual);

    }
}
