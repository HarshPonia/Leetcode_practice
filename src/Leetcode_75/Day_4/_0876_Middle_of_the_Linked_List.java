package Leetcode_75.Day_4;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class _0876_Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        ListNode slowptr = head;
        ListNode fastptr = head;
        while(fastptr!=null && fastptr.next!=null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;
    }
}
