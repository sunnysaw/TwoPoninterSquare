import java.util.Scanner;

/*
Question : Find square root of any number by taking input from user.
 */
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, temp2;
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
        System.out.println("NOW, CALCULATING THE SQUARE OF GIVEN NUMBER :");
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            temp2 = temp * arr[i];
            System.out.print(" " + temp2);
            arr[i]++;
        }
    }
}
