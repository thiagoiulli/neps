import java.util.Scanner;

class zero {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a != b && a != c){
            System.out.println("A");
        }
        else if (b != a){
            System.out.println("B");
        }
        else if (c != a ){
            System.out.println("C");
        }
        else {
            System.out.println("*");
        }
    }
}
