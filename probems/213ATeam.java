import java.lang.*;
import java.util.*;
import java.io.*;

public class Solution{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        int result = 0;
        while(t-- > 0)
        {
            int[] arr = new int[3];
            for(int i = 0 ; i < 3 ;i++)
            {
               arr[i] = sc.nextInt();
            }
            int cnt = 0 ; 
            for(int i = 0 ; i < 3 ; i++)
            {
                if(arr[i] == 1)
                {
                    cnt++;
                }
            }
            if(cnt >= 2)
            {
                result++;
            }
            
            
        }
        System.out.println(result);
    }
}