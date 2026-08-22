class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 0;
        int l = 1; 
        for (int pile : piles) {
            k = Math.max(k, pile); 
        }
        
        int a = Integer.MAX_VALUE;
        
        // CONVERTED TO BINARY SEARCH:
        while (l <= k) {
            int i = l + (k - l) / 2; // Find the middle speed
            int m = isFin(piles, i, h);
            
            if (m != 0) { // If 'i' is a valid speed
                a = Math.min(a, m); // Track the minimum valid speed
                k = i - 1;          // Look for a smaller speed in the left half
            } else {
                l = i + 1;          // Speed 'i' is too slow, look in the right half
            }
        }
        return a;
    }
    
    private int isFin(int[] piles, int i, int h) {
        long time = 0; 

        for (int pile : piles) {
            time += (long)(pile + i - 1) / i; 
            
            if (time > h)
                return 0;
        }
        return i;
        
    }
}