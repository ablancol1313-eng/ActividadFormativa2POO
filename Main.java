
// CLASE ESTUDIANTE
// Una clase es una plantilla o modelo que permite crear objetos.
// En este programa la clase Estudiante representa la información que tendrá cada estudiante registrado.

class Estudiante {
// ATRIBUTOS
// Los atributos son las características que tendrá cada objeto.
// Cada estudiante tendrá:
    // - nombre
    // - edad
    // - matrícula
    // - promedio

    String nombre;
    int edad;
    String matricula;
    double promedio;

// CONSTRUCTOR
// El constructor es un método especial que se ejecuta automáticamente cuando se crea un objeto.
// Su función es recibir los datos y guardarlos dentro de los atributos del objeto.

    public Estudiante(String nombre, int edad, String matricula, double promedio) {

        // "this" hace referencia al atributo del objeto actual
        // Guardar el nombre recibido
        this.nombre = nombre;
        // Guardar la edad recibida
        this.edad = edad;
        // Guardar la matrícula recibida
        this.matricula = matricula;
        // Guardar el promedio recibido
        this.promedio = promedio;
    }

// MÉTODO mostrarInformacion()
// Un método es un conjunto de instrucciones que realiza una tarea específica.
// Este método muestra toda la información del estudiante en la consola.

    public void mostrarInformacion() {

        // Mostrar una línea
        System.out.println("--------------------------------");
        // Mostrar el nombre del estudiante
        System.out.println("Nombre: " + nombre);
        // Mostrar la edad del estudiante
        System.out.println("Edad: " + edad);
        // Mostrar la matrícula del estudiante
        System.out.println("Matrícula: " + matricula);
        // Mostrar el promedio del estudiante
        System.out.println("Promedio: " + promedio);
        // Mostrar otra línea 
        System.out.println("--------------------------------");
    }
}
// CLASE PRINCIPAL
// Todo programa Java necesita una clase principal.
// La ejecución del programa comienza en el método main().

public class Main {

// MÉTODO MAIN
// Es el punto de entrada del programa.
// Java ejecuta automáticamente este método cuando iniciamos la aplicación.

    public static void main(String[] args) {

// CREACIÓN DEL PRIMER OBJETO
// La palabra "new" crea un nuevo objeto utilizando la plantilla de la clase Estudiante.
// Los datos enviados entre paréntesis son recibidos por el constructor.
        Estudiante estudiante1 =
                new Estudiante(
                        "Ana Blanco",
                        29,
                        "A001",
                        95.5);

// CREACIÓN DEL SEGUNDO OBJETO
        Estudiante estudiante2 =
                new Estudiante(
                        "Juan Perez",
                        21,
                        "A002",
                        88.0);

// CREACIÓN DEL TERCER OBJETO
        Estudiante estudiante3 =
                new Estudiante(
                        "Maria Lopez",
                        22,
                        "A003",
                        92.7);

// LLAMADA A LOS MÉTODOS
    // El operador punto (.) permite acceder a los métodos de cada objeto.
    // Aquí se muestra la información de cada estudiante.

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();
    }
}
/*
======================================================================
EXPLICACIÓN DE LOS CONCEPTOS UTILIZADOS
======================================================================
1. CLASE
   Una clase es una plantilla que sirve para crear objetos.

2. OBJETO
   Un objeto es una instancia real creada a partir de una clase.

3. ATRIBUTOS
   Son las características que describen a un objeto.

4. CONSTRUCTOR
   Es un método especial que se ejecuta automáticamente
   al crear un objeto.

5. MÉTODOS
   Son acciones o tareas que puede realizar un objeto.

6. INSTANCIACIÓN
   Es el proceso de crear un objeto utilizando la palabra "new".

======================================================================
¿CÓMO AGREGAR MÁS ESTUDIANTES?
======================================================================

Para agregar otro estudiante es necesario crear un nuevo objeto.
Ejemplo:

Estudiante estudiante4 =
        new Estudiante(
                "Carlos Garcia",
                20,
                "A004",
                89.5);

Después se llama al método para mostrar la información:

estudiante4.mostrarInformacion();

Para este codigo se pueden crear tantos estudiantes como sea necesario
siguiendo la misma estructura.
======================================================================
*/