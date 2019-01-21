package com.data.structure;

/**
 * 冒泡排序：
 * 通过嵌套for循环依次将最大的数向后排序
 *
 * @author tao wei
 * @date 2019/1/18 10:59
 * @description TODO
 */
public class BubbleSort {

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }

    private static int[] bubbleSort(int[] arr) {

        long start = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {

            // 设定一个标记，若为true，则表示此次循环没有进行交换
            // 也就是待排序列已经有序，排序已经完成。
            boolean flag = true;

            for (int j = 0; j < arr.length - i; j++) {

                // 如果后一个元素大于前一个元素，则进行位置调换，否则不进行调换
                if (arr[j] > arr[j + 1]) {  //升序排序
                // if (arr[j] < arr[j + 1]) {   //降序排序
                    swap(arr, j);

                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end-start));
        return arr;
    }

    public static void main(String[] args) {
        // 从小到大冒泡排序
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        arr = bubbleSort(arr);

        System.out.println("冒泡排序结果：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print('\t');
        }
        System.out.println();
    }

}
