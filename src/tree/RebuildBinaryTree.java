package tree;

/**
 * ��ָoffer-�ؽ�������
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}��
 * ���ؽ������������ء�
 *
 * ˼·��
 *      ��1��ɨ������������У��ҵ����ڵ��λ��
 *      ��2�������������У����ڵ�ǰ���Ϊ�������������Ϊ��������ȷ�����������ĸ���
 *      ��3����������������ǰ������������У����ظ���1������2���ֱ𹹽������������ݹ飩
 */

public class RebuildBinaryTree {
    public static void main(String[] args){
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        TreeNode node=reConstructBinaryTree(pre, in);
        System.out.println(node.val);//���ص��Ǹ�
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
            if(in[i] == pre[startPre]){//ɨ��������ҵ����ڵ�����λ��
                node.left = reConstructBinaryTree(pre, startPre+1, endPre, in, startIn, i-1);//�ݹ���ø÷���������������
                node.right = reConstructBinaryTree(pre, i-startIn+startPre+1, endPre, in, i+1, endIn);//�ݹ���ø÷���������������
            }
        }
        return node;
    }

}
