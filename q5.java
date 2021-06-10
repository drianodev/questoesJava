/*
 Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
*/
import java.util.Scanner;
    public class q5 {
        public static void main(String[] args) {
            Scanner tcl = new Scanner(System.in);
            System.out.println("Digite um valor:");
            int valor = tcl.nextInt();
        
            System.out.println("Seu antecessor é "+ (valor - 1));
    }
 
}
