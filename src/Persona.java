public class Persona {
    String nombre;
    String apellido;
    char genero;
    String fechaN;
    float pesoA;
    String municipio;

    public Persona(String nombre, String apellido, char genero, String fechaN, float pesoA, String municipio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaN = fechaN;
        this.pesoA = pesoA;
        this.municipio = municipio;
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

    public float getPesoA() {
        return pesoA;
    }

    public void setPesoA(float pesoA) {
        this.pesoA = pesoA;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero=" + genero +
                ", fechaN='" + fechaN + '\'' +
                ", pesoA=" + pesoA +
                ", municipio='" + municipio + '\'' +
                '}';
    }
}
