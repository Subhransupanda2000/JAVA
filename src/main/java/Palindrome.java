public class Palindrome {
    public int palindromeNumber(int n)
    {
        int c,s=0,r;
        while (n<0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        return n;
    }
}
