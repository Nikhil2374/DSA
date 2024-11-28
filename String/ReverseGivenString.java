package String;

import java.util.*;
/* Method 1 
Using for loop and charAt() method

public class ReverseGivenString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);// charAt() method is used to get the character at the given index
        }
        System.out.println("Reverse of the given string is: " + rev);
        sc.close();
    }
}
*/
/*Method 2 
Using StringBuilder 

public class ReverseGivenString{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        // StringBuilder class is used to create mutable (modifiable) string
        // reverse() method of StringBuilder class is used to reverse the string
        //str.append("Hello");// append() method is used to add the string at the end of the existing string
        //sb.append(str); It will add the string to sb method if new StringBuilder(); is empty.
        sb = sb.reverse();
        System.out.println("Reverse of the given string is: " + sb);
        sc.close();
    }
}
*/

/* Method 3 
Using StringBuffer

public class ReverseGivenString{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        // StringBuffer class is used to create mutable (modifiable) string
        // reverse() method of StringBuffer class is used to reverse the string
        //str.append("Hello");// append() method is used to add the string at the end of the existing string
        //sb.append(str); It will add the string to sb method if new StringBuffer(); is empty.
        sb = sb.reverse();
        System.out.println("Reverse of the given string is: " + sb);
        sc.close();
    }
}
*/
// Method 4 
// Using toCharArray() method

public class ReverseGivenString{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        // toCharArray() method is used to convert the string to character array
        for(int i = ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
        sc.close();
    }
}