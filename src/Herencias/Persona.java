package Herencias;

public abstract class Persona {
    protected int edad;
    protected String genero;
    protected String nombre;
    public Persona(){
    }
    public Persona(int edad, String genero, String nombre) {
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
