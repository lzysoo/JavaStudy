package tree;

/**
 * 剑指offer-重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 *
 * 思路：
 *      （1）扫描中序遍历序列，找到根节点的位置
 *      （2）在中序序列中，根节点前面的为左子树，后面的为右子树，确定左右子树的个数
 *      （3）根据左右子树的前序、中序遍历序列，再重复（1）、（2）分别构建左右子树（递归）
 */

public class RebuildBinaryTree {
    public static void main(String[] args){
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        TreeNode node=reConstructBinaryTree(pre, in);
        System.out.println(node.val);//返回的是根
    }

    public static TreeNode reConstructBinaryTree(int[] pre,int[] in){
        TreeNode node = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return node;
    }
    public static TreeNode reConstructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
        if(startPre > endPre || startIn > endIn)
            return null;
        TreeNode node = new TreeNode(pre[startPre]);
        for(int i= startIn;i <= endIn;i++){
            if(in[i] == pre[startPre]){//扫描二叉树找到根节点所在位置
                node.left = reConstructBinaryTree(pre, startPre+1, endPre, in, startIn, i-1);//递归调用该方法，构建左子树
                node.right = reConstructBinaryTree(pre, i-startIn+startPre+1, endPre, in, i+1, endIn);//递归调用该方法，构建右子树
            }
        }
        return node;
    }

}
