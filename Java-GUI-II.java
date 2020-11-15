import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class PruebaAcciones {

	public static void main(String[] args) {
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		

	}

}
class MarcoAccion extends JFrame{
	public MarcoAccion() {
		setTitle("Jaime");
		setBounds(300, 250, 854, 480);
		/*PanelAccion lamina = new PanelAccion();
		add(lamina);*/
		
		add(new PanelAccion());
	}
}
class PanelAccion extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//Desactivar autoGrid 
		setLayout(null);
		//Instanciar Cuadros de Texto
		texto1 = new JTextField("1", 10);
		texto2 = new JTextField();
		texto3 = new JTextField();
		texto4 = new JTextField();
		//Instanciar Botones
		boton1 = new JButton("...");
		boton2 = new JButton("...");
		boton3 = new JButton("...");
		boton4 = new JButton("...");
		
		//Posicion y Tamaño de Componentes
			//Constantes para texto
		int txtXpos = 60;
		int txtlarge = 150;
			//Constantes para Botones
		int btnXpos = 220;
		int btnlarge = 30;
		
		

		//TEXTO
		texto1.setBounds(txtXpos, 60, txtlarge, 20);
		texto2.setBounds(txtXpos, 100, txtlarge, 20);
		texto3.setBounds(txtXpos, 140, txtlarge, 20);
		texto4.setBounds(txtXpos, 180, txtlarge, 20);
		
		
		//BOTONES
		boton1.setBounds(btnXpos, 60, btnlarge, 20);
		boton2.setBounds(btnXpos, 100, btnlarge, 20);
		boton3.setBounds(btnXpos, 140, btnlarge, 20);
		boton4.setBounds(btnXpos, 180, btnlarge, 20);
		//Añadir Componentes
		add(texto1);
		add(texto2);
		add(texto3);
		add(texto4);
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		
		//Generar una instancia de la clase oyente con un valor
		id Boton1 = new id(1);
		id Boton2 = new id(2);
		id Boton3 = new id(3);
		id Boton4 = new id(4);
		//Añadir a cada boton dicha instancia
		boton1.addActionListener(Boton1);//tis para referenciar la propia lamina
		boton2.addActionListener(Boton2);
		boton3.addActionListener(Boton3);
		boton4.addActionListener(Boton4);
		/*
		AccionColor boton1 = new AccionColor("Amarillo", new ImageIcon("src/imagenes/img1.png"),1);
		AccionColor boton2 = new AccionColor("Azul", new ImageIcon("src/imagenes/img2.png"),2);
		AccionColor boton3 = new AccionColor("Rojo", new ImageIcon("src/imagenes/img3.png"),3);
		
		add(new JButton(boton1));
		add(new JButton(boton2));
		add(new JButton(boton3));
		*/
	}
	//Declarar de Cuadros de Texto
	JTextField texto1;
	JTextField texto2;
	JTextField texto3;
	JTextField texto4;
	//Declarar Botones
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	
	//Clase Oyente
	private class id implements ActionListener{
		
		private int id;
		
		public id(int c) {
			id = c;
			
		}
// { texto1.setText("Done!"); }
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("boton pulsado");
			System.out.println(id);
			 texto1.setText(texto1.getText()); //value in the quotes is added
			 System.out.println(texto1.ge());
		}
	}
	
	
	
	//Declaro Clase Privada
	
	/*private class AccionColor extends AbstractAction{
		public AccionColor(String nombre, Icon icono,int color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "" + nombre);
			
			putValue("color_fondo", color_boton);
			
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int valor = (int) getValue("color_fondo");
			
			
		}
	}
	*/
	
	
	
	
}
