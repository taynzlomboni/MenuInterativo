import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu Interativo:");
            System.out.println("1 - Verificar se pode votar");
            System.out.println("2 - Fazer a contagem regressiva");
            System.out.println("3 - Mostrar dia da semana");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    verificarVoto(entrada);
                    break;
                case 2:
                    contagemRegressiva();
                    break;
                case 3:
                    mostrarDiaDaSemana(entrada);
                    break;
                case 0:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        entrada.close();
    }

    // Método 1: Verifica se a pessoa pode votar
    public static void verificarVoto(Scanner entrada) {
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        if (idade >= 16) {
            System.out.println("Você PODE votar.");
        } else {
            System.out.println("Você NÃO pode votar ainda.");
        }
    }

    // Método 2: Contagem regressiva
    public static void contagemRegressiva() {
        System.out.println("Contagem regressiva:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // Método 3: Dia da semana
    public static void mostrarDiaDaSemana(Scanner entrada) {
        System.out.print("Digite um número de 1 a 7: ");
        int dia = entrada.nextInt();
        switch (dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda-feira"); break;
            case 3: System.out.println("Terça-feira"); break;
            case 4: System.out.println("Quarta-feira"); break;
            case 5: System.out.println("Quinta-feira"); break;
            case 6: System.out.println("Sexta-feira"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Número inválido!");
        }
    }
}