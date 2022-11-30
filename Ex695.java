package ;

public class Ex695 {
    public static void main(String[] args) {
        int[][] grid = new int[][] {
                { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
        System.out.println(maxAreaOfIsland(grid));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    temp = boat(grid, i, j);
                    if (temp > max) {
                        max = temp;
                    }
                }
            }
        }
        return max;
    }

    public static int boat(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 2;
        return 1 +
                boat(grid, i - 1, j) +
                boat(grid, i + 1, j) +
                boat(grid, i, j - 1) +
                boat(grid, i, j + 1);
    }
}
