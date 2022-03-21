import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        int sum=0, n;
        Scanner scanner = new Scanner(System.in);
        while(sum < 100)
        {
            System.out.println("nhap cac so de tinh tong: ");
            n = scanner.nextInt();
            sum = sum + n;
        }
        System.out.println("tong ban nhap la: "+ (sum));
    }
}
