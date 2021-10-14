import java.util.Scanner;

class cafe {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int andar1 = (c*4)+(b*2);
        int andar2 = (a*2)+(c*2);
        int andar3 = (a*4)+(b*2);
        conta(andar1, andar2, andar3);
    }
    public static void conta(int andar1, int andar2, int andar3) {
        if (andar1 < andar2 && andar1 < andar3){
            System.out.println(andar1);
        }
        else if (andar2 < andar3){
            System.out.println(andar2);
        }
        else{
            System.out.println(andar3);
        }
        //System.out.println(Math.min(andar1, (Math.min(andar2, andar3))));
    }
}
