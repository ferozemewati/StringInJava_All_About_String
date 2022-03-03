/*
    String in Java?
        Generally, String is a sequence of characters. But in Java,
        string is an object that represents a sequence of characters.
        The java.lang.String class is used to create a string object.


        There are two ways to create String object:
 1. By string literal
    String s="welcome";

 2. By new keyword
    String s=new String("Welcome")

*/


/*
Create a string with the help of literal

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze";
        System.out.println(s);
    }
}*/

/*
Create a string with the help of New string

public class String_In_Java {
    public static void main(String[] args) {
        String s=new String("Feroze");
        System.out.println(s);
    }
}
*/

/*
Find String length with the help of .length()

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze Khan Mewati";
        int size=s.length();
        System.out.println(size);
    }
}

public class String_In_Java {
    public static void main(String[] args) {
        String s=new String("Feroze Mewati");
        int size=s.length();
        System.out.println(size);
    }
}
*/

import java.io.SyncFailedException;
import java.util.Locale;
import java.util.Scanner;

/*
Change String into lower case with the help of .toLowerCase() method.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze Khan Mewati";
        String str=s.toLowerCase();
        System.out.println(str);
    }
}

public class String_In_Java {
    public static void main(String[] args) {
        String s=new String("Feroze Mewati");
        String str=s.toLowerCase();
        System.out.println(str);
    }
}
*/

/*
Change string into the Upper Case with the help of .toUpperCase(); method.

public class String_In_Java {
    public static void main(String[] args) {
        String s=new String("Feroze Mewati");
        String str=s.toUpperCase();
        System.out.println(str);
    }
}

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze Khan Mewati";
        String str=s.toUpperCase();
        System.out.println(str);
    }
}
*/

// Replace String old into new string

/*
public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze Khan Mewati";
        String str=s.replace('r','P');
        String strr=s.replace('a','A');
        System.out.println(str);
        System.out.println(strr);
    }
}

public class String_In_Java {
    public static void main(String[] args) {
        String s=new String("Feroze Mewati");
        String str=s.replace('e','Y');
        System.out.println(str);
    }
}
 */


/*
Replace all exist String into new String.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze Khan Mewati";
        String str=s.replaceAll("Feroze","Faisal");
        System.out.println(str);
    }
}#Output -> Faisal Khan Mewati

Replace an entire String into new string with the help of .replaceFirst() method.

public class String_In_Java {
    public static void main(String[] args) {
        String s=new String("Feroze Mewati");
        String str=s.replaceFirst("Mewati","Faisal");
        System.out.println(str);
    }
}
#Output -> Feroze Faisal
*/

/*
Print some String with the help of .subString() method.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze Mewati";
        String strr=s.substring(0,5);
        System.out.println(strr);
    }
}#Output -> Feroz
*/


/*
Print any specific character from a string with the help of .charAt() method.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze Mewati";
        System.out.println(s.charAt(5));
    }
}

public class String_In_Java {
    public static void main(String[] args) {
        String s = new String("Feroze Khan Mewati");
        char str=s.charAt(3);
        System.out.println(str);
        }
}
*/


/*
Change white space into underscore '_' with the help of .replace() method.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze Khan Mewati";
        System.out.println(s.replace(' ','_'));
    }
}

public class String_In_Java {
    public static void main(String[] args) {
        String s=new String("Feroze Khan Mewati");
        String str=s.replace(' ','_');
        System.out.println(str);
    }
}
*/


/*
Wap to fill in a letter template which look like below.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Dear name, Thanks a lots !!";
        s=s.replace("name,","\n  Feroze Khan Mewati,\n ");
        System.out.println(s);
    }
}*/


/*
Find index of number any specific character from a string with the help of .indexOf() method.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze Khan Mewati";
        int st=s.indexOf('w');
        System.out.println(st);
    }
}

public class String_In_Java {
    public static void main(String[] args) {
        String s=new String("Feroze Mewati");
        int str=s.indexOf('a');
        System.out.println(str);
    }
}

public class String_In_Java {
    public static void main(String[] args) {
        String s="Ferozemewati";
        System.out.println(s.indexOf('a'));
    }
}
*/


/*
Print a Specific character from string with the help of .charAt() method.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze";
        char str=s.charAt(4);
        System.out.println(str);
    }
}


public class String_In_Java {
    public static void main(String[] args) {
        String s = "Ferozemewati";
        for (int i = 0; i <= s.length()-1; i++) {
            System.out.println(s.charAt(i));
        }
    }
}

public class String_In_Java {
    public static void main(String[] args) {
        String s="Ferozemewati";
        System.out.println(s.charAt(9));
    }
}
*/


