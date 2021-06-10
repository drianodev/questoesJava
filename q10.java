/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor.
 */
import java.util.Scanner;
public class q10 {
     public static void main(String[] args) {
            Scanner tcl = new Scanner(System.in);
            //ler o custo de fábrica
            System.out.println("Digite o custo de fábrica:");
            double custoFab = tcl.nextDouble();
            
            //declarando o percentual do imposto e do distribuidor
            double imposto = 0.45;
            double pctDist = 0.28;
            System.out.println(imposto);
            System.out.println(pctDist);
            
            //calculando o percentual do imposto e do distribuidor sobre o custo de fábrica
            double custo1 = custoFab * imposto;
            double custo2 = custoFab * imposto;
            double custoFinal = custo1 + custo2;
            
            //calculando o custo final ao consumidor
            double custoCons = custoFinal + custoFab;
            //imprimindo
            System.out.printf("O valor do carro novo é R$ %.2f", custoCons);
            
    }
}
