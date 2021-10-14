import java.util.Scanner;

class botas {
    public static void main(String[] args) {
        int n, total = 0, tamanho;
        char lado;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        bota[] botas = new bota[n];
        for (int i = 0; i < n; i++){
            tamanho = in.nextInt();
            lado = in.next().charAt(0);
            botas[i] = new bota(tamanho, lado);
        }
        for (int i = 0; i < n - 1; i++){
            for (int j = i+1; j < n; j++){
                if (botas[j].getTamanho() != 0 && botas[i].getTamanho() == botas[j].getTamanho() && botas[i].getLado() != botas[j].getLado()){
                    total++;
                    botas[j].setTamanho(0);
                    break;
                }
            }
        }
        System.out.println(total);
    }
}
class bota{
    private int tamanho;
    final private char lado;
    bota(int tamanho, char lado){
        this.tamanho = tamanho;
        this.lado = lado;
    }

    int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    char getLado() {
        return lado;
    }
}