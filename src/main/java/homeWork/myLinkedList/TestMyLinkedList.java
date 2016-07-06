package main.java.homeWork.myLinkedList;

import java.util.List;

/**
 * Created by mykhailov on 07.06.2016.
 */
public class TestMyLinkedList {


    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        List list = new MyLinkedList();
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int number6 = 6;
        String str1 = "one";
        String str2 = "two";
        String str3 = "three";
        String str4 = "four";
        String str5 = "five";
        String str6 = "six";
        String str7 = "set";


        list.add(5);
        int expected =1;
        int actual = list.size();
       boolean result = actual == expected;
        System.out.println("");



    }
}
