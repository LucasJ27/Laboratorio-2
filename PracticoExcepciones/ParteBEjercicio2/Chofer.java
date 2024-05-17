package ParteBEjercicio2;

public class Chofer {
    private Matricula matricula;
    private String nombre;
    private boolean matriculaVencida;

    public Chofer(Matricula matricula, String nombre, boolean matriculaVencida) throws MatriculaVencidaException {
        this.matricula = matricula;
        this.nombre = nombre;
        this.matriculaVencida = matriculaVencida;
        if (matriculaVencida) {
            throw new MatriculaVencidaException("La matrícula del chofer está vencida.");
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMatriculaVencida() {
        return matriculaVencida;
    }

    public void setMatriculaVencida(boolean matriculaVencida) {
        this.matriculaVencida = matriculaVencida;
    }



}
