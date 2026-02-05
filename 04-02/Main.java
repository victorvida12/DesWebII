import java.util.*;

public class Main {
    public static void main(String[] args) {
        int run = 1;
        while ( run == 1) {
            System.out.println("Lista de Produtos:\n");
            System.out.println("1. Adicionar\n2. Listar\n3. Remover\n4. Sair");
            System.out.println("\nEscolha uma opção:");

            ArrayList<String> produtos = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    int run2 = 1;
                    while (run2 == 1) {
                        System.out.println("\n1. Adicionar um nome 2. Voltar");
                        System.out.println("Selecione o que quer fazer");
                        int subopcao = sc.nextInt();
                        switch (subopcao) {
                            case 1:
                                System.out.println("Digite o nome do produto desejado:");
                                sc.nextLine();
                                String produto = sc.nextLine();
                                produtos.add(produto);
                                break;
                            case 2:
                                run2 = 0;
                                break;
                            default:
                                System.out.println("Entrada Inválida!");
                                break;
                        }
                    }
                    break;
                
                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println("Sair.");
                    run = 0;
                    break;
            
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }
}