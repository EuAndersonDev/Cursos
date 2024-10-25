import java.util.Scanner;

public class TadVetorJava {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tamanho, minimo, maximo, vaga, repete;

        while (true) {
            System.out.println("===================================================");
            System.out.println("            CONFIGURAÇÕES INICIAIS DO VETOR");
            System.out.println("===================================================");
            
            System.out.print("Qual o tamanho do vetor? ");
            tamanho = scn.nextInt();
            if (tamanho<=0) {
                System.out.println("Tamanho inválido. Vetor deve ter tamanho maior que 0.");
                continue;
            }

            System.out.print("Qual o valor minimo? ");
            minimo = scn.nextInt();
            System.out.print("Qual o valor maximo? ");
            maximo = scn.nextInt();
            if (minimo>maximo) {
                System.out.println("Valor maximo deve ser maior que valor minimo");
                continue;
            }

            System.out.println("Valor indicativo de posição vaga: ");
            vaga = scn.nextInt();
            if (vaga >= minimo && vaga <= maximo) {
                System.out.println("Valor de vaga deve ser diferente dos valores minimo e maximo.");
                continue;
                
            }
            break;
        }
        TadVetor vetor = new TadVetor(tamanho, minimo, maximo, vaga);

        while (true) {
            System.out.println("===================================================");
            System.out.println("            ESTUDO DO TAD VETOR");
            System.out.println("===================================================");

            System.out.println("0 - encerrar");
            System.out.println("1 - Atribuir um valor");
            System.out.println("2 - Alterar um valor");
            System.out.println("3 - Remover um valor de deteerminada posição");
            System.out.println("4 - Ler o conteudo de uma determinada posicao");
            System.out.println("5 - Localizar um valor e retornar sua posição");
            System.out.println("6 - Inserir na primera posicao vaga");
            System.out.println("7 - Inserir na ultima posicao vaga");
            System.out.println("8 - Remover da ultima posicao ocupada");
            System.out.println("9 - Imprimir o conteudo do vetor");

            System.out.println("Qual sua opção? ");
            int opc = scn.nextInt();

            if (opc==0) {
                break;
            }else if(opc==1){
                System.out.println("=== ATRIBUIR VALOR ===");
                System.out.println("Digite o valor: ");
                int valor = scn.nextInt();
                System.out.println("Posição: ");
                int posicao = scn.nextInt();
                Utils.printRet(vetor.armazenar(valor, posicao));
            }else if (opc == 2) {
                
            }


        }
    }
}
