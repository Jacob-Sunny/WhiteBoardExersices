package Week2Exersice;
// Write a method that returns the number of nodes in a binary tree.



import javax.swing.tree.TreeNode;

public class NumberOfTreeNode {
    public static void main(String[] args) {


    }

    public static Integer getNumberOfNodes(TreeNode node){
        if(node==null){
            return 0;
        }
     //   return 1 + getNumberOfNodes(node.left()) + getNumberOfNodes(node.right());
        return 0 ;
    }
}
