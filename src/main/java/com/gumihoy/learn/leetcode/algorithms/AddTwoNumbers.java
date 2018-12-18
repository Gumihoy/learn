package com.gumihoy.learn.leetcode.algorithms;

import org.junit.Test;

/**
 * @author kongtong.ouyang on 2018/12/7.
 */
public class AddTwoNumbers {


    @Test
    public void testAddTwoNumbers() {
        ListNode l1 = null;
        ListNode l2 = null;
        addTwoNumbers(l1, l2);
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode root = new ListNode(0);
        ListNode curr = root;

        int carry = 0;
        while (l1 != null
                || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int val = carry + x + y;

            carry = val / 10;
            curr.next = new ListNode(val % 10);
            curr = curr.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return root.next;
    }

    public class ListNode {
        protected int val;
        protected ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
