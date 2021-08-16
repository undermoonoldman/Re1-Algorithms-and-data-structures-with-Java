package com.undermoonoldman.re1.recursion.linked_list_problems_in_leetcode;/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

/***
 * 遍历解法，头节点区分对待
 */
class Solution {

    public ListNode removeElements(ListNode head, int val) {
        //跳过数值匹配的头节点
        while(head != null && head.val == val){
            ListNode delNode = head;
            head = head.next;
            //断开待删除节点与后续节点的连接
            delNode.next = null;
        }

        //处理过头节点后，头节点为空，说明链表已经空了，直接返回
        if(head == null) {
            return head;
        }

        //处理后续的节点
        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            }
            else {
                prev = prev.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution()).removeElements(head, 6);
        System.out.println(res);
    }
}