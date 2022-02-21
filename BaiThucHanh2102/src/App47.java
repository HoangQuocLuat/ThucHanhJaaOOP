import java.util.Scanner;
public class App47 {
     public static void main(String[] args) {
    int n, tong = 0; 
    Scanner scanner = new Scanner(System.in);   
    do {
    System.out.println("Nhap so nguyen can tinh: ");
    n = scanner.nextInt();
    tong = tong + n;
    }
    while (tong < 100); 
        System.out.println("Tong = " + tong);   
}
}