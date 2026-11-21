package Class01;

public class Java_class {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int age = 24;
        System.out.println(24);
        System.out.println(age);

        System.out.println("My age is "+24);
        System.out.println("My age is "+age);

        System.out.println("\uD83D\uDE00"); //😀

        //A line comment ends at the line break
        int distance; //Distance between a and b

        /*A block comment can span several lines*/

        int a = 1;
        System.out.println("++a : " + ++a);
        System.out.println("a   : " + a);
        System.out.println("a++ : " + a++);
        System.out.println("--a : " + --a);
        System.out.println("a-- : " + a--);

        int c = 3;
        int d = 4;
        System.out.println((++c == d) || (c++ > d));
        System.out.println("c = " + c);

    }
}
