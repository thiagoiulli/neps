import java.util.Scanner;

class premio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, total = 0, linha = 0;
        n = in.nextInt();
        for (int i = 0; i < n; i++){
            if (total < 1000000){
                total += in.nextInt();
                linha++;
            }
        }
        System.out.println(linha);
    }
}
