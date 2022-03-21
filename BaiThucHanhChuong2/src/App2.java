import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        int n;
    Scanner scanner = new Scanner(System.in);

    System.out.println("nhap so ban muon kiem tra: ");
    n = scanner.nextInt();
    
    if (n % 2 == 0)
    {
        System.out.println("đay la so chan ");
    }
    else
    {
        System.out.println("day la so le");
    }
    }
}
