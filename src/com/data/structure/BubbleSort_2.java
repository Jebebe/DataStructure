package com.data.structure;

import java.util.Arrays;

/**
 * 冒泡排序改进版--鸡尾酒排序
 *
 * @author tao wei
 * @date 2019/1/18 19:36
 */
public class BubbleSort_2 {

    private static int[] bubbleSort(int[] arr) {
        long start = System.currentTimeMillis();
        //一个循环找出最大/小值，所以，只需循环数组长度的1/2次即可
        for (int i=0; i < arr.length/2; i++) {
            // 将最大的值排到队尾
            for (int j=i; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // 调换顺序
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("交换大值顺序：" + Arrays.toString(arr));
            }
            // 将最小的值排到队头
            for (int j=arr.length-1-(i+1); j > i; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                System.out.println("交换小值顺序：" + Arrays.toString(arr));
            }
            System.out.println("第" + i + "次排序结果：" + Arrays.toString(arr));
        }

        long end = System.currentTimeMillis();
        System.out.println("耗时(秒)：" + (end - start));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,4,8,6,1,9,0,3,7};
         bubbleSort(arr);
    }

}
