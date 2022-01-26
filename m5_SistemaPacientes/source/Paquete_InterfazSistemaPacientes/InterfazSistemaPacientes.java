package Paquete_InterfazSistemaPacientes;

import javax.swing.*;
import uniandes.cupi2.sistemapacientes.mundo.SistemaPacientes;
import java.awt.BorderLayout;

public class InterfazSistemaPacientes extends JFrame{

	public static void main(String[] args) {
		InterfazSistemaPacientes interfaz = new InterfazSistemaPacientes( );
		interfaz.setVisible( true );

	}


private SistemaPacientes sistemaPacientes;

private PanelDatosPaciente panelDatosPaciente;

private PanelDatosMuestra panelDatosMuestra;

private PanelExtensiones panelExtensiones;

public InterfazSistemaPacientes() {
	setTitle( "Sistema de Pacientes" );
	setSize ( 700,450 );
	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	setLayout( new BorderLayout( ) );
	
	sistemaPacientes = new SistemaPacientes( );
	
	panelDatosPaciente= new PanelDatosPaciente();
	panelDatosMuestra = new PanelDatosMuestra();
	panelExtensiones = new PanelExtensiones();
	
	add( panelDatosPaciente, BorderLayout.NORTH );
	add( panelDatosMuestra, BorderLayout.CENTER );
	add( panelExtensiones, BorderLayout.SOUTH );
	
}



}