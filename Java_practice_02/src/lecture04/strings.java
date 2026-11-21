package lecture04;

public class strings {
    public static void main(String[] args) {
        System.out.println("Strings..:)");

        /*
        String name = "Lena";
        String copy = new String("Lena");

        name = "Birgit";

        System.out.println(copy + name);
        */

        /*exercise*/
        String lena1 = new String("Lena");
        String lena2 = lena1;
        System.out.println(lena1 + " / " + lena2);
        System.out.println(lena1 == lena2);

        lena2 += "B.";
        System.out.println(lena1 + " / " + lena2);
        System.out.println(lena1 == lena2);

        String name = "Lena " + "or " + "then ";
        name = name + "after all " + "again ";
        name += "Birgit?";
        System.out.println(name);

        int a = 20;
        int b = 22;
        System.out.println("Year: " + a + b);
        System.out.println(a + b + "(Year)");
    }
}
