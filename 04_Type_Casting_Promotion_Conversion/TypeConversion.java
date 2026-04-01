import java.util.Scanner;

public class TypeConversion {
    public static void main(String [] args) {
        // Allowed
        int a = 35;
        long b =a;
        System.out.println(b);

        // Error Due to lossy conversion
        /*
        long c = 12;
        int d = c ;
        System.out.println(d);
        */
        

        // Implicit Conversion or Widening
        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt();
        System.out.println(num);

    }
}
