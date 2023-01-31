/*
Question : Given an integer array 'a' sorted in non-decreasing order, return an array of the sequence of each number
           sorted in non-decreasing order.
______________________________________________________________________________________________________________________
NOTE : Also take care of negative number.(Arrange the number in sequence)
 */
import java.util.Scanner;
public class Main {
    static int[] SortedArray(int[] arr){
        int n = arr.length;
        int left = 0 , right = n -1 , k = 0;
        int[] ans = new int[n];
        while (left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("ENTER THE ELEMENT OF ARRAY : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("FIRST, PRINTING THE ORIGINAL VALUE OF ARRAY :");
        for (int j : arr) {
            System.out.print(" " + j);
        }
        System.out.println();
        System.out.println("NOW, CALCULATING THE SQUARE OF GIVEN NUMBER AND PRINTING THE ARRAY IN SORTED FORM :");
        int[] temp = SortedArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + temp[i]);
        }
    }
}
