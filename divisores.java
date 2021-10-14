import java.util.ArrayList;
import java.util.Scanner;

class divisores {
    public static void main(String[] args) {
        int n, total = 0;
        ArrayList<Integer> divisores = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++){
            if (n%i == 0){
                divisores.add(i);
            }
        }
        System.out.printf("%d divisor(es): ", divisores.size());
        for (int i = 0; i < divisores.size(); i++) {
            if (i == divisores.size() - 1){
                System.out.printf("%d\n", divisores.get(i));
            }
            else{
                System.out.printf("%d ", divisores.get(i));
            }
        }
        for (Integer divisor : divisores){
            total += divisor;
        }
        System.out.printf("Soma de divisores = %d\n", total);
        if (divisores.size() == 2){
            System.out.printf("Primo\n");
        }
        else {
            System.out.printf("Nao primo\n");
        }
    }
}
