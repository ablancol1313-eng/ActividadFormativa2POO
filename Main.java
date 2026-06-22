// Clase Estudiante
class Estudiante {

    // Atributos de la clase
    String nombre;
    int edad;
    String matricula;
    double promedio;

    // Constructor de la clase
    public Estudiante(String nombre, int edad, String matricula, double promedio) {

        // Asignación de valores a los atributos
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {

        System.out.println("--------------------------------");

        System.out.println("Nombre: " + nombre);

        System.out.println("Edad: " + edad);

        System.out.println("Matrícula: " + matricula);

        System.out.println("Promedio: " + promedio);

        System.out.println("--------------------------------");
    }
}

// Clase principal
public class Main {

    // Método principal
    public static void main(String[] args) {

        // Creación del primer objeto
        Estudiante estudiante1 =
                new Estudiante(
                        "Ana Blanco",
                        29,
                        "A001",
                        95.5);

        // Creación del segundo objeto
        Estudiante estudiante2 =
                new Estudiante(
                        "Juan Perez",
                        21,
                        "A002",
                        88.0);

        // Creación del tercer objeto
        Estudiante estudiante3 =
                new Estudiante(
                        "Maria Lopez",
                        22,
                        "A003",
                        92.7);

        // Mostrar datos del estudiante 1
        estudiante1.mostrarInformacion();

        // Mostrar datos del estudiante 2
        estudiante2.mostrarInformacion();

        // Mostrar datos del estudiante 3
        estudiante3.mostrarInformacion();
    }
}