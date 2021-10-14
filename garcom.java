import java.util.Scanner;

class garcom {
    public static void main(String[] args) {
        int n, l, c, total = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++){
            l = in.nextInt();
            c = in.nextInt();
            if (l > c){
                total += c;
            }
        }
        System.out.println(total);
    }
}
