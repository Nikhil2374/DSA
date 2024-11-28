package String;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "Hello!!!!! How are you?????? This is a test string.....";
        str = str.replaceAll("[^a-z A-Z 0-9]", " ");
        // replaceAll() method is used to replace the special characters with space
        // [^a-zA-Z0-9] is a regular expression that matches any character that is not a letter or a digit
        // ^ is used to negate the expression
        // a-zA-Z0-9 is a regular expression that matches any letter or digit
        // " " is used to replace the special characters with space
        System.out.println(str);
    }
}
