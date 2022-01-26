package Paquete_InterfazSistemaPacientes;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelExtensiones extends JPanel{

	public 	PanelExtensiones() {
		setLayout( new BorderLayout( ) );
		TitledBorder border = BorderFactory.createTitledBorder("Puntos de extensión");
		border.setTitleColor( Color.BLUE );
		setBorder( border );
	}
}
