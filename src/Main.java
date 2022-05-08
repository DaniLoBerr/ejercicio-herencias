// Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

public class Main {
    public static void main(String[] args) {
        // Objeto cliente con sus valores dados e impresos
        Cliente cliente = new Cliente();

        System.out.println("Datos del cliente");
        cliente.setNombre("Daniel");
        System.out.println("Nombre: " + cliente.getNombre());
        cliente.setEdad(29);
        System.out.println("Edad: " + cliente.getEdad() + " Años");
        cliente.setTelefono(666666666);
        System.out.println("Teléfono: " + cliente.getTelefono());
        cliente.setCredito(+10000.00);
        System.out.println("Crédito: " + cliente.getCredito());

        System.out.println(" ");

        //Objeto trabajador con sus valores dados e impresos
        Trabajador trbajador = new Trabajador();

        System.out.println("Datos del Trabajador");
        trbajador.setNombre("Daniel");
        System.out.println("Nombre: " + trbajador.getNombre());
        trbajador.setEdad(29);
        System.out.println("Edad: " + trbajador.getEdad() + " Años");
        trbajador.setTelefono(666666666);
        System.out.println("Teléfono: " + trbajador.getTelefono());
        trbajador.setSalario(1000.00);
        System.out.println("Salario: " + trbajador.getSalario() + " €");
    }
}

// Clase persona con las propiedades pedidas
class Persona {
    String nombre;
    int edad;
    int telefono;

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }

}

// Clase cliente, que hereda de la clase persona, con la nueva propiedad pedida que solo existe para esta clase
class Cliente extends Persona {
    private double credito;

    public void setCredito (double credito) {
        this.credito = credito;
    }
    public double getCredito() {
        return this.credito;
    }
}

// Clase trabajdor, que hereda de la clase persona, con la nueva propiedad pedida que solo existe para esta clase
class Trabajador extends Persona {
    private double salario;

    public void setSalario (double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return this.salario;
    }
}