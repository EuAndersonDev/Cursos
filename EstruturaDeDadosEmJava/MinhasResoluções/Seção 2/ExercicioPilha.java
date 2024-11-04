import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Scanner in = new Scanner(System.in);
        HashSet<Integer> elementos = new HashSet<>(); 

        boolean permitirRepeticao = true;

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Inserir elemento na pilha");
            System.out.println("2. Remover elemento do topo da pilha");
            System.out.println("3. Exibir quantidade de elementos");
            System.out.println("4. Exibir posição do topo");
            System.out.println("5. Localizar elemento e exibir sua posição");
            System.out.println("6. Permitir repetição de elementos");
            System.out.println("7. Não permitir repetição de elementos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para inserir: ");
                    int valor = in.nextInt();

                    if (!permitirRepeticao && elementos.contains(valor)) {
                        System.out.println("Elemento já existe na pilha e repetição não é permitida.");
                    } else {
                        pilha.push(valor);
                        elementos.add(valor);
                        System.out.println("Elemento " + valor + " inserido na pilha.");
                    }
                    break;

                case 2:
                    if (!pilha.isEmpty()) {
                        int removido = pilha.pop();
                        elementos.remove(removido);
                        System.out.println("Elemento " + removido + " removido do topo da pilha.");
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;

                case 3:
                    System.out.println("Quantidade de elementos na pilha: " + pilha.size());
                    break;

                case 4:
                    if (!pilha.isEmpty()) {
                        System.out.println("A posição do topo é: " + (pilha.size()));
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o valor a ser localizado: ");
                    int elementoBusca = in.nextInt();
                    int posicao = pilha.search(elementoBusca);

                    if (posicao != -1) {
                        System.out.println("O elemento está na posição (do topo): " + posicao);
                    } else {
                        System.out.println("O elemento não foi encontrado na pilha.");
                    }
                    break;

                case 6:
                    permitirRepeticao = true;
                    System.out.println("Agora a pilha permite repetição de elementos.");
                    break;

                case 7:
                    permitirRepeticao = false;
                    System.out.println("Agora a pilha NÃO permite repetição de elementos.");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
