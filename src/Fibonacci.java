import java.util.Scanner;
public class Fibonacci {

    public static void main (String[] args) {

        int a = 0;
        int b = 1;
        int c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number here : ");
        int n = Integer.parseInt(sc.nextLine());  /* Nth term */

        if (n == 0){
            System.out.println("0");
        }
        else if (n == 1){
            System.out.print(a + " " + b + " " );
        }
        else{
            System.out.print(a + " " + b);
            for (int i = 2; i<= n; i++) {

                c = a + b;
                System.out.print(" "+c);


                a = b;
                b = c;

            }
        }



    }


}
