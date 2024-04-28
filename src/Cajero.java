import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        String nombre = "Lola Perez";
        String tipoDeCuenta = "Ahorros";
        double saldo = 356.90;
        int opcion = 0;

        System.out.println("*****************");

        System.out.println("\n Nombre del titular: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("El saldo disponible es de: " + saldo);

        System.out.println("**************+***");

        String menu = """
                **** Seleccione una opcion ****
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                4 - Salir 
                
                """;
        Scanner scanner = new Scanner(System.in);

        while (opcion != 9){
            System.out.println(menu);
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo disponible es de : $" + saldo);
                    break;

                case 2:
                    System.out.println("Ingrese el valor a retirar");
                    double valorRetirar = scanner.nextDouble();
                    if (valorRetirar > saldo){
                        System.out.println("El valor que quiere retirar es mayor al saldo actual, intente de nuevo");
                    } else{
                        saldo -= valorRetirar;
                        System.out.println("El saldo actual es de: $" + saldo);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el valor que quiere depositar");
                    double valorDepositado= scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("El saldo actual es de: $" + saldo);
                    break;
                case 4:
                    System.out.println("El proceso se ha finalizado, vuelva pronto");
                    break;
                default:
                    System.out.println("opcion no valida, intente de nuevo");
            }
        }

    }
}
