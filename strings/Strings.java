public class Strings {
    public static void main(String[] args){
        short age = 17;

        String message = "I like pizza";
        System.out.println(message);

        // concatenation
        String hello = "Hello";
        char space = ' ';
        String name = "Hikmatulloh";

        System.out.println(hello+space+name);
        System.out.println("Hello"+" "+"Hikmatulloh");
        System.out.println("I am "+age+" years old");

        // String Methods 
        char ch = hello.charAt(0); // H
        int lenght = name.length(); // 11
        String upper = name.toUpperCase(); // HIKMATULLOH
        String lower = name.toLowerCase(); // hikmatulloh
        name.replace("Hikmatulloh", "Zakariyo"); // name = Zakariyo
        boolean isEmpty = "".isEmpty(); // true
        String strFromint = String.valueOf(age); // "17"
    }
}
