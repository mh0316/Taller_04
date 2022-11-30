package guis;

import modelo.Seleccion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaTeams extends Ventana implements ActionListener {
    private JComboBox comboBoxlistaPaises;
    Seleccion seleccion;
    private JButton botonPlayers;
    private JButton botonExit;
    private JLabel etiquetaChooseTeam;
    private JLabel etiquetaRankingFIFA;
    private JLabel etiquetaMostrarRanking;

    public VentanaTeams(){
        this.setTitle("Teams");

        botonPlayers = generarBoton("Players", 80, 220, 80, 40);
        botonPlayers.addActionListener(this);

        botonExit = generarBoton("Exit",300,220,80,40);
        botonExit.addActionListener(this);

        //comboBoxlistaPaises = generarComboBox(seleccion.getJugadores(),50,30,100,30);

        etiquetaChooseTeam = this.generarEtiqueta("Choose team:", 30, 30, 150, 20);
        etiquetaRankingFIFA = generarEtiqueta("Ranking FIFA:",30,110,200,30);
    }

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