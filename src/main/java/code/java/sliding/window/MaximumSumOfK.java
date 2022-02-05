package code.java.sliding.window;

public class MaximumSumOfK {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        getMaxOfSum(arr,k);
        getMaxOfSumWithSlidingWindow(arr,k);
    }

    private static void getMaxOfSumWithSlidingWindow(int[] arr, int k)
    {
        int n= arr.length;
        if (n < k) {
            System.out.println("Invalid");
        }
        // get first k elelment sum
        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];
        int window_sum = max_sum;
        for(int i=k;i<n;i++) {
            window_sum= window_sum + arr[i] - arr[i - k];
            max_sum=Math.max(max_sum,window_sum);
        }
        System.out.println("max sum in window is  "+max_sum);
    }

    private static void getMaxOfSum(int[] arr, int k)
    {
        int sum=0;
        for(int i=0;i<arr.length-4+1;i++)
        {
            int temp_sum=0;
            for(int j=0;j<4;j++)
            {
                temp_sum=temp_sum+arr[i+j];
                sum = Math.max(temp_sum, sum);
            }
        }
        System.out.println("max sum is  "+sum);
    }
}
