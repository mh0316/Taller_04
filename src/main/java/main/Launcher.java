package main;

import datos.DatosSeleccion;
import guis.VentanaTeams;
import modelo.Seleccion;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        ArrayList<Seleccion> selecciones = new ArrayList<>();
        DatosSeleccion.leerArchivoSelecciones(selecciones,"teams.txt");
        new VentanaTeams(selecciones);
        //ventanaTeams.setVisible(true);
    }
}