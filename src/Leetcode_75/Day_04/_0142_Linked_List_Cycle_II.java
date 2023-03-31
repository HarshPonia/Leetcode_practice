//package Leetcode_75.Day_4;
//
//public class _0142_Linked_List_Cycle_II
//{
//    public ListNode detectCycle(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast) {
//                // There's a cycle, find the node where the cycle begins
//                ListNode ptr = head;
//                while (ptr != slow) {
//                    ptr = ptr.next;
//                    slow = slow.next;
//                }
//                return ptr;
//            }
//        }
//
//        // There's no cycle
//        return null;
//
//    }
//}
