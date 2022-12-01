package animal_perroo;

import java.sql.SQLOutput;

public class Perro extends animal {
    String raza;
    Integer edad = 4;

    public Perro () {
        // Default constructor
    }
    public Perro(String nombre, String raza) {
        //super.nombre = nombre; //Versión inicial
        super(nombre); // Versión modificada
        this.raza = raza;
    }
    void imprime () {
        System.out.println("¡Guau! me llamo " + super.nombre + " y soy un " + raza);
    }
    void edad_perro (){
        edad = edad * 7;
        if (edad > 88) {
            System.out.println("Su perro es mayor");
        } else if (edad < 70) {
            System.out.println("Su perro tiene una edad media");
        } else {
            System.out.println("Su perro es jove");
        }
    }
}
