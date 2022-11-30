package guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaTeams extends Ventana implements ActionListener {
    private JPanel panel;
    private JLabel etiquetaElegirEquipo;
    private JLabel etiquetaRankingFIFA;
    private JComboBox comboBox;
    private JButton botonPlayers;
    private JButton botonExit;

    public VentanaTeams(){
        this.setTitle("Players");

        botonPlayers = generarBoton("Players", 80, 220, 80, 40);
        botonPlayers.addActionListener(this);

        botonExit = generarBoton("Exit",300,220,80,40);
        botonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}