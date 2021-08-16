package com.undermoonoldman.re1.recursion.debug_recursive_solution;

/**
 * @author Arthur-DeskTop
 */
public class Solution {
    /**
     * 为了方便查看递归深度，增加了一个深度参数，每次调用递归时深度都会累加
     * @param head
     * @param val
     * @param depth
     * @return
     */
    public ListNode removeElements(ListNode head, int val, int depth) {

        String depthString = generateDepthString(depth);

        //打印下当前深度信息
        System.out.print(depthString);

        //打印下当前函数的功能：要从以哪个节点为头的链表中移除哪个目标值
        System.out.println("Call: remove " + val + " in " + head);

        //头节点为空，符合返回条件
        if(head == null){
            //打印下当前深度信息
            System.out.print(depthString);

            //在返回前再打印下链表信息
            System.out.println("Return: " + head);
            return head;
        }

        //继续向下递归时深度信息要累加
        ListNode res = removeElements(head.next, val, depth + 1);

        //下层递归返回后，打印下当前深度信息
        System.out.print(depthString);

        //打印下当前函数完成后的效果
        System.out.println("After remove " + val + ": " + res);

        //定义最终返回的链表头节点
        ListNode ret;

        //当前头节点的值与待删除的值匹配，返回之前调用递归的返回值
        if(head.val == val) {
            ret = res;
        } else{
            //不匹配，把当前头节点与之前调用递归的返回值连接起来，返回当前头节点
            head.next = res;
            ret = head;
        }

        //打印下当前深度信息
        System.out.print(depthString);

        //在返回前再打印下链表信息
        System.out.println("Return: " + ret);

        return ret;
    }

    /**
     * 打印输出深度字符串，深度约深，串长度越长
     * @param depth
     * @return
     */
    private String generateDepthString(int depth){
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < depth ; i ++) {
            res.append("--");
        }
        return res.toString();
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution()).removeElements(head, 6, 0);
        System.out.println(res);
    }

}
