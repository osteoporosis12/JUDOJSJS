import PrograAvan.Lineal.Lista;

public class Municipio {
    String nombre;
    String personeria;
    Lista<Club> clubes;

    public Municipio(String nombre, String personeria, Lista<Club> clubes) {
        this.nombre = nombre;
        this.personeria = personeria;
        this.clubes = clubes;
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

    public Lista<Club> getClubes() {
        return clubes;
    }

    public void setClubes(Lista<Club> clubes) {
        this.clubes = clubes;
    }
    public void mostrarClubes()
    {
        for (Club c: clubes)
        {
            System.out.println("______________________________________________________________________________________________");
            System.out.println(c);
            System.out.println("______________________________________________________________________________________________");
            c.mostrarJudokas();
        }
    }
    public void mostrarJu()
    {
        for (Club c: clubes)
        {
            c.mostrarJudokas();
        }
    }
    public void mostrarCat(String ca){
        for(Club c : clubes){
            c.mostrarPorCategorias(ca);
        }
    }
    @Override
    public String toString() {
        return "Municipio{" +
                "nombre='" + nombre + '\'' +
                ", personeria='" + personeria + '\'' +
                '}';
    }
}
