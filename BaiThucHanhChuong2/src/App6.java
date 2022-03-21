import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {
        int n,gt=1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so bạn muon tinh: ");
        n= scanner.nextInt();

        int i=0;
        do{ 
            i+=1; 
            gt = gt*i;  
        }
        while(i<n);
        System.out.println("giai thua bien ban nhap la: "+gt);
    }
}
