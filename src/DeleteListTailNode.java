/**
 * Created by Sandro on 9/18/2017.
 */
public class DeleteListTailNode {

    private class ListNode{
        int data;
        ListNode next;
    }

    public ListNode deleteAtTail(ListNode head) {
        if(head == null || head.next == null) {
            return null;
        }
        ListNode last = head;
        while(last.next.next != null){
            last = last.next;
        }
        last.next = null;
        return head;
    }
}
