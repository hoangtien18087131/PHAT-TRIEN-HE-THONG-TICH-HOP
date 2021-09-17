import java.util.Scanner;

//Câu 1: Viết chương trình nhập vào chuỗi kí tự. Đổi thành chữ hoa và in ra màn hình
public class Cau1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        System.out.println("Nhập vào một chuỗi ký tự: ");
        chuoi=scanner.nextLine();
        System.out.println("Chuỗi ký tự bạn vừa nhập là: "+ chuoi);
        System.out.println("Chuỗi sau khi được in hoa là: "+ chuoi.toUpperCase());
    }
}