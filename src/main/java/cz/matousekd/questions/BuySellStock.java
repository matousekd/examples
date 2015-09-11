package cz.matousekd.questions;

/**
 * Created by David.Matousek on 23.7.2015.
 * Find the best times to buy and sell a stock.
 * Find the best times to buy and sell a stock.
 * AP
 * You have an array for which the ith element is the price of a given stock on day "i".
 * <p>
 * If you are only allowed to buy one share of the stock and sell one share of the stock, make an algorithm to find the best times to buy and sell.
 * <p>
 * <p>
 * <p>
 * Read more: http://www.businessinsider.com/8-mind-bending-interview-questions-that-google-asks-its-engineers-2012-7?op=1#ixzz3gjdRP9KZ
 */
public class BuySellStock {

    private static final Integer[] PRICES = {5, 2, 5, 10, 3, 2, 15, 1};


    public static void main(String[] args) {

        Integer maxDiff = 0;
        Integer buy = 0;
        Integer sell = 0;

        for (int i = 0; i < PRICES.length; i++) {

            if(PRICES[i] < PRICES[buy]) {
                    buy = i;
            }

            int diff = PRICES[i] - PRICES[buy];
            if(diff > maxDiff ){
                sell = i;
                maxDiff = diff;
            }




        }

        if(buy > sell) {
            maxDiff = 0;
            int lastBuy = buy;
            for(int i =0; i < (lastBuy); i++){
                int diff = PRICES[sell] - PRICES[i];
                if(diff > maxDiff ){
                    buy = i;
                    maxDiff = diff;
                }
            }
        }

        System.out.println("Buy " + (buy + 1) + ".  day, sell " + (sell + 1) + ". day");

    }
}
