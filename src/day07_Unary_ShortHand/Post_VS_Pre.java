package day07_Unary_ShortHand;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); //11
        System.out.println(a);


        System.out.println("============");

        int b = 10;
        System.out.println(b++); // 10
        System.out.println(b); // 11

        System.out.println("============");
        int c = 25;
        int d = c++;// d= 25;
        // c =26
        System.out.println(c);
        System.out.println(d);
        System.out.println("============");

    }
}
