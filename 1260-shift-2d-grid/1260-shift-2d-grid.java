class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       int m = grid.length;
        int n = grid[0].length;

        List<List<Integer>> ans = new ArrayList<>();

        // Create empty rows
        for (int i = 0; i < m; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                ans.get(i).add(0);
            }
        }

        // Move every element to its new position
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int index = (i * n + j + k) % (m * n);

                int row = index / n;
                int col = index % n;

                ans.get(row).set(col, grid[i][j]);
            }
        }

        return ans;
        
    }
}