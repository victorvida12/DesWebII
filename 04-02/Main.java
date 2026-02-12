import java.util.*;

public class Main {
    public static void main(String[] args) {
        int run = 1;

        
        ArrayList<String> produtos = new ArrayList<>();

        while ( run == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nMenu Principal:\n");
            System.out.println("1. Adicionar\n2. Listar\n3. Remover\n4. Sair");
            System.out.println("\nEscolha uma opção:");

            
            
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    int run2 = 1;
                    while (run2 == 1) {
                        System.out.println("\n1. Adicionar um nome\n2. Voltar");
                        System.out.println("\nSelecione o que quer fazer");
                        int subopcao = sc.nextInt();
                        switch (subopcao) {
                            case 1:
                                System.out.println("\nDigite o nome do produto desejado:");
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
                    System.out.println("\nLista de produtos adicionados:");
                    for(int i = 0; i < produtos.size(); i++) {
                        System.out.println(i + ". " + produtos.get(i));
                    }
                    String ok = sc.nextLine();
                    break;

                case 3:
                    for(int i = 0; i < produtos.size(); i++) {
                        System.out.println("\n" + i + ". " + produtos.get(i));
                    }
                    System.out.println("\nEscolha o numero do produto a ser removido:");
                    int num = sc.nextInt();

                    if(num <= produtos.size()) {
                        String remover = produtos.remove(num);
                        System.out.println("Produto Removido !!!");
                    } else {
                        System.out.println("Número inválido");
                    }

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