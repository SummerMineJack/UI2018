package com.zinc.ui2018;

import org.junit.Test;

/**
 * @author : HuangJian
 * @email : hjzxzone@gmail.com
 * @time : 2022/7/14 13:39
 * @desc :
 */
public class TestSort {
    private int[] array = {5, 12, 34, 6, 0, 7, 22, 8, 16};

    /**
     * 冒泡排序单元测试
     */
    @Test
    public void testBubble() {
        sort.BubbleSort bubbleSort = new sort.BubbleSort();
        System.out.print("排序前： ");
        printArray(array);
        bubbleSort.bubbleSort(array);
        System.out.print("排序后： ");
        printArray(array);
    }


    /**
     * 打印数组的公共方法
     *
     * @param arr
     */
    public void printArray(int[] arr) {
        for (int a = 0; a <= arr.length - 1; a++)
            System.out.print(arr[a] + " ");
        System.out.println();
    }
}
