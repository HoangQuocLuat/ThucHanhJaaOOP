import java.util.Scanner;
public class App40 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        
        switch(a){
            case 0: System.out.println("chu nhat ");
            break;
            case 1: System.out.println("thu hai ");
            break;
            case 2: System.out.println("thu ba ");
            break;
            case 3: System.out.println("thu tu ");
            break;
            case 5: System.out.println("thu nam ");
            break;
            case 6: System.out.println("thu sau ");
            break;
            case 7: System.out.println("thu bay ");
            break;
            default: System.out.println("khong ton tai");
        }
    }
}
