import PrograAvan.Lineal.Lista;

public class Club {
    String nombre;
    String personeria;
    String direccion;

    Lista<JUDOKA> judokas;

    public Club(String nombre, String personeria, String direccion, Lista<JUDOKA> judokas) {
        this.nombre = nombre;
        this.personeria = personeria;
        this.direccion = direccion;
        this.judokas = judokas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersoneria() {
        return personeria;
    }

    public void setPersoneria(String personeria) {
        this.personeria = personeria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Lista<JUDOKA> getJudokas() {
        return judokas;
    }

    public void setJudokas(Lista<JUDOKA> judokas) {
        this.judokas = judokas;
    }
    public void mostrarJudokas()
    {
        for(JUDOKA n: judokas){
            System.out.println(n);
        }
    }
    public void mostrarPorCategorias(String ca){
        for(JUDOKA n : judokas){
            if(n.getCategoria() == ca ){
                System.out.println(n);
            }
        }
    }

    @Override
    public String toString() {
        return "Club{" +
                "nombre='" + nombre + '\'' +
                ", personeria='" + personeria + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
