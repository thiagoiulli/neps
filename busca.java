import java.util.Scanner;

class busca {
    public static void main(String[] args) {
        int[] seq = new int[10];
        int numero;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            seq[i] = in.nextInt();
        }
        numero = in.nextInt();
        for (Integer item : seq){
            if (item == numero){
                System.out.println("SIM");
                System.exit(0);
            }
        }
        System.out.println("NAO");
    }
}
