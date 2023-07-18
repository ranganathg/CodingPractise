package rangag.practise.lc;

public class MiddleOfLL876 {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode hare = head;
        ListNode tortoise = head;
        while (hare != null) {
            hare = hare.next == null ? null : hare.next.next;
            tortoise = tortoise.next;
        }
        return tortoise;
    }
}
