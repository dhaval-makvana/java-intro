public class App {
    public static void main(String args[]) {
        // string
        String phrase = "To be or not to be";
        System.out.println(phrase);
        

        // Numbers
        // a> whole numbers | Integers
        int age = 25;
        System.out.println(age);

        // Throws an error:
        // error: incompatible types: possible lossy conversion from double to int
        // age = 25.25;
        // System.out.println(age);

        // b> decimal numbers
        double height = 1.69;
        System.out.println(height);

        // Throws an error
        // error: incompatible types: possible lossy conversion from double to int
        // float weight = 78.3;
        // System.out.println(weight);

        // character
        char grade = 'A';
        System.out.println(grade);

        // Throws an error
        // error: incompatible types: possible lossy conversion from double to int
        grade = 'B';
        System.out.println(grade);

        // boolean
        boolean isMale = true;
        System.out.println(isMale);



        // working with strings
        System.out.println("\"Giraffe\" \n Academy \\");
        
        phrase = "\"Giraffe\" \n Academy \\";
        // string methods
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.length());
        System.out.println(phrase.contains("Academy"));
        System.out.println(phrase.contains("dog"));
        System.out.println(phrase.charAt(4));
        System.out.println(phrase.indexOf("\""));
        System.out.println(phrase.lastIndexOf("\""));
        System.out.println(phrase.substring(11));
        System.out.println(phrase.substring(12, 18));
        System.out.println(phrase.substring(0, phrase.indexOf(" ")));


        // working with numbers
        

    }
}