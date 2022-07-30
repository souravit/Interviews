package SampleTest;

import java.util.ArrayList;
import java.util.List;

public class sap98 {
    static class TreeNode {
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

    public static void main(String[] args) {

        TreeNode t5_1 = new TreeNode(5, null, null);
        TreeNode t5_2 = new TreeNode(5, null, null);

        TreeNode t4 = new TreeNode(4, null, null);

        TreeNode t3_1 = new TreeNode(3, t4, t5_1);
        TreeNode t3_2 = new TreeNode(3, t5_2, null);

        TreeNode t2 = new TreeNode(2, t3_1, t3_2);

    }
}
