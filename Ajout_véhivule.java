package lesinterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Ajout_véhivule extends JFrame implements ActionListener{
	int nbreVRoute1, nbreVRoute2, nbreVRoute3, nbreVRoute4;
	JButton Quitter = new JButton("Quitter");
	JButton Simuler = new JButton("Simuler");
	
	JPanel panelCentral = new JPanel();
//	String [] slabelVitesse     = {"Vitesse", "Vitesse", "Vitesse", "Vitesse"};
	JPanel panelVitesse1 = new JPanel();
	JPanel panelVitesse2 = new JPanel();
	JPanel panelVitesse3 = new JPanel();
	JPanel panelVitesse4 = new JPanel();

	//JLabel [] labelVitesse1= new JLabel[slabelVitesse.length];
	JLabel labelVitesse1 = new JLabel("Vitesse");
	JLabel labelVitesse2 = new JLabel("Vitesse");
	JLabel labelVitesse3 = new JLabel("Vitesse");
	JLabel labelVitesse4 = new JLabel("Vitesse");
	
	JLabel labelCentral= new JLabel("Simulation");

	JPanel panelB1 = new JPanel();
	JPanel panelB2 = new JPanel();
	
	JPanel panelPrincipal = new JPanel();
	JPanel panelPrincipal2 = new JPanel();
	
	JPanel panelRoute1 = new JPanel();
	JPanel panelRoute2 = new JPanel();
	JPanel panelRoute3 = new JPanel();
	JPanel panelRoute4 = new JPanel();

	JPanel panelTimeVert1 = new JPanel();
	JPanel panelTimeVert2 = new JPanel();
	JPanel panelTimeVert3 = new JPanel();
	JPanel panelTimeVert4 = new JPanel();


	JPanel panelTimeRouge1 = new JPanel();
	JPanel panelTimeRouge2 = new JPanel();
	JPanel panelTimeRouge3 = new JPanel();
	JPanel panelTimeRouge4 = new JPanel();
	
	JPanel panelNbreVehicules1 = new JPanel();
	JPanel panelNbreVehicules2 = new JPanel();
	JPanel panelNbreVehicules3 = new JPanel();
	JPanel panelNbreVehicules4 = new JPanel();
	
	JLabel labelRoute1= new JLabel("Route1");
	JLabel labelRoute2= new JLabel("Route2");
	JLabel labelRoute3 =new JLabel("Route3");
	JLabel labelRoute4= new JLabel("Route4");

	JLabel labelTimeVert1= new JLabel("time");
	JLabel labelTimeVert2= new JLabel("time");
	JLabel labelTimeVert3= new JLabel("time");
	JLabel labelTimeVert4= new JLabel("time");

	JLabel labelTimeRouge1= new JLabel("time");
	JLabel labelTimeRouge2= new JLabel("time");
	JLabel labelTimeRouge3= new JLabel("time");
	JLabel labelTimeRouge4= new JLabel("time");
	
	JLabel labelNbreDeVehicule1= new JLabel("nombre de véhicules");
	JLabel labelNbreDeVehicule2= new JLabel("nombre de véhicules");
	JLabel labelNbreDeVehicule3= new JLabel("nombre de véhicules");
	JLabel labelNbreDeVehicule4= new JLabel("nombre de véhicules");
	
	String[] elements1 = { "0","1", "2", "3", "4","5", "6", "7", "8", "9", "10"};

	JComboBox choixNbreVehicule1= new JComboBox(elements1);
	JComboBox choixNbreVehicule2= new JComboBox(elements1);
	JComboBox choixNbreVehicule3= new JComboBox(elements1);
	JComboBox choixNbreVehicule4= new JComboBox(elements1);
	
	JTextField Vitesse1 = new JTextField(5);
	JTextField Vitesse2 = new JTextField(5);
	JTextField Vitesse3 = new JTextField(5);
	JTextField Vitesse4 = new JTextField(5);

	JTextField timeVert1= new JTextField(5);
	JTextField timeVert2= new JTextField(5);
	JTextField timeVert3= new JTextField(5);
	JTextField timeVert4= new JTextField(5);
	
	JTextField timeRouge1= new JTextField(5);
	JTextField timeRouge2= new JTextField(5);
	JTextField timeRouge3= new JTextField(5);
	JTextField timeRouge4= new JTextField(5);
	
	public Ajout_véhivule() {
		super("Ajouter Véhicule");
		add(panelPrincipal, BorderLayout.CENTER);
		add(panelPrincipal2, BorderLayout.SOUTH);
		panelPrincipal.setLayout(null);
		//panelPrincipal2.setLayout(new BoxLayout(panelPrincipal2,BoxLayout.X_AXIS));
		panelPrincipal2.setLayout(new FlowLayout());
		Quitter.addActionListener(this);
		Simuler.addActionListener(this);
		panelB1.add(Quitter);
		panelB2.add(Simuler);
		
		panelPrincipal2.add(panelB1);
		panelPrincipal2.add(panelB2);

		panelCentral.add(labelCentral, "center");
		Font font = new Font("Arial",Font.BOLD,18);
		labelCentral.setFont(font);
		
		panelCentral.setBounds(190, 195, 120, 40);
		panelCentral.setBackground(new Color(51, 187, 198));
		//panelCentral.setBackground(Color.LIGHT_GRAY);
		
		panelRoute1.setBounds(5, 5, 190, 190);
		panelRoute2.setBounds(290, 5, 190, 190);
		panelRoute3.setBounds(5, 255, 190, 190);
		panelRoute4.setBounds(290, 255, 190, 190);
		
		panelRoute1.setLayout(new BoxLayout(panelRoute1,BoxLayout.Y_AXIS));
		panelRoute2.setLayout(new BoxLayout(panelRoute2,BoxLayout.Y_AXIS));
		panelRoute3.setLayout(new BoxLayout(panelRoute3,BoxLayout.Y_AXIS));
		panelRoute4.setLayout(new BoxLayout(panelRoute4,BoxLayout.Y_AXIS));

		panelVitesse1.add(labelVitesse1);
		panelVitesse2.add(labelVitesse2);
		panelVitesse3.add(labelVitesse3);
		panelVitesse4.add(labelVitesse4);
		
		panelVitesse1.add(Vitesse1);
		panelVitesse2.add(Vitesse2);
		panelVitesse3.add(Vitesse3);
		panelVitesse4.add(Vitesse4);
		
		panelPrincipal.add(panelRoute1);
		panelPrincipal.add(panelRoute2);
		panelPrincipal.add(panelRoute3);
		panelPrincipal.add(panelRoute4);
		panelPrincipal.add(panelCentral);

		panelNbreVehicules1.add(labelNbreDeVehicule1);
		panelNbreVehicules2.add(labelNbreDeVehicule2);
		panelNbreVehicules3.add(labelNbreDeVehicule3);
		panelNbreVehicules4.add(labelNbreDeVehicule4);
		
		panelNbreVehicules1.add(choixNbreVehicule1);
		panelNbreVehicules2.add(choixNbreVehicule2);
		panelNbreVehicules3.add(choixNbreVehicule3);
		panelNbreVehicules4.add(choixNbreVehicule4);
		
		panelTimeVert1.add(labelTimeVert1);
		panelTimeVert1.add(timeVert1);
		panelTimeRouge1.add(labelTimeRouge1);
		panelTimeRouge1.add(timeRouge1);
		
		panelTimeVert2.add(labelTimeVert2);
		panelTimeVert2.add(timeVert2);
		panelTimeRouge2.add(labelTimeRouge2);
		panelTimeRouge2.add(timeRouge2);
		
		panelTimeVert3.add(labelTimeVert3);
		panelTimeVert3.add(timeVert3);
		panelTimeRouge3.add(labelTimeRouge3);
		panelTimeRouge3.add(timeRouge3);

		panelTimeVert4.add(labelTimeVert4);
		panelTimeVert4.add(timeVert4);
		panelTimeRouge4.add(labelTimeRouge4);
		panelTimeRouge4.add(timeRouge4);
		
		panelRoute1.add(labelRoute1);
		panelRoute1.add(panelNbreVehicules1);
		panelRoute1.add(panelVitesse1);
		panelRoute1.add(panelTimeVert1);
		panelRoute1.add(panelTimeRouge1);
		
		panelRoute2.add(labelRoute2);
		panelRoute2.add(panelNbreVehicules2);
		panelRoute2.add(panelVitesse2);
		panelRoute2.add(panelTimeVert2);
		panelRoute2.add(panelTimeRouge2);
		
		panelRoute3.add(labelRoute3);
		panelRoute3.add(panelNbreVehicules3);
		panelRoute3.add(panelVitesse3);
		panelRoute3.add(panelTimeVert3);
		panelRoute3.add(panelTimeRouge3);
		
		panelRoute4.add(labelRoute4);
		panelRoute4.add(panelNbreVehicules4);
		panelRoute4.add(panelVitesse4);
		panelRoute4.add(panelTimeVert4);
		panelRoute4.add(panelTimeRouge4);
		
		labelTimeVert1.setForeground(new Color(5, 158, 51));
		labelTimeVert2.setForeground(new Color(5, 158, 51));
		labelTimeVert3.setForeground(new Color(5, 158, 51));
		labelTimeVert4.setForeground(new Color(5, 158, 51));
		
		labelTimeRouge1.setForeground(new Color(249, 0, 0));
		labelTimeRouge2.setForeground(new Color(249, 0, 0));
		labelTimeRouge3.setForeground(new Color(249, 0, 0));
		labelTimeRouge4.setForeground(new Color(249, 0, 0));
				
		timeVert2.setEditable(false);
		timeVert3.setEditable(false);
		timeVert4.setEditable(false);
		timeRouge2.setEditable(false);
		timeRouge3.setEditable(false);
		timeRouge4.setEditable(false);
	
		choixNbreVehicule1.addActionListener(this);
		choixNbreVehicule2.addActionListener(this);
		choixNbreVehicule3.addActionListener(this);
		choixNbreVehicule4.addActionListener(this);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		/*
		float tr1=Float.parseFloat(timeRouge1.getText());
		float tv1=Float.parseFloat(timeVert1.getText());
		float tr2=tv1+to1;
		float tv2=0;
		float to1=tr1-tv1;
		float to2=tr2-tv2;
		float to3=tr1-tv1;
		float to4=tr2-tv2;
		
		timeVert2.setText((""+tv2+""));
		timeVert3.setText((""+tv1+""));
		timeVert4.setText((""+tv2+""));
		
		timeRouge2.setText((""+tr2+""));
		timeRouge3.setText((""+tr1+""));
		timeRouge4.setText((""+tr2+""));
		*/

		float v1, v2, v3, v4;	
		if(e.getSource()==Quitter){
			System.exit(0);
		}else if(e.getSource()==Simuler){
			System.out.println("Route1 : "+nbreVRoute1+"véhicules");
			System.out.println("Route2 : "+nbreVRoute2+"véhicules");
			System.out.println("Route3 : "+nbreVRoute3+"véhicules");
			System.out.println("Route4 : "+nbreVRoute4+"véhicules");
			
			v1=Float.parseFloat(Vitesse1.getText());
			v2=Float.parseFloat(Vitesse2.getText());
			v3=Float.parseFloat(Vitesse3.getText());
			v4=Float.parseFloat(Vitesse4.getText());

		}else if(e.getSource()==choixNbreVehicule1){
			nbreVRoute1=choixNbreVehicule1.getSelectedIndex();
		}else if(e.getSource()==choixNbreVehicule2){
			nbreVRoute2=choixNbreVehicule2.getSelectedIndex();	
		}else if(e.getSource()==choixNbreVehicule3){
			nbreVRoute3=choixNbreVehicule3.getSelectedIndex();			
		}else if(e.getSource()==choixNbreVehicule4){
			nbreVRoute4=choixNbreVehicule4.getSelectedIndex();			
		}
	}
public static void main(String [] args){
	Ajout_véhivule f = new Ajout_véhivule();
    f.setSize(500,520);
    f.setVisible(true);
    f.setLocationRelativeTo(null); 
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}