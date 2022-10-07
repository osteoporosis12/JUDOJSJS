import PrograAvan.Lineal.Lista;
import com.sun.source.tree.NewArrayTree;

public class MAIN {
    public static void main(String[] args) {
        JUDOKA xd=new JUDOKA("pablo","rodriguez",'M',"1988-09-29","-100",90);
        JUDOKA xd1=new JUDOKA("Andres","Guti",'F',"2000-09-29","+78",90);
        /*JUDOKA xd2=new JUDOKA("pablo","rodriguez",'M',"1988-09-29","junior",90);
        JUDOKA xd3=new JUDOKA("pablo","rodriguez",'M',"1988-09-29","junior",90);
        JUDOKA xd4=new JUDOKA("pablo","rodriguez",'M',"1988-09-29","junior",90);
        JUDOKA xd5=new JUDOKA("pablo","rodriguez",'M',"1988-09-29","junior",90);
        JUDOKA xd6=new JUDOKA("pablo","rodriguez",'M',"1988-09-29","junior",90);
        JUDOKA xd7=new JUDOKA("pablo","rodriguez",'M',"1988-09-29","junior",90);
        JUDOKA xd8=new JUDOKA("pablo","rodriguez",'M',"1988-09-29","junior",90);*/
        Lista<JUDOKA> judokas =new Lista<>();
        judokas.insertar(xd);
        judokas.insertar(xd1);

        // ESTOY PROBANDO SI DA XD

        Lista<Club> clubes = new Lista<>();

        Club c1 = new Club("COBRA KAI", "C27234", "CALLE LA PAZ #1210", judokas);
        Club c2 = new Club("COCHABAMBITA", "C13214", "CALLE ORURO #2",judokas );
        Club c3 = new Club("PORTOBELLO", "C27578", "CALLE POTOSI # 23", judokas);
        Club c4 = new Club("BRUCE LEE XD", "C90876", "CALLE LA PAZ #2005", judokas);

        clubes.insertar(c1);
        clubes.insertar(c2);
        clubes.insertar(c3);
        clubes.insertar(c4);

        Lista<Municipio> munis=new Lista<>();
        munis.insertar(new Municipio("SAN JOSE","3213",clubes));
        for(Municipio n: munis){
            System.out.println(n);
            System.out.println(" ");
            n.mostrarClubes();
        }

        //JUDOKAS DE UN MUNICIPIO
        for(Municipio n: munis){
            n.mostrarJu();
        }

        //Mostrar Categorias
        System.out.println("Categoria -100 Masculino");
        for(Municipio n : munis){
            n.mostrarCat("-100");
        }

    }

}
