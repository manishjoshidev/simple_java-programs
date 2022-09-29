import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0)
                    sum = sum + i;
            }

            if (n == sum)
                System.out.println("number is perfect");//28=1+2+4+7+14

            else
                System.out.println("not a perfect number");
        } catch (Exception e) {
            System.out.println("something went wrong");
        }
    }
}




