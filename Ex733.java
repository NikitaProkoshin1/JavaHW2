package Homework2;

import java.util.Arrays;

public class Ex733 {
    public static void main(String[] args) {
        int[][] image = new int[][] {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 } };
        int sr = 1;
        int sc = 1;
        int color = 2;
        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, color)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        int oldColor = image[sr][sc];
        boat(image, sr, sc, color, oldColor);
        return image;
    }

    public static void boat(int[][] image, int sr, int sc, int color, int oldColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor) {
            return;
        }
        image[sr][sc] = color;
        boat(image, sr - 1, sc, color, oldColor);
        boat(image, sr + 1, sc, color, oldColor);
        boat(image, sr, sc - 1, color, oldColor);
        boat(image, sr, sc + 1, color, oldColor);
    }
}
