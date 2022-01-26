package Paquete_InterfazSistemaPacientes;

import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDatosPaciente extends JPanel {
	
	private JLabel labNombre;
	private JTextField txtNombre;
	
	private JLabel labApellido;
	private JTextField txtApellido;
	
	private JLabel labFNacimiento;
    private JTextField txtFNacimiento;
    
    private JLabel labSexo;
    private JTextField txtSexo;
    
    private JLabel labImagen;
    private JButton butEdad;
    private JTextField txtEdad;

	public 	PanelDatosPaciente() {
		
		setLayout( new BorderLayout( ) );
		TitledBorder border = BorderFactory.createTitledBorder("Datos del paciente");
		border.setTitleColor( Color.BLUE );
		setBorder( border );
		
		JPanel panelFoto;
		JPanel panelInformacion;
		
		panelFoto = new JPanel( );
		add( panelFoto, BorderLayout.EAST );
		
		panelInformacion = new JPanel();
		add(  panelInformacion, BorderLayout.CENTER );
		
		labNombre = new JLabel( "Nombre: " );
		labApellido = new JLabel( "Apellido: " );
		labSexo = new JLabel( " Sexo: " );
		labFNacimiento = new JLabel( "Fecha de Nacimiento: ");
		
		txtNombre = new JTextField( 15 );
		txtNombre.setEditable( false );
		txtNombre.setBackground(Color.LIGHT_GRAY);
		txtNombre.setForeground(Color.BLUE);
		
		txtApellido = new JTextField( 15 );
		txtApellido.setEditable( false );
		txtApellido.setBackground(Color.LIGHT_GRAY);
		txtApellido.setForeground(Color.BLUE);
		
		txtSexo = new JTextField( 2 );
		txtSexo.setEditable( false );
		txtSexo.setBackground(Color.LIGHT_GRAY);
		txtSexo.setForeground(Color.BLUE);
		
		txtFNacimiento = new JTextField( 2 );
		txtFNacimiento.setEditable( false );
		txtFNacimiento.setBackground(Color.LIGHT_GRAY);
		txtFNacimiento.setForeground(Color.BLUE);
		
		butEdad = new JButton( "Calcular Edad" );
		txtEdad = new JTextField( 10 );
		txtEdad.setEditable( false );
		
		panelInformacion.setLayout(new GridLayout(6,2));
		panelInformacion.add(labNombre);
		panelInformacion.add(txtNombre);
		panelInformacion.add(labApellido);
		panelInformacion.add(txtApellido);
		panelInformacion.add(labSexo);
		panelInformacion.add(txtSexo);
		panelInformacion.add(labFNacimiento);
		panelInformacion.add(txtFNacimiento);
		panelInformacion.add(butEdad);
		panelInformacion.add(txtEdad);
		
		labImagen = new JLabel( "FOTO" );
		panelFoto.add( labImagen );
	}
}

