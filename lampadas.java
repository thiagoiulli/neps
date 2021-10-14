import java.util.Scanner;

class lampadas {
    public static void main(String[] args) {
        int l1, l2, f1, f2, total = 0;
        Scanner in = new Scanner(System.in);
        l1 = in.nextInt();
        l2 = in.nextInt();
        f1 = in.nextInt();
        f2 = in.nextInt();
       if (l2 != f2){
           total++;
       }
       if (l1 != f1 ^ f2 != l2){
           total++;
       }
       System.out.println(total);
    }
}
