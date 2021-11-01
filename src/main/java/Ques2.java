import java.util.*;
class Ques2 {


        public static void main(String[] args)
        {

            int arr[] = { 0, 1, 0, 1, 0, 1, 0, 1, 1,0};

            int len = arr.length;

            sortBinaryArray(arr, len);
            System.out.print("sorted array is: ");
            for (int i = 0; i < len; i++)
                System.out.print(arr[i] + " ");
        }
    static void sortBinaryArray(int arr[], int n)
    {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 1) {
                j++;
                System.out.println(arr[i]+" "+arr[j]);
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
    }

