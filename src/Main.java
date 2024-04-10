import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = 0;
        ConsultaConversor consulta = new ConsultaConversor();
        Double valor;
        Conversor conv;

        String optionMenu = """
                ****************************************
                Sea Bienvenido/a al Conversor de Moneda =)
                
                1) Dólar ==> Peso Argentino
                2) Peso argentino ==> Dólar
                3) Dólar ==> Real brasileño
                4) Real brasileño ==> Dólar
                5) Dólar ==> Peso Colombiano
                6) Peso colombiano ==> Dólar
                7) Salir
                Elija una opción válida:
                *****************************************
                """;

        while(option != 7){
            System.out.println(optionMenu);
            try {
                option = scan.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Ingrese el valor que desea convertir:");
                        valor = scan.nextDouble();
                        conv = consulta.buscarDivisa("USD","ARS");
                        System.out.println(
                                "El valor "+valor+" [USD] corresponde al valor final de =>>> "+conv.conversion_rate()*valor+" [ARS]"
                        );
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que desea convertir:");
                        valor = scan.nextDouble();
                        conv = consulta.buscarDivisa("ARS","USD");
                        System.out.println(
                                "El valor "+valor+" [ARS] corresponde al valor final de =>>> "+conv.conversion_rate()*valor+" [USD]"
                        );
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que desea convertir:");
                        valor = scan.nextDouble();
                        conv = consulta.buscarDivisa("USD","BRL");
                        System.out.println(
                                "El valor "+valor+" [USD] corresponde al valor final de =>>> "+conv.conversion_rate()*valor+" [BRL]"
                        );
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que desea convertir:");
                        valor = scan.nextDouble();
                        conv = consulta.buscarDivisa("BRL","USD");
                        System.out.println(
                                "El valor "+valor+" [BRL] corresponde al valor final de =>>> "+conv.conversion_rate()*valor+" [USD]"
                        );
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que desea convertir:");
                        valor = scan.nextDouble();
                        conv = consulta.buscarDivisa("USD","COP");
                        System.out.println(
                                "El valor "+valor+" [USD] corresponde al valor final de =>>> "+conv.conversion_rate()*valor+" [COP]"
                        );
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que desea convertir:");
                        valor = scan.nextDouble();
                        conv = consulta.buscarDivisa("COP","USD");
                        System.out.println(
                                "El valor "+valor+" [COP] corresponde al valor final de =>>> "+conv.conversion_rate()*valor+" [USD]"
                        );
                        break;
                    case 7:
                        System.out.println("Saliendo.....");
                        System.out.println("Gracias por usar nuestros servicios");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }catch (InputMismatchException e ){
                System.out.println("Error en la entrada de datos.");
                break;
            }
        }
    }
}