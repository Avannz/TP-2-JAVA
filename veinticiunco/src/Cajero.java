import java.util.Scanner;

public class Cajero {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        Cuenta cuenta = null;
        boolean salir = false;

        System.out.println("1) Crear cuenta");
        System.out.println("\n2) Crear cuenta saldo inicial");
        System.out.println("\n3) Ingresar dinero");
        System.out.println("\n4) Sacar dinero");
        System.out.println("\n5) Ver dinero");
        System.out.println("\n6) Salir ");

        while(!salir){


            System.out.printf("\n * Ingresa una opcion: ");

            int opcion = scanner.nextInt();


        switch (opcion)
        {
            case 1:

                cuenta = new Cuenta(0);
                System.out.println("Cuenta cuenta creada saldo 0");

                break;
            case 2:
                System.out.println("Ingresa un saldo inicial a tu cuenta: ");
                float saldo = scanner.nextFloat();
                cuenta = new Cuenta (saldo);

                break;
            case 3:
                System.out.println("Ingrese dinero a su cuenta: ");
                float ingrese= scanner.nextFloat();
                cuenta.ingresarSaldo(ingrese);

                break;
            case 4:
                System.out.println("Extraiga dinero de su cuenta");
               float sacar=scanner.nextFloat();
                cuenta.extrarSaldo(sacar);

                break;
            case 5:
                saldo = cuenta.mostrar();
                System.out.println("Su dinero es:" + saldo+"$");

                break;
            case 6:
                salir = true;
                break;
            default:

                System.out.println("Ingresas un numero no valido!!!! pelotudo");
                break;
            }
        }
    }
}