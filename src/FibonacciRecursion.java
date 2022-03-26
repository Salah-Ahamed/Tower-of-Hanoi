import java.util.Scanner;

public class FibonacciRecursion {

    static int a=0,b=1,c=0;
    static void FibonacciRecurse(int count){
        if(count>0){
            c = a + b;
            a = b;
            b = c;
            System.out.print(" "+c);
            FibonacciRecurse(count-1);
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Nth term : ");

        int nthTerm = Integer.parseInt(sc.nextLine());

        if (nthTerm == 0){
            System.out.println(a);
        }
        else if(nthTerm == 1){
            System.out.println(b);
        }
        else{
            System.out.print(a+" "+b);
            FibonacciRecurse(nthTerm-1);
        }

    }
}
