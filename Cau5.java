import java.util.Scanner;
public class Cau5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu số: ");
        int n=sc.nextInt();
        float[] a;
        a= new float[n];
        nhap(a, n);
        System.out.println("Tổng của các số dương trong mảng là: "+tinh(a, n));
    }
    public static void nhap(float a[], int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập: ");
        for(int i=0;i<n;i++){
            a[i]= sc.nextFloat();
        }
    }
    public static float tinh(float a[], int n){
        float kq=0;
        for(int i=0;i<n;i++){
            if(a[i]>=0){
                kq+=a[i];
            }
        }
        return kq;
    }
}
