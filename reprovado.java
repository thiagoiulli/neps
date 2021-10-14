import java.util.Scanner;

class reprovado {
    public static void main(String[] args) {
        int nota1, nota2;
        Scanner in = new Scanner(System.in);
        nota1 = in.nextInt();
        nota2 = in.nextInt();
        conta(nota1, nota2);
    }
    public static void conta(int nota1, int nota2) {
        if (((nota1*2)+(nota2*3))/5 >= 7){
            System.out.println("Aprovado");
        }
        else if (((nota1*2)+(nota2*3))/5 < 3){
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Final");
        }
    }
}
