/*
Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
de eleitores.
 */
import java.util.Scanner;
public class q8 {
     public static void main(String[] args) {
            Scanner tcl = new Scanner(System.in);
            System.out.println("******Eleições Município de Fortaleza******");
            // total de votos
            System.out.println("Digite o total de votos:");
            int total = tcl.nextInt();
            // votos
            System.out.println("Digite o total de votos em branco:");
            int branco = tcl.nextInt();
            System.out.println("Digite o total de votos nulos:");
            int nulo = tcl.nextInt();
            System.out.println("Digite o total de votos válidos:");
            int valido = tcl.nextInt();
            
            double pctBranco = 100 * branco / total;
            double pctNulo = 100 * nulo / total;
            double pctValido = 100 * valido / total;
            
            System.out.printf("O percentual de votos brancos é %.2f%%\n", pctBranco);
            System.out.printf("O percentual de votos nulos é %.2f%%\n", pctNulo);
            System.out.printf("O percentual de votos válidos é %.2f%%\n", pctValido);
    }
}