/*
Reverse entire string with the help of an Empty string using for & while loop in array.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Ferozemewati";
        String newString=" ";
        char arr[]=s.toCharArray();
        for(int i= arr.length-1;i>=0;i--){
            newString=newString+arr[i];
        }
        System.out.println(newString);
    }
}

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze mewati";
        char [] arr=s.toCharArray();
        int i=0,j= arr.length-1;
        while(i<j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        //String string=String.valueOf(arr);
        //System.out.println(string);
        //System.out.println(arr);
        System.out.println(String.valueOf(arr));
    }
}
*/


/*
      Reverse entire string with the help of String.valueOf() method using while loop in array.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze khan Mewati";
        char arr[]=s.toCharArray();
        int i=0,j= arr.length-1;
        while(i<j){
            char temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        System.out.println(String.valueOf(arr));
        }
    }

*/


/*
    Reverse some integer numbers with the help For loop and Swapping in integer array.

public class String_In_Java {
    public static void main(String[] args) {
        int arr[]={11,33,22,33,11,44,55,};
        int j= arr.length-1;
        int temp=0;
        for (int i=0; i<j; i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for (int i=0; i< arr.length; i++ ){
            System.out.println(arr[i]);
        }*/


/*
    Reverse entire string with the help of Swapping method using for loop in array.

    public class String_In_Java {
        public static void main(String[] args) {
            String s="Feroze Khan Mewati";
            char arr[]=s.toCharArray();
            int j= arr.length-1;
            for (int i=0; i< j; i++){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
            for (int i=0; i< arr.length; i++){
                System.out.print(arr[i]);
            }
        }
}
*/


/*
    Reverse entire string with the help of String.valueOf() method using while loop in array.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze Faizan Sajar";
        char arr[]=s.toCharArray();
        int j= arr.length-1;
        for (int i=0; i<j; i++){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        String string=String.valueOf(arr);
        System.out.println(string);
    }
}

public class String_In_Java {
    public static void main(String[] args) {
        String s="Ferozemewati";
        char []arr=s.toCharArray();
        int j=arr.length-1;
        for (int i=0; i<j; i++) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                }
        String string=String.valueOf(arr);
        System.out.print(string);
    }
}
*/


/*
      An small string convert into UpperCase using .toUpperCase() method.

public class String_In_Java {
    public static void main(String[] args) {
        String s="saifi";
        System.out.println(s.toUpperCase());
    }
}*/


/*
Swapping two String change position into each other using temp;

public class String_In_Java {
    public static void main(String[] args) {
        String s1="Aarif";
        String s2="Feroze";
        System.out.println("Before Swapping "  + "s1 " +s1 + " s2 " +s2 );
        String temp=s1;
        s1=s2;
        s2=temp;
        System.out.println("s1 "+s1 + " \n" +"s2 "+s2);
    }
}
*/


/*
    Reverse a number using while loop

public class DigitReverse {
    public static void main(String[] args) {
        int n=12345, reverse=0;
        System.out.println("Original value is "+n);
        while (n != 0){
            int reminder = n % 10;
            reverse=reverse * 10 +reminder;
            n = n / 10;
        }
        System.out.println("Reverse value is " +reverse);
    }
}

    By user input

import java.util.Scanner;
public class DigitReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any value");
        int n= sc.nextInt();
        int reverse=0;
        while (n != 0){
            int reminder = n % 10;
            reverse = reverse * 10 +reminder;
            n = n / 10;
        }
        System.out.println("Reverse value is "+reverse);
    }
*/


/*
     Reverse a numbers digits using For loop

public class DigitReverse {
    public static void main(String[] args){
       int n=12345,  reverse=0;
        System.out.println("Original value is "+n);
        for (; n!=0; n=n/10){                       //we have not mentioned the initialization part of the for loop
            int reminder =n%10;
            reverse=reverse*10+reminder;
        }
        System.out.println("Reverse value is "+reverse);
    }
}

    we also write like this in for loop

public class DigitReverse {
    public static void main(String[] args) {
        int n=12345, reverse=0;
        System.out.println("Original value is "+n);
        for (; n !=0 ;){
            int reminder =n%10;
            reverse=reverse*10+reminder;
            n=n/10;
        }
        System.out.println("Reverse value is "+reverse);
    }
}


    By user input

import java.util.Scanner;

public class DigitReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any value ");
        int n= sc.nextInt();
        int reverse=0;
        for (;n!=0;){
            int reminder=n%10;
            reverse=reverse*10+reminder;
            n=n/10;
        }
        System.out.println("Reverse value is "+reverse);
    }
}
*/


