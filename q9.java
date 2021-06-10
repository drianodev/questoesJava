/*
Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário.
 */
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
            Scanner tcl = new Scanner(System.in);
            System.out.println("Digite o valor do salário mensal:");
            double salario = tcl.nextDouble();
            System.out.println("Digite o valor do percentual de reajuste:");
            double pctReajuste = tcl.nextDouble();
            
            if(pctReajuste < 0) {
                double newSalario = salario + (100 * pctReajuste / salario);
                System.out.printf("O valor do novo salário é R$ %.2f", newSalario);
            } else {
                double newSalario = salario - (100 * pctReajuste / salario);
                System.out.printf("O valor do novo salário é R$ %.2f", newSalario);
            }
            
    }
}
