package String;
import java.util.Scanner;
public class InputaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();// nextLine() method is used to take input as a string
        System.out.println(str);
        sc.close();
    }
}
