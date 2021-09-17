import java.util.Scanner;
public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        int n=sc.nextInt();
        int kq=0;
        for(int i=1;i<=n;i++){
            kq+=i;
        }
        System.out.println("Tổng các số nguyên từ 1 đến n là: "+kq);
    }
}
