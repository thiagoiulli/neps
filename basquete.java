import java.util.Scanner;

class basquete {
    public static void main(String[] args) {
        int d;
        Scanner in = new Scanner(System.in);
        d = in.nextInt();
        if (d <= 800){
            System.out.println("1");
        }
        else if (d <= 1400){
            System.out.println("2");
        }
        else {
            System.out.println("3");
        }
    }
}
