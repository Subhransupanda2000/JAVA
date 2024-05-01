package InterviewQuestions;

public class SumOfNumbersAtAddNumber {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        int sum=sumOfOddNumber(arr);
        System.out.println(sum);
    }
    public static int sumOfOddNumber(int []arr)
    {int total=0;
        for (int i=1;i< arr.length;i=i+2)
        {
            total=total+arr[i];
        }
        return total;
    }
}
