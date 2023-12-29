public class BuySell {
//	Best Time to Buy and Sell Stock
//
//	You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//	You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//	Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//
//	*Input: prices = [7,1,5,3,6,4]
//	Output: 5
//	Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//	Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*
   
	public static void main(String[] args) {
	
		int[] prices = {7,1,5,3,6,4};
		 int minIndex = 0;
		 
		    for (int i = 1; i < prices.length; i++) {
		        if (prices[i] < prices[minIndex]) {
		            minIndex = i;
		        }
		    }
		    
		    int maxIndex =minIndex;
            
		    for (int i = minIndex+1; i < prices.length; i++) {
		        if (prices[i] > prices[maxIndex]) {
		            maxIndex = i;
		        }
		    }
		 
		    
		    int profit = prices[maxIndex]-prices[minIndex];
		    
		    
		    System.out.println("The best day for buy stock in given Array :"+minIndex);
		    System.out.println("The best day for sell stock in given Array :" +maxIndex);
		    System.out.println("maximum profit  :"+profit);
    	
	}
}
