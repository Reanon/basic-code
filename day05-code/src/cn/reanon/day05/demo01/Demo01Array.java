/**
 * Copyright (C), 2020-2020, 人生无限公司
 * FileName: Demo01Array
 * Description:
 *
 * @create: 2020/7/14 16:12
 * @author Reanon
 * @version JDK1.8
 */
package cn.reanon.day05.demo01;

public class Demo01Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        printArray(arr);
        reverseArray(arr);
        printArray(arr);
    }

    public static void reverseArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
    public static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
