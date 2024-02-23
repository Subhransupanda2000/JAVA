  interface Interf
{
    public void m1(int n,int m);

}
class Test99
{
    public static void main(String[] args) {
        Interf f=(n,m)-> System.out.println(n+m);

        f.m1(5,6);

    }

}