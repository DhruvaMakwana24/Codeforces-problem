//Is your horseshoe on the other hoof?
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int result = unique(arr);
        System.out.println(result);
        sc.close();
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static int unique(int[] arr) {
        sort(arr); 
        int unique= 0;
        
        for (int i = 0; i < 4; i++) {
            
            if (i == 0 || arr[i] != arr[i - 1]) {
                unique++;
            }
        }
        return 4 - unique;
    }
}
