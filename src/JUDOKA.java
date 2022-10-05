import java.util.Date;

public class JUDOKA {
    String nombre;
    String apellido;
    char genero;
    String fechaN;
    String categoria;
    float pesoA;

    public JUDOKA(String nombre, String apellido, char genero, String fechaN, String categoria, float pesoA) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaN = fechaN;
        this.categoria = categoria;
        this.pesoA = pesoA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPesoA() {
        return pesoA;
    }

    public void setPesoA(float pesoA) {
        this.pesoA = pesoA;
    }

    @Override
    public String toString() {
        return "JUDOKA{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero=" + genero +
                ", fechaN=" + fechaN +
                ", categoria='" + categoria + '\'' +
                ", pesoA=" + pesoA +
                '}';
    }
}
