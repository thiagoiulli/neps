import java.util.Scanner;

class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b, n, run = 0;
        while (run == 0) {
            b = input.nextInt();
            n = input.nextInt();
            if (b != 0 && n != 0) {
                bancos[] banco = new bancos[b];
                for (int i = 0; i < b; i++) {
                    int r = input.nextInt();
                    banco[i] = new bancos();
                    banco[i].setReserva(r);
                }
                for (int j = 0; j < n; j++) {
                    int d, c, v;
                    d = input.nextInt();
                    c = input.nextInt();
                    v = input.nextInt();
                    debenture(banco, d, c, v);
                }
                System.out.println(imprimir(banco, b));
            }
            else {
                run = 1;
            }
        }
    }
    static void debenture(bancos[] banco, int d, int c, int v){
        banco[d-1].setReserva(banco[d-1].getReserva()-v);
        banco[c-1].setReserva(banco[c-1].getReserva()+v);
    }
    static char imprimir(bancos[] banco, int b){
        char saida = 'S';
        for (int i = 0; i < b; i++){
            if (banco[i].getReserva()<0){
                saida = 'N';
                return saida;
            }
        }
        return saida;
    }
}
class bancos{
    private int reserva;

    int getReserva() {
        return reserva;
    }

    void setReserva(int reserva) {
        this.reserva = reserva;
    }
}