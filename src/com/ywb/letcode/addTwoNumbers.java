package com.ywb.letcode;

public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(8);
        l1.next = l12;
        l12.next = l13;
        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(2);
        ListNode l23 = new ListNode(8);
        l2.next = l22;
        l22.next = l23;
        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(0);
        ListNode cur = resultHead;
        int carry = 0;
        while (l1 != null || l2 != null){
            int v1 = l1 == null ? 0: l1.val;
            int v2 = l2 == null ? 0: l2.val;
            int sum = v1 + v2 + carry;
            carry = sum / 10 ;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }

        }
        if(carry == 1){
            cur.next = new ListNode(1);
        }

        return resultHead.next;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }