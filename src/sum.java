import java.util.Scanner;
public class sum {
    static  int displaySum(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            
           int r = n % 10;
            sum = sum + r;
            r = n / 10;
        }
        return sum;
    }
          public static void main(String[] args)
          {
          Scanner sc=new Scanner(System.in);
          int num= sc.nextInt();
              System.out.println("enter num");
         int result= displaySum(33);
          System.out.println("sum is"+result);

          }


                }
