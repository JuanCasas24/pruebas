public class Registro {
    public static void main(String[] args) {
        persona p1 = new persona();
        p1.leerNombre();
        p1.leerEdad();

        if(p1.devEdad()>=18) {
            System.out.println(p1.devNombre() + " es mayor de edad ya que tiene "+p1.devEdad() + " años");
        }else{
            System.out.println(p1.devNombre() + " es menor de edad ya que tiene "+p1.devEdad() + " años");
        }
    }
}
