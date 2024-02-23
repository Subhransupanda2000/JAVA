public interface Interff {
    String m2();
    default String m1()
    {
        return "hello";
    }
}
    class Testing implements Interff {
        @Override
        public String m2() {
            return "hii";
        }
        public static void main(String[] args) {
            Testing t1 = new Testing();
            System.out.println(t1.m1());
            t1.m2();
        }

    }
