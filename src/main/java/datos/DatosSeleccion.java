package datos;

import modelo.Jugador;
import modelo.Seleccion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DatosSeleccion {
    public  static void leerArchivoSelecciones(ArrayList<Seleccion> selecciones, String direccionDEArchivo){
        String archivoTexto;


        try {
            File archivo = new File("./src/main/resources/"+direccionDEArchivo);
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((archivoTexto = bufferedReader.readLine()) != null){
                ArrayList<Jugador> jugadores = new ArrayList<>();
                String[] data = archivoTexto.split(";");
                DatosJugador.leerArchivoJugadores(jugadores, data[3].replaceAll("png","txt"));

                selecciones.add(new Seleccion(data[0], data[1],data[2],data[3], jugadores));
            }

        } catch (Exception e) {
            System.out.println("Documento no disponible: Datos Selecciones");
        }
    }

    /*public static void main(String[] args) {
        ArrayList<Seleccion> selecciones = new ArrayList<>();
        DatosSeleccion.leerArchivoSelecciones(selecciones, "teams.txt");
    }*/
}