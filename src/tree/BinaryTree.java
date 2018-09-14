package tree;

import java.util.*;

public class BinaryTree {
    //private int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static List<TreeNode> nodeList = null;

    public void createBinTree(int[] arr) {
        nodeList = new LinkedList<TreeNode>();
        // ��һ�������ֵ����ת��ΪNode�ڵ�
        for (int nodeIndex = 0; nodeIndex < arr.length; nodeIndex++) {
            nodeList.add(new TreeNode(arr[nodeIndex]));
        }
        // ��ǰlastParentIndex-1�����ڵ㰴�ո��ڵ��뺢�ӽڵ�����ֹ�ϵ����������
        for (int parentIndex = 0; parentIndex < arr.length / 2 - 1; parentIndex++) {
            // ����
            nodeList.get(parentIndex).left = nodeList.get(parentIndex * 2 + 1);
            // �Һ���
            nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
        }
        // ���һ�����ڵ�:��Ϊ���һ�����ڵ����û���Һ��ӣ����Ե����ó�������
        int lastParentIndex = arr.length / 2 - 1;
        // ����
        nodeList.get(lastParentIndex).left = nodeList.get(lastParentIndex * 2 + 1);
        // �Һ���,�������ĳ���Ϊ�����Ž����Һ���
        if (arr.length % 2 == 1) {
            nodeList.get(lastParentIndex).right = nodeList.get(lastParentIndex * 2 + 2);
        }
    }
    //ǰ��������������ݹ鷨��
    public static void PreOrder(TreeNode node){
        if(node != null){
            System.out.print(node.val + " ");
            PreOrder(node.left);
            PreOrder(node.right);
        }
    }
    //ǰ��������������ǵݹ鷨��
    /*
     * ǰ��������ǵݹ�ʵ��
     * 1������ջ���ڵ㣬������ڵ�valֵ�����Ⱥ���ջ���ҽڵ㡢���㣻
     * 2����ջ��ڵ㣬�����valֵ������ջ����ڵ���ҽڵ㡢��ڵ㣻ֱ�����������ڵ�����������
     * 3���ٳ�ջ�ҽڵ㣬�����valֵ������ջ���ҽڵ���ҽڵ㡢��ڵ㣻ֱ����������ҽڵ�����������
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
    //����������������ݹ鷨��
    public static void InOrder(TreeNode node){
        if(node != null){
            InOrder(node.left);
            System.out.print(node.val + " ");
            InOrder(node.right);
        }
    }
    /*
     * ����������ǵݹ�ʵ��
     * 1�����ȴӸ��ڵ����һ·������ջ���е���ڵ㣻
     * 2����ջһ���ڵ㣬����ýڵ�valֵ����ѯ�ýڵ��Ƿ�����ҽڵ㣬
     * ��������Ӹ��ҽڵ����һ·������ջ���ҽڵ������������е���ڵ㣻
     * 3�����������ҽڵ㣬���ջ��һ���ڵ㣬����ڵ�valֵ��ͬ����2������
     * 4��ֱ���ڵ�Ϊnull����ջΪ�ա�
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
    //����������������ݹ鷨��
    public static void PostOrder(TreeNode node){
        if(node != null){
            InOrder(node.left);
            InOrder(node.right);
            System.out.print(node.val + " ");
        }
    }
    //����������������ǵݹ�ʵ�֣�
    public static void PostOrder1(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> output = new Stack<TreeNode>();//����һ���м�ջ���洢���������Ľ��
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
    //��α�����������ȱ�����	���ö��У��Ƚ��ȳ���
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
    //������
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BinaryTree bt = new BinaryTree();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        bt.createBinTree(arr);
        TreeNode root = nodeList.get(0);
        System.out.print("���������");
        PostOrder1(root);
        System.out.println();
        System.out.println(root);
    }

}


