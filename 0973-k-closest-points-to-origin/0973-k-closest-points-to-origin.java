class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (a, b) -> {
            double d1 = Math.sqrt(a[0] * a[0] + a[1] * a[1]);
            double d2 = Math.sqrt(b[0] * b[0] + b[1] * b[1]);

            return Double.compare(d1, d2);
        });

        return Arrays.copyOf(points, k);
        
    }
}