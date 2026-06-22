class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int[][] pairs = new int[difficulty.length][2];
        
        for (int i = 0; i < difficulty.length; i++) {
            pairs[i][0] = difficulty[i];
            pairs[i][1] = profit[i];
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(worker);

        int maxProfit = 0;
        int totalMaxProfit = 0;
        int index = 0;

        for(int i = 0; i < worker.length; i++){
            while(index < difficulty.length && worker[i] >= pairs[index][0]){
                maxProfit = Math.max(maxProfit,pairs[index][1]);
                index++;

            }
            totalMaxProfit += maxProfit;
            

        }

        return totalMaxProfit;


        
    }
}