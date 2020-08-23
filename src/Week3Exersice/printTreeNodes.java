package Week3Exersice;
//1. If give tree node or root is null then return
//2. print the node if both right and left tree is null, that's your leaf node
//3. repeat the process with both left and right subtree
//
import javax.swing.tree.TreeNode;

public class printTreeNodes {
    public static void main(String[] args) {

    }

    public static void printLeaves(TreeNode node){

        if(node==null){
            return;
        }
        if(node.isLeaf()){
            System.out.printf("%s ", node.value);
        }
        printLeaves(node.left);
        printLeaves(node.right);

    }
}
