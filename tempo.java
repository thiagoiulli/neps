import java.util.Scanner;

class tempo {
    public static void main(String[] args) {
        int[] hora = new int[2];
        int[] minuto = new int[2];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            hora[i] = in.nextInt();
            minuto[i] = in.nextInt();
        }
        conta(hora, minuto);
    }
    public static void conta(int[] hora, int[] minuto) {
        minuto[0] += 45;
        if (minuto[0] >= 60){
            minuto[0] -= 60;
            hora[0]++;
        }
        if (hora[0] > hora[1]){
            minuto[0] += 60;
            System.out.printf("Atrasado %d\n", minuto[0]-minuto[1]);
        }
        else if (hora[0] == hora[1]){
            if (minuto[0] > minuto[1]){
                System.out.printf("Atrasado %d\n", minuto[0]-minuto[1]);
            }
            else{
                System.out.println("Sucesso");
            }
        }
        else{
            System.out.println("Sucesso");
        }
    }
}
