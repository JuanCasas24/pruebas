import java.util.Scanner;
public class persona {
    String nombre;
    int edad;
    Scanner in = new Scanner(System.in);
    public void leerNombre() {
        System.out.println("\nIngrese su nombre: ");
        nombre =in.nextLine();
    }

    public String devNombre() {
        return nombre;
    }

    public void leerEdad() {
        System.out.println("\nIngrese su edad: ");
        edad = in.nextInt();
    }

    public int devEdad() {
        return edad;
    }
}