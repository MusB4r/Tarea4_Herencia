public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Jose";
        cliente.edad = 23;
        cliente.telefono = 444-444-444;
        cliente.credito = 12000;
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Teléfono: " + cliente.telefono);
        System.out.println("Crédito: " + cliente.credito + "\n---------------------");  
        trabajador.nombre = "Fernando";
        trabajador.edad = 24;
        trabajador.telefono = 1111-1111-1111;
        trabajador.salario = 4600.12;
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Teléfono: " + trabajador.telefono);
        System.out.println("Crédito: " + trabajador.salario);

    }
}

class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}