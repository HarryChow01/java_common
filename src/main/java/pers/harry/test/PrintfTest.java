package pers.harry.test;

import java.util.Date;

public class PrintfTest {
    void test() {
        Date date = new Date();
        //System.out.printf("%tY-%tm-%td%n", date);
        System.out.printf("%tF%n", date);
        System.out.printf("%tT%n", date);
        System.out.printf("%tF %tT%n", date, date);
    }

    public static void main(String[] args) {
        PrintfTest printfTest = new PrintfTest();
        printfTest.test();
    }
}
