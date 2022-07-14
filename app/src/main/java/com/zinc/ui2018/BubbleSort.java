package sort;

/**
 * @author jsyuger
 * 该类为冒泡排序算法
 */
public class BubbleSort {

    //该方法为冒泡排序的
    public void bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 1; j <= length - 1; j++) {
                if (i < j && arr[i] > arr[j]) { //交换条件很重要
                    swapper(arr, i, j);
                }
            }
        }
    }

    //数组交换两个数字的值
    public void swapper(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}