package DSA_in_Java.Practice.Arrays;

public class Stock_Analysis {
    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }else{
                int profit = prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
    }
}
