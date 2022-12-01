package animal_perroo;

public class main_animal {
    public static void main(String[] args) {
        // Creo un objeto de tipo Perro
        Perro perro = new Perro();
        perro.nombre = "Toby";
        perro.raza = "Podenco";
        Perro perro1 = new Perro("paco","Dalmata");
        System.out.println("¡Guau! me llamo " + perro1.nombre + " y soy un " + perro1.raza);
        perro1.edad_perro();
        Perro perro2 = new Perro("Pepe", "Labrador");
        System.out.println("¡Guau! me llamo " + perro2.nombre + " y soy un " + perro2.raza);
        perro2.edad = 13;
        perro2.edad_perro();
    }
}
