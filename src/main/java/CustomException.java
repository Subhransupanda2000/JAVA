class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class CustomException {
    public static void main(String[] args) throws MyException {
        try {
            throw new MyException("Custom exception");
        } catch (MyException ex) {
            System.out.println("Caught");

            System.out.println(ex.getMessage());
        }
    }
}
