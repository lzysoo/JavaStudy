package linkedlist;

import java.util.HashMap;

public class AboutLinkedList {

    /**
     * ��ӡ����
     * @param head
     */
    public void printLinkedList(ListNode head) {
        if (head != null){
            printLinkedList(head.next);
            System.out.println(head.val);
        }
    }

    /**
     * �ж������Ƿ��л�
     * @param head
     * @return
     */
    public boolean isLoop(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (fast == null)
            return false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return !(fast == null || fast.next == null);
    }

    /**
     * �ҳ����������
     * @param head
     * @return
     */
    public ListNode findLoopPort(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        if (fast == null || fast.next ==null)
            return null;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                break;
        }

        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    /**
     * �ҳ���������Ĺ����ڵ�
     * @param head1
     * @param head2
     * @return
     */
    public ListNode findCommonNode(ListNode head1,ListNode head2) {
        ListNode cur1 = head1;
        ListNode cur2 = head2;

        HashMap<ListNode, Integer> map = new HashMap<>();
        while (cur1 != null) {
            map.put(cur1, null);
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            if (map.containsKey(cur2))
                return cur2;
            cur2 = cur2.next;
        }
        return null;
    }

    /**
     * ���ҵ�������м�ڵ㣨��ָ��һ����������ָ��һ��һ��������ָ�붼��ĩβʱ����ָ��պõ��м䣩
     * @param head
     * @return
     */
    public ListNode searchMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Mid" + slow.val);
        return slow;
    }

    /**
     * �ҳ�����������k���ڵ�
     * @param head
     * @param k
     * @return
     */
    public ListNode findKthToTail(ListNode head,int k){
        if (head == null || k <= 0)
            return null;
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 0; i < k; i++) {
            if (p1.next != null)
                p1 = p1.next;
            else
                return null;
        }
        while (p1.next != null){ //p1���� k-1 ������p1���׵�ʱ��p2�պ��ڵ����� k ���ڵ�
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    /**
     *ɾ�������������е��ظ��ڵ�
     * @param head
     * @return
     */
    public ListNode delSortedRepeating(ListNode head){
        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode pre = first;
        ListNode p = head;
        while (p != null){
            if (p.val == p.next.val) {
                int d = p.val;
                while (p != null && p.val == d){
                    p = p.next;
                }
                pre.next = p;
            }else {
                pre = p;
                p = p.next;
            }
        }
        return first.next;
    }
}
