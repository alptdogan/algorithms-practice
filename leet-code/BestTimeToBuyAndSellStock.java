/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        //this solution doesn't work for the cases given as examples above, unfortunately.
        //however, it works for some cases such as ones below

        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {

            if (prices[i] < prices[prices.length - i - 1]) {
                for (int j = i; j < prices.length; j++) {

                    if (prices[j] >= prices[j + (prices.length - j - 1)]) {
                        profit = prices[j] - prices[i];
                    }
            }
            }
        }

        return profit;

    }

    public static void main(String[] args) {

        int[] prices1 = {2, 1, 4, 8};
        System.out.println(maxProfit(prices1));

        int[] prices2 = {2, 2, 3, 4, 5};
        System.out.println(maxProfit(prices2));

    }

}
