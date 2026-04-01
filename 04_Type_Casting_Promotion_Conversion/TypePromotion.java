// Package

public class TypePromotion {
    public static void main(String args[]) {
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int) a);
        // System.out.println((int) b);
        // System.out.println(a);
        // System.out.println(b - a);
        // char c = b-a; // Error --> Lossy conversion

        // ex 2
        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = a + b + c; // Error --> lossy conversion from int to byte
        // after typecasting it can allowed but value makes no sense byte bt = (byte) a
        // + b + c;

        // ex3
        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d; // here a b c d is converted to double
        // int ans2 = a + b + c + d; // here error --> lossy conversion from double to int
        // System.out.println(ans);

        // ex4
        byte b = 5;
        // byte a = b * 2; // error because here comes expression compiler thinks ther can be data loss so error lossy conversion int to byte

        byte a = (byte) (b * 2); // So no error output is 10

    }
}
