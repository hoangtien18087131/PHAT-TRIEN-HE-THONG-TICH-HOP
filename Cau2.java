import java.util.Scanner;

public class Cau2{
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên: ");
        int n=scanner.nextInt();
        if(isPrime(n)){
            System.out.println(n+" là số nguyên tố!");
        }
            else{
                System.out.println(n+" không phải là số nguyên tố!");
            }


    }
}