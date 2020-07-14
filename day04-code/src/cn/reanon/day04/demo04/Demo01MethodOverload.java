/**
 * Copyright (C), 2020-2020, 人生无限公司
 * FileName: Demo01MethodOverload
 * Description:
 *
 * @create: 2020/7/14 15:55
 * @author Reanon
 * @version JDK1.8
 */
package cn.reanon.day04.demo04;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
    }

    public static boolean isSame(int a, int b) {
        boolean same = a == b;
        return same;
    }

    public static boolean isSame(byte a, byte b) {
        boolean same = a == b;
        return same;
    }

    public static boolean isSame(short a, short b) {
        boolean same = a == b;
        return same;
    }
}
