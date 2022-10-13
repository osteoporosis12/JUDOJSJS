import PrograAvan.Lineal.Lista;
import PrograAvan.NoLineal.ArbolRB;


public class MAIN {
    public static void main(String[] args) {
        ArbolRB<Integer,JUDOKA> J1 = new ArbolRB<>();

        JUDOKA j1 = new JUDOKA("Juan", "Perez", 'M', "01/01/01", "Capo",20);
        JUDOKA j2 = new JUDOKA("Pedro", "Perez", 'M', "01/01/01", "Capo",21);
        JUDOKA j3 = new JUDOKA("Jona", "Perez", 'M', "01/01/01", "Capo",22);
        JUDOKA j4 = new JUDOKA("Pipo", "Perez", 'M', "01/01/01", "Capo",23);
        JUDOKA j5 = new JUDOKA("Omar", "Perez", 'M', "01/01/01", "Capo",24);



        J1.insertar(1, j1);
        J1.insertar(2, j2);
        J1.insertar(6, j3);
        J1.insertar(8, j4);
        J1.insertar(4, j5);

        J1.amplitud();
    }

}
