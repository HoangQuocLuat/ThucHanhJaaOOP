import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao day so bạn muốn nhập: ");
        n = scanner.nextInt();
        float sum=0; 
        int j;
        for (int i = 1; i <= n; i++)
        {
            System.out.println("so thu "+i+" la: ");
            j= scanner.nextInt();
            sum = sum+j;
        }
        sum = sum/n;
        System.out.println("trung binh cong so bạn nhap la: "+sum);
    }
}
