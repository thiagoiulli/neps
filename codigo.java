import java.util.Scanner;

class codigo {
    public static void main(String[] args) {
        int n, total = 0;
        int[] seq = new int[10000];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++){
            seq[i] = in.nextInt();
        }

        for (int i = 0; i < n-2; i++){
            if (seq[i] == 1 && seq[i+1] == 0 && seq[i+2] ==0){
                total++;
            }
        }
        System.out.println(total);
    }
}
