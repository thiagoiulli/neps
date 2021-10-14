import java.util.Scanner;

class maior {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println(num1);
        }
        else if (num2 > num3){
            System.out.println(num2);
        }
        else{
            System.out.println(num3);
        }
    }
}
