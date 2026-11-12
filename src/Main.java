import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

                // Bienvenido a la agenda, selecciona una opción.//
        System.out.println("1. Crea un usuario nuevo");
        System.out.println("2. Busca contactos existentes");
        System.out.println("3. Actualiza contactos existentes");
        System.out.println("4. Elimina contactos existentes");
        System.out.println("5. Sal de la agenda");

      int opcion = sc.nextInt();

        System.out.println();


        if (opcion == 1) {
            System.out.println("Has seleccionado la opción de crear un usuario");
        }else if (opcion == 2) {
            System.out.println("Has seleccionado el buscador de contactos");
        }else if (opcion == 3) {
            System.out.println("Has seleccionado el actualizador de contactos");
        }else if (opcion == 4){
            System.out.println("Has seleccionado la opción de eliminar contactos");
        } else if (opcion == 5) {
            System.out.println("Has salido de la agenda");
        } else {
            System.out.println("Seleccione un número del 1 al 5.");
        }







    }
}
