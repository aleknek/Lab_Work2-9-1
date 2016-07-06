package com.brainacad.oop.teststring1;

public class Main {

    public static void main(String[] args) {

        String myStr = "abracadabra";
        System.out.println("The index of first “ra” substring of myStr is " + myStr.indexOf("ra"));
        System.out.println("The index of last “ra” substring of myStr is " + myStr.lastIndexOf("ra"));
        System.out.println("substring of myStr from 3 to 7 are " + myStr.substring(3, 7));

        System.out.println("reverse myStr is "+reverseString(myStr));

    }

    public static String reverseString(String str) {

        StringBuilder temp = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp.append(str.charAt(i));
        }

        return temp.toString();
    }

}