/*

     //Wap to find index number of any character in string.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Ferozemewati";
        char value='a';
        char arr[]=s.toCharArray();
        for (int i=0; i<arr.length; i++){
            if (value==s.charAt(i)){
                System.out.println(i);
            }
        }
    }
}*/



/*

    Wap to reverse a string to using split method.

public class String_In_Java {
    public static void main(String[] args) {
        String s="Feroze Khan Mewati";
        int i=s.length()-1;
        String newString=" ";
        while (i>=0){
            while (i>=0 && s.charAt(i)==' ')i--;
            int j=i;
            if (i<=0)break;
            while (i>=0 && s.charAt(i)!=' ')i--;
            if (newString.isEmpty()){
                newString=newString+(s.substring(i+1,j+1));
            }
            else {
                newString=newString+(' '+s.substring(i+1,j+1));
            }
        }
        System.out.println(newString);
    }
}


     Same question By method calling.

  class RevStr{
            public void findRs(){
                String name="Mewati Khan Feroze";
                int i=name.length()-1;
                String newString=" ";
                while (i>=0){
                    while (i>=0 && name.charAt(i)==' ') i--;
                    int j=i;
                    if (i<=0)break;
                    while (i>=0 && name.charAt(i)!=' ') i--;
                    if (newString.isEmpty()){
                        newString=newString+(name.substring(i+1,j+1));
                    }
                    else {
                        newString=newString+(' '+name.substring(i+1,j+1));
                    }
                }
                System.out.println(newString);
            }
        }

        public class Chap3_String {
            public static void main(String[] args) {
                RevStr obj=new RevStr();
                obj.findRs();
            }
        }



     Wap to reverse a string by user input using split method.

public class String_In_Java{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any value ");
        String originalStr=sc.nextLine();
        System.out.println("This is original string "+originalStr);
        String words[]=originalStr.split(" ");
        String newString=" ";
        int length=words.length-1;
        for (int i=length; i>=0; i--){
            newString=newString+words[i]+' ';
        }
        System.out.println("Reverse string is "+newString);
    }
}


        Same question By method calling.

        import java.util.Scanner;
        class RevStr{
            public void findRS(){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter any value");
                String originalStr=sc.nextLine();
                System.out.println("This is original string: " +originalStr);
                String words[]=originalStr.split(" ");
                String newStr=" ";
                int length=words.length-1;
                for (int i=length; i>=0; i--){
                    newStr=newStr+words[i]+' ';
                }
                System.out.println("Reverse string is: "+ newStr);
            }
        }
        public class Chap3_String {
            public static void main(String[] args) {
                RevStr obj=new RevStr();
                obj.findRS();
            }
        }
*/

/*

     Wap to reverse string using of StringBuffer and StringBuilder.

        class RevStr{
            public void findRS(){
                StringBuffer sb=new StringBuffer("Feroze Khan");
                System.out.println(sb.reverse());

                StringBuilder sbb=new StringBuilder("Feroze Mewati");
                System.out.println(sbb.reverse());
            }
        }

        public class Chap3{
            public static void main(String[]args){
                RevStr obj=new RevStr();
                obj.findRs();
            }
        }
*/


/* Wap to change a string value using StringBuffer / StringBuilder.

      -> 1. StringBuilder append() method

public class String_In_Java {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello Mr Feroze ");
        sb.append(" how are you? ");
        System.out.println(sb);
    }
}

      -> 2. String Builder insert() method

public class String_In_Java {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Feroze");
        sb.insert(3, "kk");
        System.out.println(sb);
    }
}

     ->  3. StringBuilder replace() method.

public class String_In_Java {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Mr khan");
        sb.replace(0, 2, "Feroze");
        System.out.println(sb);
    }
}

       ->  4. StringBuilder delete () method.

public class String_In_Java {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Mr khan");
        sb.delete(0, 2);
        System.out.println(sb);
    }
}

     ->  5. StringBuilder delete() method.

public class String_In_Java {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Mr khan");
        sb.reverse();
        System.out.println(sb);

    }
}
*/
