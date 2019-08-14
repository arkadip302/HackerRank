import java.util.*;
class Solution {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                for(int k=0;k<n;k++)
                 System.out.print(arr[k]+ " ");
                System.out.print("\n");
            }
            arr[j + 1] = key;
        }
        for(int k=0;k<n;k++)
        System.out.print(arr[k]+ " ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Solution ob = new Solution();
        ob.sort(arr);
    }
}
