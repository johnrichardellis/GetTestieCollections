package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
}


//public class IteratorTest {
//
//    @Test
//    public void test() {
//        //given
//
//
//        // when
//
//
//        // then
//
//
//    }
//
//    @Test
//    public void test() {
//        //given
//
//
//        // when
//
//
//        // then
//
//
//    }
//}
//
//public class PriorityQueueTest {
//
//    @Test
//    public void test() {
//        //given
//
//
//        // when
//
//
//        // then
//
//
//    }
//
//    @Test
//    public void test() {
//        //given
//
//
//        // when
//
//
//        // then
//
//
//    }
//
//    public class ComparableTest {
//
//        @Test
//        public void test() {
//            //given
//
//
//            // when
//
//
//            // then
//
//
//        }
//
//        @Test
//        public void test() {
//            //given
//
//
//            // when
//
//
//            // then
//
//
//        }
//    }
//}
