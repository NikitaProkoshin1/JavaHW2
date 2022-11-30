package Homework2;

import java.util.ArrayList;
import java.util.List;

public class Ex257 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        addChildLeft(root, 2);
        addChildRight(root, 3);
        addChildRight(root.left, 5);
        System.out.println(binaryTreePaths(root));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void addChildLeft(TreeNode parent, int val) {
        TreeNode child = new TreeNode(val);
        parent.left = child;
    }

    public static void addChildRight(TreeNode parent, int val) {
        TreeNode child = new TreeNode(val);
        parent.right = child;
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String ans2 = "";
        dfs(root, ans, ans2);
        return ans;
    }

    public static void dfs(TreeNode root, List<String> ans, String ans2) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            ans.add(ans2 + root.val);
        }
        dfs(root.left, ans, ans2 + root.val + "->");
        dfs(root.right, ans, ans2 + root.val + "->");
    }
}
