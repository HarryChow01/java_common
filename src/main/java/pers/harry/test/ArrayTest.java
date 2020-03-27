package pers.harry.test;

public class ArrayTest {

    void arrayTest1() {
        int[] array1 = new int[0];
        System.out.println("array1.length:" + array1.length);
    }
    public static void main(String[] args) {
        System.out.println("args.length:" + args.length);
        for (String arg : args) {
            System.out.println("arg:" + arg);
        }
        System.out.println();
        ArrayTest arrayTest = new ArrayTest();
        arrayTest.arrayTest1();
    }
}
