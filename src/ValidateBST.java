
public class ValidateBST {

    private class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
    }

    public static boolean validateBST(TreeNode root) {
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static boolean isBST(TreeNode root,int min,int max){
        if (root != null) {
            if (root.data > max || root.data < min) {
                return false;
            }
            return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
        }

        return true;
    }
}
