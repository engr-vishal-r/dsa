package slidingWindow;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4,8};
        int maxProfit = getMaxProfit(prices);
        System.out.println("Max Profit: " + maxProfit);
    }

    public static int getMaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Buy at lowest price so far
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Sell now if better
            }
        }

        return maxProfit;
    }
}

