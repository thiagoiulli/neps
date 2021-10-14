import java.util.Scanner;

class cobra {
    public static void main(String[] args) {
        int cor1, cor2, cor3, cor4;
        Scanner in = new Scanner(System.in);
        cor1 = in.nextInt();
        cor2 = in.nextInt();
        cor3 = in.nextInt();
        cor4 = in.nextInt();
        if (cor1 == cor4){
            System.out.println("F");
        }
        else{
            System.out.println("V");
        }
    }
}
