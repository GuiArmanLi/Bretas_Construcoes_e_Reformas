import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] calendario = new int[2][4];

        for (int[] dias : calendario ) {
            for (int dia: dias) {
                System.out.println("Entre com um numero");
                dia = scan.nextInt();
                System.out.println(dia);
            }
        }

        System.out.println(calendario);
    }
}