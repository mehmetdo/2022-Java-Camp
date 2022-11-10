package stringDemo;

public class StringDemo {
    public static void main(String[] args) {
        String message = "This is a beautiful day!";

        System.out.println(message);

        System.out.println("Number of Elements: " + message.length());
        System.out.println("5th Element: " + message.charAt(5));
        System.out.println("Concate: " + message.concat(" Cheers up!"));
        System.out.println("Check if the String starts with the given value: " + message.startsWith("T"));
        System.out.println("Check if the String ends with the given value: " + message.endsWith("!"));
        char[] letters = new char[5];
        message.getChars(0, 5, letters, 0);
        System.out.println(letters);
        System.out.println(message.indexOf("e"));
        System.out.println(message.lastIndexOf("e"));

        String newMessage = message.replace(" ", "-");
        System.out.println(newMessage);
        System.out.println(newMessage.substring(5, 10));

        for (String letter : newMessage.split("-")) {
            System.out.println(letter);
        }

        System.out.println(newMessage.toLowerCase());
        System.out.println(newMessage.toUpperCase());
        message = "          This is a beautiful day!      ";
        System.out.println(message.trim());
    }
}