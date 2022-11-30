package guis;

import modelo.Seleccion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaTeams extends Ventana implements ActionListener {
    private JComboBox comboBoxlistaPaises;
    private ArrayList<Seleccion> seleccion;
    private JButton botonPlayers;
    private JButton botonExit;
    private JLabel etiquetaChooseTeam;
    private JLabel etiquetaRankingFIFA;
    private JLabel etiquetaMostrarRanking;

    public VentanaTeams(ArrayList<Seleccion> seleccion){
        this.setTitle("Teams");

        this.seleccion = seleccion;

        botonPlayers = generarBoton("Players", 80, 220, 80, 40);
        botonPlayers.addActionListener(this);

        botonExit = generarBoton("Exit",300,220,80,40);
        botonExit.addActionListener(this);

        comboBoxlistaPaises = generarComboBox(seleccion,150,30,100,30);

        this.generarEtiqueta("Choose team", 50, 100, 150, 20);
        this.generarEtiqueta("Ranking FIFA", 50, 150, 150, 20);

       /*etiquetaChooseTeam = generarEtiqueta("Choose team:", 50, 30, 150, 20);
       etiquetaRankingFIFA = generarEtiqueta("Ranking FIFA:",50,110,200,30);*/
    }

    /*public void mostrarRanking() {
        Seleccion sel = seleccion.buscarEstudiantePorRut(comboBoxlistaPaises.getSelectedItem().toString());
        sel.setText(sel.getNombre());
        email.setText(e.getEmail());
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonPlayers){
            this.dispose();
            new VentanaPlayers().setVisible(true);
        } else if(e.getSource() == botonExit) {
            System.exit(0);
        }
    }
}