package guis;

import modelo.Seleccion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPlayers extends Ventana implements ActionListener {
    private JButton botonEditPlayer;
    private JButton botonSaveChanges;
    private JButton botonBack;
    private JComboBox listaPaises;
    private JLabel etiquetaOficcialFormation;
    private JTextArea informacionSeleccion;

    public VentanaPlayers(Seleccion seleccion){
        this.setTitle("Players");

        etiquetaOficcialFormation = generarEtiqueta("Oficcial formation",50,20,100,30);

        botonEditPlayer = generarBoton("Edit player",50,250,100,30);
        botonEditPlayer.addActionListener(this);

        botonSaveChanges = generarBoton("Save changes",170,250,150,30);
        botonSaveChanges.addActionListener(this);

        botonBack = generarBoton("Back",350,250,100,30);
        botonBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonBack){
            this.dispose();
            new VentanaTeams().setVisible(true);
        }
    }
}