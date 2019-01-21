package com.data.structure;

/**
 * 选择排序
 * 初始时在序列中找到最小（大）元素，放到序列的起始位置作为已排序序列
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，放到已排序序列的末尾。以此类推
 *
 * @author tao wei
 * @date 2019/1/21 14:20
 */
public class SelectionSort {

    private static int[] selectionSort(int[] arr) {
        // 总共要经过N-1轮比较
        for (int i=0; i < arr.length-1; i++) {      // i为已排序序列的末尾
            int min = i;
            //每轮需要比较的次数N-i
            for (int j = i + 1; j < arr.length; j++) {      // 未排序序列
                if (arr[j] < arr[min]) {        // 找出未排序序列中的最小值
                    // 记录最小值元素的下标
                    min = j;
                }
            }
            // 将最小值和i位置所在的值进行交换
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        arr = selectionSort(arr);
        for (Integer i : arr) {
            System.out.print(i);
            System.out.print('\t');
        }
        System.out.println();
    }

}
