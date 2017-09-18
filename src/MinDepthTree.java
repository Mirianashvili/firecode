/**
 * Created by Sandro on 9/18/2017.
 */
public class MinDepthTree {
    private class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
    }

    public int minTreeDepth(TreeNode root) {
        if(root != null){
            return Math.min(1 + minTreeDepth(root.left),1 + minTreeDepth(root.right));
        }
        return 0;
    }
}
