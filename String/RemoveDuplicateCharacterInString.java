package String;




public class RemoveDuplicateCharacterInString {
    public static void main(String[] args) {
        String str = "programming";
        //Method 1: using Java 8 
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c -> sb.append((char) c));
        //chars() method is used to return an IntStream of the characters in the sequence.
        //distinct() method is used to return a stream consisting of the distinct elements of this stream.
        //forEach() method is used to perform an action for each element of this stream.
        //append() method is used to add the character to the string builder
        //char is used to convert the integer value to character
        //c is a variable that stores the character value
        //sb is a string builder that stores the character value
        //-> is a lambda operator that is used to separate the parameter and the body of the lambda expression
        System.out.println(sb.toString());

        //Method 2: using indexOf() method

    }
}
