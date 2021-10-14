import java.util.Scanner;

class minuto {
    public static void main (String[] args){
      int entrada, horas, minutos;
      Scanner in = new Scanner(System.in);
      entrada = in.nextInt();
      horas = entrada/60;
      System.out.println(horas);
      minutos = entrada % 60;
      System.out.println(minutos);
    }
}
