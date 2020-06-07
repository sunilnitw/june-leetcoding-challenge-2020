class Solution {
    public int change(int amount, int[] coins) {
        Arrays.sort(coins);
        int arr[] = new int[amount+1];
        arr[0] = 1;
        for(int i=0;i<coins.length;i++){
            int val = coins[i];
            for(int j=0;(j+val)<=amount;j++){
                if(arr[j] != 0){
                    arr[val+j] = arr[j] + arr[val+j];
                }
            }
        }
        return arr[amount];
    }
}