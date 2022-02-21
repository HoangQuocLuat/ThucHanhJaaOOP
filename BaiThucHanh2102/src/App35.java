import java.util.Scanner;
public class App35 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao so thu nhat: ");
        a=scanner.nextInt();
        System.out.println("nhap vao so thu nhat: ");
        b=scanner.nextInt();

        if(a > b)
        {System.out.println("so nho nhat la: "+b);}
        else 
        System.out.println("so nho nhat la: "+a);
    }
}
