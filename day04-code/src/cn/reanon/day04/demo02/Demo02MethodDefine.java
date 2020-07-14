/**
 * Copyright (C), 2020-2020, 人生无限公司
 * FileName: Demo02MethodDefine
 * Description:
 *
 * @create: 2020/7/14 14:51
 * @author Reanon
 * @version JDK1.8
 */
package cn.reanon.day04.demo02;

/*
 * 定义两个数字相加的方法
 * */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
    }
    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

}
