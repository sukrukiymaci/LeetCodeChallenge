/*
Return the root node of a binary search tree that matches the given preorder traversal.

(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)

It's guaranteed that for the given test cases there is always possible to find a binary search tree with the given requirements.

Example 1:

Input: [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]

Constraints:

1 <= preorder.length <= 100
1 <= preorder[i] <= 10^8
The values of preorder are distinct.



*/

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
 
 
// It is used a recursive approach
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        //adds each element in array to tree using recursive addElement function
        for(int i = 1; i < preorder.length; i++) {
            addElement(root, preorder[i]);
        }
        return root;
    }
    //Based on the value in the node adds new element to right or left
    public TreeNode addElement(TreeNode node, int val) {
        if(Objects.isNull(node))
            return new TreeNode(val);
        else {
            if(node.val > val)
                node.left = addElement(node.left, val);
            else 
                node.right = addElement(node.right, val);
            return node;
        }
    }
}
