/**
 * Copyright (C), 2020-2020, 人生无限公司
 * FileName: Test4
 * Description:
 * 1. 定义类 Test4
 * 2. 定义 main方法
 * 3. 定义2个 byte类型变量,分别赋byte类型范围内最大值和最小值,并输出在控制台.
 * 4. 定义2个 short类型变量,分别赋short类型范围内的值,并输出在控制台.
 * 5. 定义2个 int类型变量,分别赋int类型范围内的值,并输出在控制台.
 * 6. 定义2个 long类型变量,分别赋超过int类型范围的值,并输出在控制台.
 *
 * @create: 2020/7/14 17:24
 * @author Reanon
 * @version JDK1.8
 */
package homework;

public class Test4 {
    public static void main(String[] args) {
        // 1个字节：定义2个 byte类型变量,分别赋byte类型范围内最大值和最小值,并输出在控制台.
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;

        // 4个字节：定义2个 int类型变量,分别赋int类型范围内的值,并输出在控制台.
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;

        // 2个字节：定义2个 short类型变量,分别赋short类型范围内的值,并输出在控制台.
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;

        // 8个字节：定义2个 long类型变量,分别赋超过int类型范围的值,并输出在控制台.
        long minLong = Long.MIN_VALUE;
        long maxLong= Long.MAX_VALUE;

        System.out.println(maxByte+" "+minByte);
        System.out.println(maxInt+" "+minInt);
        System.out.println(maxShort+" "+minShort);
        System.out.println(maxLong+" "+minLong);
    }
}
