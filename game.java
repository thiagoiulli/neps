import java.util.Scanner;

class game {
    public static void main(String[] args) {
        int n, d, a, clique=0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        d = in.nextInt();
        a = in.nextInt();
        for (; a != d; a++){
            if (a == n){
                a = 0;
            }
            clique++;
        }
        System.out.println(clique);
    }
}
