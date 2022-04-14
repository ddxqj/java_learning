package 二叉树;

import java.util.Scanner;

public class TreeNodeDemo {
    public static void main(String[] args) {
        TreeNode root = createNode();
        pretravel(root);
    }
    private static TreeNode createNode(){
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        if(value.equals("#")) return null;
        TreeNode node = new TreeNode(value);
        node.left=createNode();
        node.right=createNode();
        return node;
    }
    private static void pretravel(TreeNode root){
        if(root==null) return;
        System.out.println(root.value);
        pretravel(root.left);
        pretravel(root.right);
    }
}
