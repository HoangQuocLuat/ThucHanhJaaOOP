import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        int n;
        String hovaten;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap ten cua ban: ");
        hovaten = scanner.nextLine();

        System.out.println("nhap tuoi cua ban: ");
        n = scanner.nextInt();

        if (n < 16)
        {
            System.out.println("Ban "+hovaten+" ở tuổi vị thành nien");
        }
        else
        {
            if(n>=16)
            {
                System.out.println("Ban "+hovaten+" o tuoi truong thanh");
            }
            else
            {
                System.out.println("Ban "+hovaten+" ban da già");
            }
        }
    
    }
}
