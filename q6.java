/*
 Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
área do retângulo.
 */
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o valor da base do retângulo:");
        double base = tcl.nextDouble();
        
        System.out.println("Digite o valor da altura do retângulo:");
        double altura = tcl.nextDouble();
        
        double area = base * altura;
        
        if(base > 0) {
            System.out.printf("A área do retângulo é %.2f", area);
        } else {
            System.out.println("Não existe área negativa");
        }
        
    }
}