import java.util.Scanner;

class impar {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] par = new int[10];
        int[] impar = new int[10];
        int total_par = 0, total_impar = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            numeros[i] = in.nextInt();
        }
        for (int i = 0; i < 10; i++){
            if (numeros[i] % 2 == 0){
                par[total_par] = numeros[i];
                total_par++;
            }
            else{
                impar[total_impar] = numeros[i];
                total_impar++;
            }
        }
        for (int i = 0; i < total_par; i++){
            if (i == total_par - 1){
                System.out.println(par[i]);
            }
            else{
                System.out.printf("%d ", par[i]);
            }
        }
        for (int i = 0; i < total_impar; i++){
            if (i == total_impar - 1){
                System.out.println(impar[i]);
            }
            else{
                System.out.printf("%d ", impar[i]);
            }
        }
    }
}
