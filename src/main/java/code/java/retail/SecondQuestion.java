package code.java.retail;

public class SecondQuestion {
    public static void main(String[] args) {
        SecondQuestion sq=new SecondQuestion();
        int[] arr= {2, 5, -1,  8, 3, 0, 9, 7};
        //int[] arr2= Collections.sort(arr);
        sq.getSum(arr);
        sq.getSum2(arr);

    }

    public void getSum(int[] k)
       {
           for( int i=0;i<k.length-1;i++)
           {
               int j=k.length-1;
               while(i<j)
               {
                   if( k[i] + k[j] == 8)
                   {
                       System.out.println("a and b are "+ k[i] +   k[j]);
                       break;
                   }
                   else{
                       j--;
                   }
               }
           }
       }

    private void getSum2(int[] arr)
    {

    }



}
