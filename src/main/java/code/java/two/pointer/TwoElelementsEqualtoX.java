package code.java.two.pointer;

public class TwoElelementsEqualtoX {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 9, 2, 8, 10, 11 };
        int search=17;
        searchElemnets(arr,search);
       // searchElemnetsWithTwoPointer(arr,search);
    }

    private static void searchElemnetsWithTwoPointer(int[] arr, int search)
    {
        int i = 0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==search)
            {
                System.out.println("From Two Pinter approach  ");
                System.out.println("firtst elelmnts is " + arr[i]);
                System.out.println("second elelmnts is "+ arr[j]);
                break;
            }else{
                j--;
                i++;
            }
        }

    }

    private static void searchElemnets(int[] arr, int search)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length-2;j++)
            {
                if(arr[i]+arr[j]==search){
                    System.out.println("firtst elelmnts is " + arr[i]);
                    System.out.println("second elelmnts is "+ arr[j]);
                    break;
                }else{
                    continue;
                }
            }
        }
    }
}
