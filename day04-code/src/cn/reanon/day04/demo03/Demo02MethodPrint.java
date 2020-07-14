/**
 * Copyright (C), 2020-2020, 人生无限公司
 * FileName: Demo02MethodPrint
 * Description:
 *
 * @create: 2020/7/14 15:40
 * @author Reanon
 * @version JDK1.8
 */
package cn.reanon.day04.demo03;

public class Demo02MethodPrint {
    public static void main(String[] args) {
        printHelloWorld(9);
    }
    public static void printHelloWorld(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Hello,World！！");
        }
    }
}
