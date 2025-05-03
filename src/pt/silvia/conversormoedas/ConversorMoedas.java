package pt.silvia.conversormoedas;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ConversorMoedas {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaTaxaCambio consultaApi = new ConsultaTaxaCambio();
        String moedaBase = "";
        String moedaDestino = "";
        double valorConverter = 0;
        ApiResponse respostaApi;

        System.out.println(ANSI_CYAN);
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║           💱 Bem-vindo ao Conversor de Moedas 💱   ║");
        System.out.println("╚════════════════════════════════════════════════════╝" + ANSI_RESET);
        System.out.println();

        while (true) {
            exibirMenu();
            int opcao = lerOpcao(scanner);

            if (opcao == 7) {
                System.out.println(ANSI_GREEN + "👋 Obrigado por usar o Conversor de Moedas. Até logo!" + ANSI_RESET);
                break;
            }

            try {
                switch (opcao) {
                    case 1: moedaBase = "USD"; moedaDestino = "ARS"; break;
                    case 2: moedaBase = "ARS"; moedaDestino = "USD"; break;
                    case 3: moedaBase = "USD"; moedaDestino = "BRL"; break;
                    case 4: moedaBase = "BRL"; moedaDestino = "USD"; break;
                    case 5: moedaBase = "USD"; moedaDestino = "COP"; break;
                    case 6: moedaBase = "COP"; moedaDestino = "USD"; break;
                    default:
                        System.out.println(ANSI_RED + "❌ Opção inválida. Por favor, tente novamente." + ANSI_RESET);
                        continue;
                }

                System.out.printf("\n🔄 Buscando taxas de câmbio para %s...\n", moedaBase);
                respostaApi = consultaApi.buscaTaxas(moedaBase);

                if (respostaApi == null || !"success".equalsIgnoreCase(respostaApi.result())) {
                    System.out.println("❌ Não foi possível obter as taxas. Verifique sua conexão ou a API Key.");
                    continue;
                }

                System.out.print("💰 Digite o valor que deseja converter: ");
                valorConverter = scanner.nextDouble();
                scanner.nextLine();

                if (valorConverter < 0) {
                    System.out.println(ANSI_RED + "⚠️ Valor inválido. Por favor, insira um valor positivo." + ANSI_RESET);
                    continue;
                }

                Map<String, Double> taxas = respostaApi.conversion_rates();

                if (taxas.containsKey(moedaDestino)) {
                    double taxaDestino = taxas.get(moedaDestino);
                    double valorConvertido = valorConverter * taxaDestino;

                    System.out.println(ANSI_CYAN + "\n========= 💱 Resultado da Conversão 💱 =========");
                    System.out.printf("  %.2f %s  =>  %.2f %s%n", valorConverter, moedaBase, valorConvertido, moedaDestino);
                    System.out.println("===============================================" + ANSI_RESET);
                } else {
                    System.out.printf("⚠️ Moeda de destino '%s' não encontrada nas taxas retornadas.%n", moedaDestino);
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Erro: Entrada inválida. Por favor, digite um número válido.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("❌ Ocorreu um erro inesperado: " + e.getMessage());
                e.printStackTrace();
            }

            System.out.println("\nPressione Enter para continuar...");
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("\n*******************************************************");
        System.out.println("*                Aplicação finalizada                 *");
        System.out.println("*******************************************************\n");
    }

    // ===== Menu de opções =====
    private static void exibirMenu() {
        System.out.println("============== 🌍 MENU DE CONVERSÃO 🌍 ================");
        System.out.println("1️⃣  Dólar (USD)                >> Peso Argentino (ARS)");
        System.out.println("2️⃣  Peso Argentino (ARS)       >> Dólar (USD)");
        System.out.println("3️⃣  Dólar (USD)                >> Real Brasileiro (BRL)");
        System.out.println("4️⃣  Real Brasileiro (BRL)      >> Dólar (USD)");
        System.out.println("5️⃣  Dólar (USD)                >> Peso Colombiano (COP)");
        System.out.println("6️⃣  Peso Colombiano (COP)      >> Dólar (USD)");
        System.out.println("7️⃣  Sair ❌ ");
        System.out.println("=======================================================");
        System.out.println();
        System.out.print("👉 Escolha uma opção: ");
    }

    // ===== Valida entrada do usuário =====
    private static int lerOpcao(Scanner scanner) {
        while (true) {
            try {
                int opcao = scanner.nextInt();
                scanner.nextLine();
                return opcao;
            } catch (InputMismatchException e) {
                System.out.print(ANSI_RED + " ❌ Entrada inválida. Por favor, digite um número entre 1 e 7: ");
                scanner.nextLine();
            }
        }
    }
}
