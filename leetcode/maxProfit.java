class Solution {
    // 贪心算法来做, 如果后一天的价格比前一天高，买进前一天，卖掉后一天。
    // 比如 [1, 2, 3, 4, 5], 买进 1, 卖出 2, 买进 2， 卖出 3。
    public int maxProfit(int[] prices) {
        int money = 0;
        int[] a = prices;
        for(int i = 0; i< prices.length-1; i++) {
            if(a[i] < a[i+1]) money += a[i+1] - a[i];
            
        }
        return money;
    }
}
