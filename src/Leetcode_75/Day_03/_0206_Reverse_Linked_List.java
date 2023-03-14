package Leetcode_75.Day_03;

public class _0206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        //    ListNode current = head;
        //     ListNode next = null;
        //     ListNode pre = null;
        //     while(current!=null){
        //         next= current.next;
        //         current.next = pre;
        //         pre = current;
        //         current = next;
        //     }
        //     return pre;

        if(head == null || head.next==null){
            return head;
        }
        else{
            ListNode nextNode = head.next;
            head.next = null;
            ListNode rest = reverseList(nextNode);
            nextNode.next = head;
            return rest;
        }
    }
}
