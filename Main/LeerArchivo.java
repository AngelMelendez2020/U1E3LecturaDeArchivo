package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import static java.util.Arrays.fill;
import java.util.List;

public class LeerArchivo {

    public void Ordenar() {

        List<String> listaOrdenada = new ArrayList<String>();

        listaOrdenada.add("Estamos recorriendo un arreglo");
        String palabrasArchivo[] = null;
        String palabrasOriginales[] = null;
        String palabraFinal = "";

        try {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            archivo = new File("C:\\Users\\xener\\Desktop\\texto.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            //Lee el texto del archivo txt
            String linea;
            while ((linea = br.readLine()) != null) {
                palabrasArchivo = linea.split(" ");
            }

            //Lectura del archivo java
            for (String nombre : listaOrdenada) {
                palabrasOriginales = nombre.split(" ");

            }

            for (int i = 0; i < palabrasOriginales.length; i++) {
                for (int j = 0; j < palabrasArchivo.length; j++) {

                    if (palabrasOriginales[i].equals(palabrasArchivo[j])) {
                        //palabraFinal[i]=palabrasArchivo[j];
                        palabraFinal += palabrasArchivo[j] + " ";
                    }

                }
            }

            //Visualizacion de arreglos en pantalla
            for (int i = 0; i < palabrasArchivo.length; i++) {
                System.out.println(palabrasArchivo[i]);
            }

            System.out.println("***********");

            for (int j = 0; j < palabrasOriginales.length; j++) {
                System.out.println(palabrasOriginales[j]);
            }

            System.out.println("***********");

            System.out.println("Palabra ordenada : " + palabraFinal);

            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
