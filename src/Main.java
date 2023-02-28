import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        while (!salir) {
            System.out.println("===================");
            System.out.println("Elija una opcion");
            System.out.println("Añadir inventario 1");
            System.out.println("Venta de habitacion 2");
            System.out.println("Factura habitacion 3");
            System.out.println("Gastos Productos 4");
            System.out.println("Gastos y ganancias mensuales 5");


            System.out.println("===================");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }
        }
    }
}