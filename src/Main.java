import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = reader.nextInt();

        Long res;
        Long a = 0L;
        Long b = 1L;
        System.out.print(1 + " ");


        for (int i = 0; i < input; i++) {
            res = a + b;
            System.out.print(res + " ");
            a = b;
            b = res;
        }
    }
}
