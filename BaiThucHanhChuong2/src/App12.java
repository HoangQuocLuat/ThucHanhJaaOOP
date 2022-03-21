import java.util.Scanner;
public class App12 {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao so cot: ");
        n= scanner.nextInt();
        System.out.println("nhap vao so dong: ");
        m= scanner.nextInt();
 
        int a[][] = new int [n][m];
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0 ; j < m; j++)
            {
                System.out.print("A[" + i + "]["+ j + "]= ");
                a[i][j]=scanner.nextInt();
            }
        }
    }
}
