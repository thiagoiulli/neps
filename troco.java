import java.util.Scanner;

class troco {
    public static void main(String[] args){
        int centavos, total = 0;
        Scanner in = new Scanner(System.in);
        centavos = in.nextInt();
        int[] moedas = new int[6];//100, 50, 25, 10, 5, 1
        while (centavos != 0){
            if (centavos >= 100){
                moedas[0]++;
                centavos -= 100;
            }
            else if (centavos >= 50){
                moedas[1]++;
                centavos -= 50;
            }
            else if (centavos >= 25){
                moedas[2]++;
                centavos -= 25;
            }
            else if (centavos >= 10){
                moedas[3]++;
                centavos -= 10;
            }
            else if (centavos >= 5){
                moedas[4]++;
                centavos -= 5;
            }
            else if (centavos >= 1){
                moedas[5]++;
                centavos -= 1;
            }
        }

        for (int i = 0; i < 6; i++){
            total += moedas[i];
        }
        System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n", total, moedas[0], moedas[1], moedas[2], moedas[3], moedas[4], moedas[5]);
    }
}
