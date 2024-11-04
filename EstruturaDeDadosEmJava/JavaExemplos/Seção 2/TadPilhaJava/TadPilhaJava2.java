
import java.util.Scanner;

public class TadPilhaJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("--------------------------------------------");
        System.out.println("PROGRAMA PARA ESTUDO DO TAD PILHA - VERSÃO 1");
        System.out.println("--------------------------------------------");
        System.out.println("");
        System.out.print("Tamanho maximo da pilha: ");
        int qtd = scn.nextInt();

        TadPilha1 pilha = new TadPilha1(qtd);

        while (true) {
            System.out.println("\n\n--------------------------------------------");
            System.out.println("PROGRAMA PARA ESTUDO DO TAD PILHA - VERSÃO 1");
            System.out.println("      Conteudo: numeros inteiros");
            System.out.println("      Capacidade:" + qtd + " elementos");
            System.out.println("--------------------------------------------");
            System.out.println("");
            System.out.println("0 - Encerrar");
            System.out.println("1 - Inserir um elemento");
            System.out.println("2 - Extrair um elemento");
            System.out.println("3 - Imprimir a pilha");
            System.out.println("");

            System.out.print("Opcao: ");
            int opc = scn.nextInt();

            if (opc == 0) {
                break;
            } else if (opc == 1) {
                Scanner scn1 = new Scanner(System.in);
                System.out.print("Valor do elemento a inserir: ");
                int opc1 = scn1.nextInt();
                
                if (pilha.push(opc1)) {
                    System.out.println("Insercao bem sucedida.");
                } else {
                    System.out.println("Insercao falhou!!");
                }

            }
            else if (opc == 2){
                if (pilha.pop()){
                    System.out.println("Extracao bem sucedida. Valor do elemento = " + pilha.getRetorno());
                }
                else{
                    System.out.println("Extracao falhou.");
                }
            }
            else if (opc == 3){
                System.out.println(pilha.print());
            }

        }

    }

}
