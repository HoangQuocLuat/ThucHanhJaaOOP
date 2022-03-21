import java.util.Scanner;
public class App11 {
    public static void main(String[] args) {
        int n;
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so phan tu: ");
        n = scanner.nextInt();
        int a[]= new int[n];
        int max=0;
        for (int i = 0; i < a.length; i++)
        {
            System.out.println("phan tu thư "+ i +" co gia tri la: ");
            a[i]=scanner.nextInt();
            
        }
        
        System.out.println("cac phan tu ban vua nhap la: ");
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]+"");
        }

        int temp = a[0];
        for (int i = 0 ; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("cac phan tu duoc sap xep theo thu tu tăng dần là: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
