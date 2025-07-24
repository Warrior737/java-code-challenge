package code.challenge.interviews;

public class BestTimeToBuyAndSellStocks {


    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,4};

        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] prices) {

        int minSoFar = prices[0];
        int ans = 0;

        for (int i = 0; i < prices.length; i++) {

            int profit = prices[i] - minSoFar;

            if (profit > ans) {
                ans = profit;
            }
            minSoFar = Math.min(prices[i], minSoFar);
        }

        return ans;
    }
}
