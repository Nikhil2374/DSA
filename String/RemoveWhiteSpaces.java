package String;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Hello     How are you      This is a test string     ";
        str = str.replaceAll("\\s", "");
        // replaceAll() method is used to replace the special characters with space
        // \\s is a regular expression that matches any whitespace character
        // " " is used to replace the special characters with space
        System.out.println(str);
    }   
}
