package com.undermoonoldman.re1.recursion.linked_list_problems_in_leetcode;/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

/***
 * 与Solution1几乎一样，省略了把数值匹配节点与后续节点断开连接的操作
 */
class Solution2 {

    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val) {
            head = head.next;
        }

        if(head == null) {
            return head;
        }

        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution2()).removeElements(head, 6);
        System.out.println(res);
    }
}