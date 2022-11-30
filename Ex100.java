package Homework2;

public class Ex100 {
    static int res = 0;

    public static void main(String[] args) {
        TreeNode rootP = new TreeNode(1);
        addChildLeft(rootP, 2);
        addChildRight(rootP, 3);
        TreeNode rootQ = new TreeNode(1);
        addChildLeft(rootQ, 3);
        addChildRight(rootQ, 3);
        System.out.println(isSameTree(rootP, rootQ));
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            if (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) {
                return true;
            }
        }
        return false;
    }
}
