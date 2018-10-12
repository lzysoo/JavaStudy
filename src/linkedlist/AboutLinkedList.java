package linkedlist;

import java.util.HashMap;

public class AboutLinkedList {

    /**
     * 打印链表
     * @param head
     */
    public void printLinkedList(ListNode head) {
        if (head != null){
            printLinkedList(head.next);
            System.out.println(head.val);
        }
    }

    /**
     * 判断链表是否有环
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
     * 找出链表环的入口
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
     * 找出两个链表的公共节点
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
     * 查找单链表的中间节点（快指针一次两步，慢指针一次一步，当快指针都到末尾时，慢指针刚好到中间）
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
     * 找出单链表倒数第k个节点
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
        while (p1.next != null){ //p1先走 k-1 步，当p1到底的时候，p2刚好在倒数第 k 个节点
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    /**
     *删除已排序链表中的重复节点
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
