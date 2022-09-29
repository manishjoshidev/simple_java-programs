import java.util.Scanner;
public class prime {

    public static void isPrime(int num) {
        for (int i = 1; i <num; i++) {
            if(num%i==0)
                System.out.println("number is prime");
            else
                System.out.println("number is not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();//22
        isPrime(num);

    }
}
