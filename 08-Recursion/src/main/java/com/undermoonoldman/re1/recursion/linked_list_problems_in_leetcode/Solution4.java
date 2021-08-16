package com.undermoonoldman.re1.recursion.linked_list_problems_in_leetcode;/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

/***
 * 递归解法，把一个链表看成两部分，头结点与另一个链表
 */
class Solution4 {

    public ListNode removeElements(ListNode head, int val) {
        // 递归到底情况，链表为空，直接返回
        if(head == null){
            return head;
        }

        //链表不为空，继续往下执行

        //检查如果头结点需要排除，新的链表头结点肯定在当前头结点之后的位置里产生
        if(head.val == val){
            return removeElements(head.next, val);
        }

        //头结点不需要排除的情况下，把当前头结点与当前头结点之后的链表中产生的新头结点连接起来
        head.next = removeElements(head.next, val);

        //头结点不需要排除情况下的返回
        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution4()).removeElements(head, 6);
        System.out.println(res);
    }
}