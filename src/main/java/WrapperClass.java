public class WrapperClass {
    public static void main(String[] args) {
        int value1=99;

        Integer value2=value1;
        int value3= value2.intValue();//Integer object to int value
        String str="12";
        int value4= Integer.parseInt(str);//String to integer
        System.out.println(value4*2);
        Integer value4obj= Integer.valueOf(value4);//conversion of in value to Integer object
        System.out.println(value4obj);
    }
}
