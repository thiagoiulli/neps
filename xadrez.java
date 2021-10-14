import java.util.Scanner;

class xadrez {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int linhas, colunas;
        linhas = in.nextInt();
        colunas = in.nextInt();
        if ((colunas+linhas)%2 == 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
