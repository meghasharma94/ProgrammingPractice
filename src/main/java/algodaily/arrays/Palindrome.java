package algodaily.arrays;

import java.util.Locale;

public class Palindrome {




    public static boolean isPalindrome2(String str){


    StringBuffer sb= new StringBuffer(str);

    StringBuffer reverse=sb.reverse();

    if(sb.equals(reverse)){

        return true;
    }
            return false;
    }

    public static boolean isPalindrome(String str) {


        int i =0 , j=str.length()-1;

        str=str.toLowerCase(Locale.ROOT);

        while(i<j){

            char getAL=str.charAt(i);
            char getAR=str.charAt(j);

            if(!(getAL>= 'a' && getAL <='z')){

                    i++;
            }else

                if(!(getAR>= 'a' && getAR <='z')){

                j--; }


                else if(getAR==getAL){
                     i++;
                     j--;

                }

                else{

                    return false;

                }
        } return true;
    }




    public static void main(String[] args){

      //  System.out.println(isPalindrome("A Santa Lived As a Devil At NASA"));
        System.out.println(isPalindrome2("A Santa Lived As a Devil At NASA"));


    }



}
