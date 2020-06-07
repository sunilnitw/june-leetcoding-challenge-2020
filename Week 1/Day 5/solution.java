class Solution {
    int arr[];
    public Solution(int[] w) {
        for(int i=1;i<w.length; i++){
            w[i] += w[i-1];
        }
        arr = w;
    }
    
    public int pickIndex() {
        int randomIndex = (int)(Math.random()*arr[arr.length-1]);
        return binarySearch(randomIndex+1);
    }
    private int binarySearch(int val){
        int l = 0, r = arr.length - 1;
        while(l<r){
            int m = (l+r)/2;
            if(arr[m]<val){
                l = m+1;
            } else {
                r = m;
            }
        }
        return l;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */