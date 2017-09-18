import java.util.LinkedList;
import java.util.Queue;

public class FindBTNodeWithoutRecursion {

    private class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
    }

    public TreeNode findNode(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.peek();
            q.poll();
            if(node.data == val){
                return node;
            }
            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
        }
        return null;
    }
}
