/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
 */
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
            Scanner tcl = new Scanner(System.in);
            System.out.println("Digite quantos anos você tem:");
            int anos = tcl.nextInt();
            System.out.println("Digite quantos meses(1 a 12) você tem:");
            int meses = tcl.nextInt();
            System.out.println("Digite quantos dias(0 a 365) você tem:");
            int dias = tcl.nextInt();
            
            int idade = (dias + (anos * 365) + (meses * 30));
            System.out.println("Sua idade expressa em dias: "+ idade);
    }
}