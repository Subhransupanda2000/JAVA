import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestPalindrome {
   @Test
   public void TestPalindromeNumber()
    {   int input1=121;
        Palindrome palindrome=new Palindrome();
        int result=palindrome.palindromeNumber(input1);
        int expected=121;
        assertEquals(expected, result);


    }
}
