package herramientaTest;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.activation.CommandInfo;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.event.ChangeListener;

import constantes.Constantes;

import javax.swing.event.ChangeEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class HerramientaTest extends JFrame {

	private JPanel paneel;
	private JSlider slider;
	private JSlider slider_1;
	private JSlider slider_2;
	private JSlider slider_3;
	private JSlider slider_4;
	private JSlider slider_5;
	private JSlider slider_6;
	private JSlider slider_7;
	private JSlider slider_8;
	private JSlider slider_9;
	private JSlider slider_10;
	private JSlider slider_11;
	private JSlider slider_12;
	private JSlider slider_13;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	
	
	
	
	
	public HerramientaTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 556, 711);
		paneel=new JPanel();
		paneel.setBackground(Color.WHITE);
		paneel.setBounds(21, 534, 410, -534);
		paneel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(paneel);
		setBackground(Color.WHITE);

		paneel.setLayout(null);
		
		JLabel lblFuncionalidad = new JLabel("Funcionalidad");
		lblFuncionalidad.setFont(new Font("Georgia", Font.PLAIN, 13));
		
		lblFuncionalidad.setBounds(22, 11, 106, 21);
		paneel.add(lblFuncionalidad);
		
		JLabel lblEficiencia = new JLabel("Eficiencia");
		lblEficiencia.setFont(new Font("Georgia", Font.PLAIN, 14));
		lblEficiencia.setBounds(22, 85, 82, 14);
		paneel.add(lblEficiencia);
		
		JLabel lblSeguridadDeAcceso = new JLabel("Seguridad de Acceso");
		lblSeguridadDeAcceso.setBounds(32, 35, 190, 14);
		paneel.add(lblSeguridadDeAcceso);
		
		JLabel lblNewLabel = new JLabel("Exactitud de los resultados");
		lblNewLabel.setBounds(31, 60, 206, 14);
		paneel.add(lblNewLabel);
		
		JLabel lblUtilizacinDeRecursos = new JLabel("Utilizaci\u00F3n de recursos");
		lblUtilizacinDeRecursos.setBounds(32, 106, 190, 14);
		paneel.add(lblUtilizacinDeRecursos);
		
		JLabel lblComportamientoFrenteAl = new JLabel("Comportamiento frente al tiempo");
		lblComportamientoFrenteAl.setBounds(31, 131, 206, 14);
		paneel.add(lblComportamientoFrenteAl);
		
		JLabel lblFiabilidad = new JLabel("Fiabilidad");
		lblFiabilidad.setFont(new Font("Georgia", Font.PLAIN, 14));
		lblFiabilidad.setBounds(22, 162, 82, 14);
		paneel.add(lblFiabilidad);
		
		JLabel lblToleranciaAFallos = new JLabel("Tolerancia a fallos");
		lblToleranciaAFallos.setBounds(32, 187, 163, 14);
		paneel.add(lblToleranciaAFallos);
		

		
		JLabel lblRecuperacionDeErrores = new JLabel("Recuperaci\u00F3n de errores");
		lblRecuperacionDeErrores.setBounds(33, 212, 162, 14);
		paneel.add(lblRecuperacionDeErrores);
		
		slider = new JSlider();

		slider.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				label.setText(Constantes.texto2);
			}
		});
		slider.setBackground(Color.WHITE);
		slider.setMinorTickSpacing(2);
		slider.setToolTipText("");
		slider.setValue(4);
		slider.setMaximum(7);
		slider.setBounds(260, 35, 163, 21);
		paneel.add(slider);
		
		slider_1 = new JSlider();		
		slider_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				label.setText(Constantes.texto1);
			}
		});
		
		slider_1.setBackground(Color.WHITE);
		slider_1.setValue(3);
		slider_1.setMaximum(9);
		slider_1.setBounds(260, 60, 163, 21);
		paneel.add(slider_1);

		slider_2 = new JSlider();
		slider_2.setBackground(Color.WHITE);
		slider_2.setValue(3);
		slider_2.setMaximum(7);
		slider_2.setBounds(260, 106, 163, 21);
		paneel.add(slider_2);
		
		slider_3 = new JSlider();
		slider_3.setBackground(Color.WHITE);
		slider_3.setValue(3);
		slider_3.setMaximum(7);
		slider_3.setBounds(260, 131, 163, 21);
		paneel.add(slider_3);
		
		slider_4 = new JSlider();
		slider_4.setBackground(Color.WHITE);
		slider_4.setValue(3);
		slider_4.setMaximum(7);
		slider_4.setBounds(260, 187, 163, 21);
		paneel.add(slider_4);
		
		slider_5 = new JSlider();
		slider_5.setBackground(Color.WHITE);
		slider_5.setValue(3);
		slider_5.setMaximum(7);
		slider_5.setBounds(260, 212, 163, 21);
		paneel.add(slider_5);
		
		JLabel lblMantenibilidad = new JLabel("Mantenibilidad");
		lblMantenibilidad.setFont(new Font("Georgia", Font.PLAIN, 14));
		lblMantenibilidad.setBounds(23, 244, 144, 14);
		paneel.add(lblMantenibilidad);
		
		JLabel lblCapDelCodigo = new JLabel("Capacidad del codigo de ser analizado");
		lblCapDelCodigo.setBounds(33, 269, 214, 14);
		paneel.add(lblCapDelCodigo);
		
		JLabel lblCapacidadDelCdigo = new JLabel("Capacidad del c\u00F3digo de ser cambiado");
		lblCapacidadDelCdigo.setBounds(33, 294, 204, 14);
		paneel.add(lblCapacidadDelCdigo);
		
		JLabel lblEstabilidad = new JLabel("Estabilidad");
		lblEstabilidad.setBounds(33, 319, 86, 14);
		paneel.add(lblEstabilidad);
		
		JLabel lblUsabilidad = new JLabel("Usabilidad");
		lblUsabilidad.setFont(new Font("Georgia", Font.PLAIN, 14));
		lblUsabilidad.setBounds(23, 350, 82, 14);
		paneel.add(lblUsabilidad);
		
		JLabel lblCapacidadDeSer = new JLabel("Capacidad de ser entendido");
		lblCapacidadDeSer.setBounds(33, 375, 150, 14);
		paneel.add(lblCapacidadDeSer);
		
		JLabel lblCapacidadDeSer_1 = new JLabel("Capacidad de ser operado");
		lblCapacidadDeSer_1.setBounds(32, 400, 135, 14);
		paneel.add(lblCapacidadDeSer_1);
		
		JLabel lblCapacidadDeSer_2 = new JLabel("Capacidad de ser atractivo para el usuario");
		lblCapacidadDeSer_2.setBounds(33, 425, 214, 14);
		paneel.add(lblCapacidadDeSer_2);
		
		JLabel lblPortabilidad = new JLabel("Portabilidad");
		lblPortabilidad.setFont(new Font("Georgia", Font.PLAIN, 14));
		lblPortabilidad.setBounds(23, 456, 106, 14);
		paneel.add(lblPortabilidad);
		
		JLabel lblAdaptabilidad = new JLabel("Adaptabilidad");
		lblAdaptabilidad.setBounds(33, 481, 96, 14);
		paneel.add(lblAdaptabilidad);
		
		JLabel lblInstalabilidad = new JLabel("Instalabilidad");
		lblInstalabilidad.setBounds(32, 506, 96, 14);
		paneel.add(lblInstalabilidad);
		
		slider_6 = new JSlider();
		slider_6.setBackground(Color.WHITE);
		slider_6.setValue(3);
		slider_6.setMaximum(7);
		slider_6.setBounds(260, 269, 163, 21);
		paneel.add(slider_6);
		
		slider_7 = new JSlider();
		slider_7.setBackground(Color.WHITE);
		slider_7.setValue(3);
		slider_7.setMaximum(6);
		slider_7.setBounds(260, 294, 163, 21);
		paneel.add(slider_7);
		
		slider_8 = new JSlider();
		slider_8.setForeground(Color.YELLOW);
		slider_8.setBackground(Color.WHITE);
		slider_8.setValue(3);
		slider_8.setMaximum(7);
		slider_8.setBounds(260, 319, 163, 21);
		paneel.add(slider_8);
		
		slider_9 = new JSlider();
		slider_9.setBackground(Color.WHITE);
		slider_9.setValue(3);
		slider_9.setMaximum(7);
		slider_9.setBounds(260, 375, 163, 21);
		paneel.add(slider_9);
		
		slider_10 = new JSlider();
		slider_10.setBackground(Color.WHITE);
		slider_10.setValue(3);
		slider_10.setMaximum(9);
		slider_10.setBounds(260, 400, 163, 21);
		paneel.add(slider_10);
		
		slider_11 = new JSlider();
		slider_11.setBackground(Color.WHITE);
		slider_11.setValue(3);
		slider_11.setMaximum(7);
		slider_11.setBounds(260, 425, 163, 21);
		paneel.add(slider_11);
		
		slider_12 = new JSlider();
		slider_12.setBackground(Color.WHITE);
		slider_12.setValue(3);
		slider_12.setMaximum(7);
		slider_12.setBounds(260, 481, 163, 21);
		paneel.add(slider_12);
		
		slider_13 = new JSlider();
		slider_13.setBackground(Color.WHITE);
		slider_13.setValue(3);
		slider_13.setMaximum(7);
		slider_13.setBounds(260, 506, 163, 21);
		paneel.add(slider_13);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 531, 520, 130);
		paneel.add(panel);
		
		label = new JLabel("");
		panel.add(label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setText("");
		
		label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(433, 33, 29, 14);
		paneel.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(433, 60, 29, 14);
		paneel.add(label_2);
		
		label_3 = new JLabel("");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(433, 106, 29, 14);
		paneel.add(label_3);
		
		label_4 = new JLabel("");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(433, 131, 29, 14);
		paneel.add(label_4);
		
		label_5 = new JLabel("");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(433, 187, 29, 14);
		paneel.add(label_5);
		
		label_6 = new JLabel("");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(433, 212, 29, 14);
		paneel.add(label_6);
		
		label_7 = new JLabel("");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(433, 269, 29, 14);
		paneel.add(label_7);
		
		label_8 = new JLabel("");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(433, 294, 29, 14);
		paneel.add(label_8);
		
		label_9 = new JLabel("");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_9.setBounds(433, 319, 29, 14);
		paneel.add(label_9);
		
		label_10 = new JLabel("");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_10.setBounds(433, 375, 29, 14);
		paneel.add(label_10);
		
		label_11 = new JLabel("");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_11.setBounds(433, 400, 29, 14);
		paneel.add(label_11);
		
		label_12 = new JLabel("");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_12.setBounds(433, 425, 29, 14);
		paneel.add(label_12);
		
		label_13 = new JLabel("");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_13.setBounds(433, 481, 29, 14);
		paneel.add(label_13);
		
		label_14 = new JLabel("");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_14.setBounds(433, 506, 29, 14);
		paneel.add(label_14);
		double tamPanel=paneel.getPreferredSize().getWidth();
		
		slider.addChangeListener(new ChangeListener() {
		public void stateChanged(ChangeEvent arg0) {
			label_1.setText(Integer.toString(slider.getValue()));
		}
		});

		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_2.setText(Integer.toString(slider_1.getValue()));
			}
		});
		
		slider_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_3.setText(Integer.toString(slider_2.getValue()));
			}
		});
		
		slider_3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_4.setText(Integer.toString(slider_3.getValue()));
			}
		});
		
		slider_4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_5.setText(Integer.toString(slider_4.getValue()));
			}
		});
		
		slider_5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_6.setText(Integer.toString(slider_5.getValue()));
			}
		});
		
		slider_6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_7.setText(Integer.toString(slider_6.getValue()));
			}
		});
		
		slider_7.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_8.setText(Integer.toString(slider_7.getValue()));
			}
		});
		
		slider_8.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_9.setText(Integer.toString(slider_8.getValue()));
			}
		});
		
		slider_9.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_10.setText(Integer.toString(slider_9.getValue()));
			}
		});
		
		slider_10.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_11.setText(Integer.toString(slider_10.getValue()));
			}
		});
		
		slider_11.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_12.setText(Integer.toString(slider_11.getValue()));
			}
		});
		
		slider_12.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_13.setText(Integer.toString(slider_12.getValue()));
			}
		});
		
		slider_13.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label_14.setText(Integer.toString(slider_13.getValue()));
			}
		});
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HerramientaTest frame = new HerramientaTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
}