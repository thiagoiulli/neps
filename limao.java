import java.util.Scanner;

class limao {
    public static void main(String[] args) {
        int n, c, total=0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        c = in.nextInt();
        System.out.println(conta(n, c, total));
    }
    public static int conta(int n, int c, int total) {
        for (; n > 0; n--){
            if (c == 1){
                total += c;
            }
            else{
                total += c;
                c--;
            }
        }
        return total;
    }
}
