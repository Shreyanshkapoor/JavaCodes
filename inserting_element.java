import java.util.Scanner;

public class inserting_element {
    public static void main(String[] args) {
        int[] A = new int[10];
        A[0] = 1;
        A[1] = 10;
        A[2] = 21;
        A[3] = 6;
        A[4] = 11;
        A[5] = 31;
        int n=6;
        for (int i=0;i<n;i++) {
            System.out.print(A[i] + ",");
        }
        System.out.println(" ");
        int x=20;
        int index =2;
        for (int i = n; i >index; i--) {
            A[i] = A[i - 1];
        }
        A[index]=x;
        for (int i=0;i<n;i++) {
            System.out.print(A[i] + ",");
        }
        System.out.println(" ");
    }
}