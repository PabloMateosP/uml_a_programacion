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
}