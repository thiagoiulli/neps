import java.util.Scanner;

class fliper {
    public static void main(String[] args) {
        int p, r;
        Scanner in = new Scanner(System.in);
        p = in.nextInt();
        r = in.nextInt();
        if (p == 0){
            System.out.println("C");
        }
        else if (r == 0){
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }
    }
}
