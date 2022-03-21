import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập vào số thứ nhất: ");
        a = scanner.nextInt();
        System.out.println("nhập vào số thứ hai: ");
        b = scanner.nextInt();

        System.out.println("tổng của 2 số bạn nhập là: "+(a+b));
        System.out.println("hiệu của 2 số bạn nhập là: "+(a-b));
        System.out.println("tích của 2 số bạn nhập là: "+(a*b));
        System.out.println("thương của 2 số bạn nhập là: "+(a/b));
        System.out.println("chia dư của 2 số bạn nhập là: "+(a%b));

        System.out.println(a +" == "+b +" : "+ (a==b));
		System.out.println(a +" != "+b +" : "+ (a!=b));
		System.out.println(a +" < "+b +" : "+ (a<b));
		System.out.println(a +" <= "+b +" : "+ (a<=b));
		System.out.println(a +" > "+b +" : "+ (a>b));
		System.out.println(a +" >= "+b +" : "+ (a>=b));
    }
}
