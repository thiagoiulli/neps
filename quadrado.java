import java.util.Scanner;

class quadrado {
    public static void main(String[] args) {
        int[] matriz = new int[9];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 9; i++){
            matriz[i] = in.nextInt();
        }
        if (matriz[0] + matriz[1] + matriz[2] == 15){
            if (matriz[3] + matriz[4] + matriz[5] == 15){
                if (matriz[6] + matriz[7] + matriz[8] == 15){
                    if (matriz[0] + matriz[3] + matriz[6] == 15){
                        if (matriz[1] + matriz[4] + matriz[7] == 15){
                            if (matriz[2] + matriz[5] + matriz[8] == 15){
                                if (matriz[0] + matriz[4] + matriz[8] == 15){
                                    if (matriz[2] + matriz[4] + matriz[6] == 15){
                                        System.out.println("SIM");
                                    }
                                    else{
                                        System.out.println("NAO");
                                    }
                                }
                                else{
                                    System.out.println("NAO");
                                }
                            }
                            else{
                                System.out.println("NAO");
                            }
                        }
                        else{
                            System.out.println("NAO");
                        }
                    }
                    else{
                        System.out.println("NAO");
                    }
                }
                else{
                    System.out.println("NAO");
                }
            }
            else{
                System.out.println("NAO");
            }
        }
        else{
            System.out.println("NAO");
        }
    }
}
