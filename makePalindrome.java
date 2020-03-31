package com.day1;


import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class makePalindrome {

    public static String input;
    public static void main(String[] args) {

        input = "KINNIINNIK";
        int len = input.length();
        makePalind(input);
    }

    public static String makePalind(String str){

        BiPredicate<Character,Character> Equals = (firstChar,SecondChar) -> firstChar == SecondChar;
        BiConsumer<Integer,Character> PrintResult = (index,character) ->
                System.out.println("remove char with index "+ index + "- char is : " + character);

        char[] ch = str.toCharArray();
        int len = str.length();
        int startIndex =0,EndIndex = len-1;
        int counter=0;
        while(startIndex<EndIndex){
            if(!Equals.test(ch[startIndex],ch[EndIndex])){
                if(Equals.test(ch[startIndex+1],ch[EndIndex])) {
                    if(len%2 == 0 && len/2 == EndIndex && !Equals.test(ch[startIndex],ch[EndIndex])){
                        if(ch[startIndex] < ch[EndIndex])
                            return  str.substring(0, startIndex) + str.substring(startIndex + 1);
                        else
                            return  str.substring(0, EndIndex) + str.substring(EndIndex + 1);
                    }
                    return  str.substring(0, startIndex) + str.substring(startIndex + 1);
                }
                else if(Equals.test(ch[startIndex],ch[EndIndex-1]))
                    return  str.substring(0, EndIndex) + str.substring(EndIndex + 1);

                else{
                    return str;
                }
            }
            startIndex++;EndIndex--;
        }
         if(startIndex>=EndIndex) {
             System.out.println("The string is already a palindrome");
             return str;
         }
         return null;
    }
}
