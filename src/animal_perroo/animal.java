package animal_perroo;

public class animal {
    String nombre;
    animal () {
        // Default constructor
    }
    animal (String nombre) {
        this.nombre = nombre;
    }
    void imprime () {
        System.out.print("¡Guau! me llamo " + nombre);
        // Luego verás por qué uso print en lugar de println
    }
}
