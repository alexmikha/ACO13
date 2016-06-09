package homeWork.myString;

/**
 * Created by mykhailov on 29.05.2016.
 */
public class MyStringTDD {


    public static void main(String[] args) {


        String str1 = " I am working first my program ";
        String str2 = "I am working first my program";
        String str3 = "I am working second my program";
        String str4 = "second";
        String str5 = " great";
        String str6 = "I am working first my program great";
        String str7 = "i am working first my program";
//        String str7 = "";
        String str8 = "I AM WORKING FIRST MY PROGRAM";


        MyString myString1 = new MyString(str7);
        MyString myString2 = new MyString(str2);
        MyString myString3 = new MyString(str3);
        MyString myString4 = new MyString(str5);
        MyString myString5 = new MyString(str6);
        MyString myString6 = new MyString(str4);
        MyString myString7 = new MyString(str1);
        MyString myString8 = new MyString(str8);

        System.out.println("Method name - toString - " + myString2);

        System.out.print("Method name - charAt - ");
        int i;
        for (i = 0; i < myString3.length(); i++) {
            System.out.print(myString3.charAt(i));
        }
        System.out.println();


        MyString expected1 = myString5;
        MyString actual1 = myString2.concat(myString4);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "concat"
                , expected1.equals(actual1), expected1, actual1);


        boolean expected2 = true;
        boolean actual2 = myString1.equals(myString1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "equals"
                , expected2 == actual2, expected2, actual2);


        MyString expected3 = myString1;
        MyString actual3 = myString2.toLowerCase();
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "toLowerCase"
                , expected3.equals(actual3), expected3, actual3);

        MyString expected4 = myString8;
        MyString actual4 = myString1.toUpperCase();
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "toUpperCase"
                , expected4.equals(actual4), expected4, actual4);


        MyString expected5 = myString6;
        MyString actual5 = myString3.substring(13, 18);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "substring"
                , expected5.equals(actual5), expected5, actual5);


        MyString expected6 = myString2;
        MyString actual6 = myString7.trim();
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "trim"
                , expected6.equals(actual6), expected6, actual6);

        boolean expected7 = true;
        boolean actual7 = myString5.contains(myString4);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "contains"
                , expected7 == (actual7), expected7, actual7);

        int expected8 = 3;
        int actual8 = myString6.indexOf('o', 3);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "indexOf"
                , expected8 == actual8, expected8, actual8);

    }
}
