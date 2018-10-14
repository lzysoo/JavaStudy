package linkedlist;

public class ReverseList {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(null);

        ListNode h = head;
        System.out.print("反转前：");
        while(h != null){
            System.out.print(h.getVal() + " ");
            h = h.getNext();
        }
        System.out.println();

        head = reverseList(head);
        System.out.print("反转后：");
        while (head != null){
            System.out.print(head.getVal() + " ");
            head = head.getNext();
        }
    }

    public static ListNode reverseList(ListNode head){
        if(head == null)
            return null;
        ListNode pre = null;
        ListNode next = null;
        while(head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
