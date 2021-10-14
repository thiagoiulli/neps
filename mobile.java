import java.util.Scanner;

class mobile {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        conta(a, b, c, d);
    }
    public static void conta(int a, int b, int c, int d) {
        if (b == c && b+c == d && a == b+c+d){
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }
    }
}
