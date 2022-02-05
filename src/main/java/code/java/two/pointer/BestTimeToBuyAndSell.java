package code.java.two.pointer;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int prices[] = {3,1,5,3,6,4};
        BestTimeToBuyAndSell b1=new BestTimeToBuyAndSell();
        int result=b1.maxProfit(prices);
        System.out.println(result);
    }

    public int maxProfitOnlyOnce(int[] prices) {
        int min=prices[0];
        int max=Integer.MIN_VALUE;
        for( int i=0;i<prices.length;i++)
        {
            int profit=prices[i]-min;
           if (prices[i] < min) min=prices[i];
           if(profit>max) max=profit;
        }
        return max;
    }

    public int maxProfit(int[] prices) {

        return 1;
    }


}
