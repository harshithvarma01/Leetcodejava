class Solution {
    public int maxProfit(int[] prices) {
        int minimum=Integer.MAX_VALUE;
        int maxi=0;
        for(int price:prices){
            if (price<minimum){
                minimum=price;
            }
            else{
                maxi=Math.max(maxi,price-minimum);
            }
        }
        return maxi;
    }
}
