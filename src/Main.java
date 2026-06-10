//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SateliteMeterologico meterologico =
                 new SateliteMeterologico(
                         1001,
                         "ClimaSet",
                         500,
                         100
                 );

        SateliteTermico termico =
                new SateliteTermico(
                        2001,
                        "FireSet",
                        600,
                        29,
                        300
                );

        RegiaoTerrestre regiao =
                new RegiaoTerrestre(
                        "Amazônia",
                        "-3.4653, -62.2159"
                );

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Mostrar satélite meteorológico");
            System.out.println("2 - Mostrar satélite térmico");
            System.out.println("3 - Verificar alertas");
            System.out.println("4 - Mostrar região monitorada");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                meterologico.analisarDados();
                break;

            } else if (opcao == 2) {
                termico.analisarDados();
                break;

            } else if (opcao == 3) {
                System.out.println("\n=== ALERTAS ===");

                if (meterologico.verificarAlertaCritico()) {
                    System.out.println("Satélite " + meterologico.getNome()
                            + " - ALERTA CRÍTICA!");
                } else {
                    System.out.println("Satélite " + meterologico.getNome()
                            + " - Situação normal.");
                }

                if (termico.verificarAlertaCritico()) {
                    System.out.println("Satélite " + termico.getNome()
                            + " - ALERTA CRÍTICO!");
                } else {
                    System.out.println("Satélite " + termico.getNome()
                            + " - Situação normal.");
                }

            } else if (opcao == 4) {
                System.out.println("\n=== REGIÃO MONITORADA ===");
                System.out.println(regiao);

            } else if (opcao == 0) {
                System.out.println("Encerrando sistema...");
                break;

            } else{
                System.out.println("\nOpção invalida!");
            }


        }






    }
}