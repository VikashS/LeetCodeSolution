package code.java.retail;

public class FirstQuestion {
    public static void main(String[] args) {
       // 0,1,1,2,3,5,8
        int k=6;
        FirstQuestion fr=new FirstQuestion();
        //fr.generateNumber(4);
        fr.generateNumber1(4);
    }

    private void generateNumber1(int k)
    {
        int result01=1;
        int fres=0;
        for(int i=2;i<k-1;i++)
        {
            fres=fres+result01;
        }
    }

    private void generateNumber(int k)
    {
        System.out.println(generateNumberHelper(k));
    }

    private int generateNumberHelper(int k)
    {
        int temp = 0;
        int sum=0;
        // base
        if( k==0) temp=0;
            sum=0;
        if( k==1) temp=1;
            sum=1;
            // recur
        if( k>=2 )
        {
            sum=sum+generateNumberHelper(k);
        }

        return temp;
    }


}
