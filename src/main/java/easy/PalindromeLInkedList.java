package easy;

import common.ListNode;

public class PalindromeLInkedList {


    // 1 3 4 5 3 6

    //

    
    // 1 2 2 1
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2= new ListNode(2);
        ListNode listNode3= new ListNode(2);
        ListNode listNode4= new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
    }

    public boolean isPalindrome(ListNode head) {
        
    }

    private ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}

