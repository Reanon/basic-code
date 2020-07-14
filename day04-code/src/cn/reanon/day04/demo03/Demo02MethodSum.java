/**
 * Copyright (C), 2020-2020, 人生无限公司
 * FileName: Demo02MethodSum
 * Description: 计算1~100的和
 *
 * @create: 2020/7/14 15:35
 * @author Reanon
 * @version JDK1.8
 */
package cn.reanon.day04.demo03;

public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum());
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
