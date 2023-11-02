public class ArrayUtills {
    public int[] reverseArray(int [] Array)
    {
        int length=Array.length;
        int [] reversedArray=new int[length];
        for (int i=0;i< Array.length;i++)
        {
            reversedArray[i]=Array[length-1-i];
        }

        return reversedArray;
    }
}
