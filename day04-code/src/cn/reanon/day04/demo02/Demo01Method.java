/**
 * Copyright (C), 2020-2020, 人生无限公司
 * FileName: Demo01Method
 * Description:
 *
 * @create: 2020/7/14 14:45
 * @author Reanon
 * @version JDK1.8
 */
package cn.reanon.day04.demo02;

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
