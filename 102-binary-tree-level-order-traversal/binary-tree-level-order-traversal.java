/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    private void nthlevel(TreeNode root,int lvl,int levels,List<Integer>arr){
        if(root==null) return;
        if(lvl==levels) arr.add(root.val);
        nthlevel(root.left,lvl+1,levels,arr);
        nthlevel(root.right,lvl+1,levels,arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        int levels=level(root);
        for(int i=0;i<=levels-1;i++){
            List<Integer> arr=new ArrayList<>();
            nthlevel(root,0,i,arr);
            ans.add(arr);
        }
        return ans;
    }
}