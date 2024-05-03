```
package com.example.myproject;

public class Demo {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        int i = 0;
        int j = arr.length - 1;
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
        System.out.println( );

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (char c : arr) {
            System.out.print(c);
        }
    }
}

```
