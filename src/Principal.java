import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        convertidorURL consulta = new convertidorURL();
        byte opcion = 0;
        boolean calcular = false;
        String monedaBase = "", MonedaCambiada = "";
        double resultado = 0;
        while (opcion != 9) {
            System.out.println("Convertor de monedas");
            System.out.println("marique su opcion preferida: ");
            System.out.println("---------------------------");
            System.out.println(" | (1) | USD a CLP");
            System.out.println(" | (2) | CLP a USD");
            System.out.println(" | (3) | USD a COP");
            System.out.println(" | (4) | COP a USD");
            System.out.println(" | (5) | USD a ARS");
            System.out.println(" | (6) | ARS a USD");
            System.out.println(" | (7) | USD a BRL");
            System.out.println(" | (8) | BRL a USD");
            System.out.println(" | (9) | salir del sistema");
            System.out.println(" elegir su opcion");

            opcion = leer.nextByte();

            if (opcion >= 1 && opcion <= 9) {
                System.out.println("\nMonto a cambiar");
                resultado = leer.nextDouble();
                calcular = true;
            }
            switch (opcion) {
                case 1:
                    monedaBase = "USD";
                    MonedaCambiada = "CLP";

                    break;

                case 2:
                    monedaBase = "CLP";
                    MonedaCambiada = "USD";

                    break;

                case 3:
                    monedaBase = "USD";
                    MonedaCambiada = "COP";

                    break;

                case 4:
                    monedaBase = "COP";
                    MonedaCambiada = "USD";

                    break;

                case 5:
                    monedaBase = "USD";
                    MonedaCambiada = "ARS";

                    break;

                case 6:
                    monedaBase = "ARS";
                    MonedaCambiada = "USD";

                    break;

                case 7:
                    monedaBase = "USD";
                    MonedaCambiada = "BRL";

                    break;

                case 8:
                    monedaBase = "BRL";
                    MonedaCambiada = "USD";

                    break;
                case 9:
                    System.out.println("\n Gracias por usar nuestro sistema \n \n");

                default:
                    System.out.println(" la opcion debe estar entre 1 y 9");
            }
            if (calcular) {
                GetandLoud divisa = consulta.CalculaDivisa(monedaBase, MonedaCambiada, resultado);
                System.out.println(divisa);
                System.out.println(" presione enter para volver al menu");
                System.out.println("gracias por usar el convertidor");
                new java.util.Scanner(System.in).nextLine();
            }


        }
    }
}
