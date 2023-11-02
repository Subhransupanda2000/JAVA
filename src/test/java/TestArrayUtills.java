import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestArrayUtills {
    @Test
    public void testReverseArray() {

        ArrayUtills arrayUtills = new ArrayUtills();
        int[] input1 = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] result = arrayUtills.reverseArray(input1);
        assertArrayEquals(expected, result);
    }

}
