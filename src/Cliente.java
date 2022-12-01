public class Cliente {
    private String nombre;
    private String primerapellido;
    private String segundoapellido;
    private int edad = 21;
    private String email;

    Cliente() {
        nombre = "Antonio";
    }

    Cliente(String nombre, String primerapellido, int edad) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    Integer productos = 22;
    void cantidad_producto () {
        if (productos > 20 ){
            System.out.println("Carrito solo puede guardar 20 artículos debe borrar " + (productos - 20) + " para pasar a caja.");
        }
    }
    Integer precio = 300;
    void precio_producto () {
        if (precio > 500){
            System.out.println("");
        } else {
            System.out.println("Le quedan " + (500 - precio) + " para añadir.");
        }
    }
}
//Creo que también podría haber declarado un carrito de la compra para aumentar el código.
//Creo también que el poducto a pedir y sus detalles se pueden declarar igual que la persona