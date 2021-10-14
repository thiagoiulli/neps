import java.util.Scanner;
import java.util.Arrays;

class ordenacao {
    public static void main(String[] args) {
        int[] num = new int[3];
        Scanner in = new Scanner(System.in);
        num[0] = in.nextInt();
        num[1] = in.nextInt();
        num[2] = in.nextInt();
        conta(num);
        for (Integer numero : num) {
            System.out.println(numero);
        }
    }
    public static int[] conta(int[] num) {
        Arrays.sort(num);
        return num;
    }
}
