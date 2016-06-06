package homeWork.myArrayList;

/**
 * Created by mykhailov on 05.06.2016.
 */
public class TestMyArrayList {


    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
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


        System.out.println("-----------------add(Object)---------------------");
        myArrayList.add(number1);
        System.out.println(myArrayList);
        myArrayList.add(str1);
        System.out.println(myArrayList);

        System.out.println("-----------------add(index, Object)---------------------");
        myArrayList.add(2, number2);
        System.out.println(myArrayList);
        myArrayList.add(3, str2);
        System.out.println(myArrayList);
        myArrayList.add(4, number3);
        System.out.println(myArrayList);
        System.out.println("-----------------size---------------------");
        System.out.println("MyAraayList size - " + myArrayList.size());
        System.out.println("-----------------expand---------------------");
        myArrayList.add(str3);
        myArrayList.add(number4);
        myArrayList.add(str4);
        myArrayList.add(number5);
        myArrayList.add(str5);
        myArrayList.add(number6);
        System.out.println(myArrayList);
        System.out.println("MyAraayList size - " + myArrayList.size());
       System.out.println("-----------------remove (index 2)--------");
        myArrayList.remove(2);
        System.out.println(myArrayList);
        System.out.println("MyAraayList size - " + myArrayList.size());
        System.out.println("-----------------remove(index, Object)---");
        myArrayList.remove(0, number1);
        System.out.println("MyAraayList size - " + myArrayList.size());
        System.out.println(myArrayList);
        System.out.println("MyAraayList size - " + myArrayList.size());
        System.out.println("-----------------set---------------------");
        myArrayList.set(11, str7);
        System.out.println(myArrayList);
        System.out.println("MyAraayList size - " + myArrayList.size());
        System.out.println("-----------------get--------------------");
        System.out.println("MyAraayList get - " + myArrayList.get(0));
        System.out.println("-----------------contains---------------");
        System.out.println(myArrayList.contains(5));
        System.out.println("-----------------clear------------------");
        myArrayList.clear();
        System.out.println("MyAraayList size - " + myArrayList.size());


    }
}
