package animal_perroo;

public class animal {
    String nombre;
    animal () {}
    animal (String nombre) {
        this.nombre = nombre;
    }
    void imprime () {
        System.out.print("¡Guau! me llamo " + nombre)
        //Usado el print para seguir en nuestra primera linea 
    }
}
