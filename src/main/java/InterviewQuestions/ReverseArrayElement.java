package InterviewQuestions;

public class ReverseArrayElement {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int num=arr.length-1;
        reverseAnArray(arr);
    }
   public static void reverseAnArray(int []arr)
    {
        for (int i= arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }


    }
}
