/*
Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
nas variáveis.
*/
public class q1 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C;
        
        C = A;
        A = B;
        B = C;
        System.out.println("A = "+ A);
        System.out.println("B = "+ B);
    }
}
