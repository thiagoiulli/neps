import java.util.Scanner;

class piso {
    public static void main(String[] args){
        int l, c;
        Scanner in = new Scanner(System.in);
        l = in.nextInt();
        c = in.nextInt();
        System.out.println((l*c)+(l-1)*(c-1));
        System.out.println(2*(l-1)+2*(c-1));
    }
}
