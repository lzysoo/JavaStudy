package tree;

import java.util.*;

public class BinaryTree {
    //private int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static List<TreeNode> nodeList = null;

    public void createBinTree(int[] arr) {
        nodeList = new LinkedList<TreeNode>();
        // 将一个数组的值依次转换为Node节点
        for (int nodeIndex = 0; nodeIndex < arr.length; nodeIndex++) {
            nodeList.add(new TreeNode(arr[nodeIndex]));
        }
        // 对前lastParentIndex-1个父节点按照父节点与孩子节点的数字关系建立二叉树
        for (int parentIndex = 0; parentIndex < arr.length / 2 - 1; parentIndex++) {
            // 左孩子
            nodeList.get(parentIndex).left = nodeList.get(parentIndex * 2 + 1);
            // 右孩子
            nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
        }
        // 最后一个父节点:因为最后一个父节点可能没有右孩子，所以单独拿出来处理
        int lastParentIndex = arr.length / 2 - 1;
        // 左孩子
        nodeList.get(lastParentIndex).left = nodeList.get(lastParentIndex * 2 + 1);
        // 右孩子,如果数组的长度为奇数才建立右孩子
        if (arr.length % 2 == 1) {
            nodeList.get(lastParentIndex).right = nodeList.get(lastParentIndex * 2 + 2);
        }
    }
    //前序遍历二叉树（递归法）
    public static void PreOrder(TreeNode node){
        if(node != null){
            System.out.print(node.val + " ");
            PreOrder(node.left);
            PreOrder(node.right);
        }
    }
    //前序遍历二叉树（非递归法）
    /*
     * 前序遍历，非递归实现
     * 1，先入栈根节点，输出根节点val值，再先后入栈其右节点、左结点；
     * 2，出栈左节点，输出其val值，再入栈该左节点的右节点、左节点；直到遍历完该左节点所在子树。
     * 3，再出栈右节点，输出其val值，再入栈该右节点的右节点、左节点；直到遍历完该右节点所在子树。
     * */
    public static void PreOrder1(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        if(root != null){
            stack.push(root);
        }
        while(!stack.empty()){
            TreeNode node = stack.pop();
            System.out.print(node.val + " ");
            if(node.right != null)
                stack.push(node.right);
            if(node.left != null)
                stack.push(node.left);
        }
    }
    //中序遍历二叉树（递归法）
    public static void InOrder(TreeNode node){
        if(node != null){
            InOrder(node.left);
            System.out.print(node.val + " ");
            InOrder(node.right);
        }
    }
    /*
     * 中序遍历，非递归实现
     * 1，首先从根节点出发一路向左，入栈所有的左节点；
     * 2，出栈一个节点，输出该节点val值，查询该节点是否存在右节点，
     * 若存在则从该右节点出发一路向左入栈该右节点所在子树所有的左节点；
     * 3，若不存在右节点，则出栈下一个节点，输出节点val值，同步骤2操作；
     * 4，直到节点为null，且栈为空。
     * */
    public static void InOrder1(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null || !stack.empty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            if(!stack.empty()){
                TreeNode node = stack.pop();
                System.out.print(node.val + " ");
                root = node.right;
            }
        }
    }
    //后序遍历二叉树（递归法）
    public static void PostOrder(TreeNode node){
        if(node != null){
            InOrder(node.left);
            InOrder(node.right);
            System.out.print(node.val + " ");
        }
    }
    //后序遍历二叉树（非递归实现）
    public static void PostOrder1(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> output = new Stack<TreeNode>();//构造一个中间栈来存储逆后序遍历的结果
        //Node node = root;
        while (root != null || stack.size() > 0) {
            if (root != null) {
                output.push(root);
                stack.push(root);
                root = root.right;
            } else {
                root = stack.pop();
                root = root.left;
            }
        }
        //System.out.println(output.size());
        while(!output.empty()){
            TreeNode node = output.pop();
            System.out.print(node.val + " ");
        }

    }
    //层次遍历（广度优先遍历）	（用队列，先进先出）
    public void LayerOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null)
            queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
        }
    }
    //测试类
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BinaryTree bt = new BinaryTree();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        bt.createBinTree(arr);
        TreeNode root = nodeList.get(0);
        System.out.print("后序遍历：");
        PostOrder1(root);
        System.out.println();
        System.out.println(root);
    }

}


