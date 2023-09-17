public class Recursion1 {
    public static void main(String[] args) {
        fun(10);
    }
    public static void fun(int x)
    {
        if(x<1)
        {
            return ;
        }
        System.out.println(x);
        fun(x-1);

    }
}
