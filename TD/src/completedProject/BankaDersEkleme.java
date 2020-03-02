package completedProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class BankaDersEkleme extends JFrame {
	private static BankaDersEkleme bankaders = new BankaDersEkleme();
	public static BankaDersEkleme getInstance() {
		return bankaders;
	}
	


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankaDersEkleme frame = new BankaDersEkleme();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private BankaDersEkleme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 672);
		
		JMenuBar menuBar_2 = new JMenuBar();
		setJMenuBar(menuBar_2);
		
		JButton btnNewButton_6 = new JButton("Geri");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anamenu.getInstance().setVisible(true);
				dispose();
			}
		});
		menuBar_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("AnaMenu");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anamenu.getInstance().setVisible(true);
				dispose();
			}
		});
		menuBar_2.add(btnNewButton_7);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SORU EKLEMEK \u0130STED\u0130\u011E\u0130N\u0130Z DERS\u0130 SE\u00C7\u0130N\u0130Z");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(106, 30, 441, 57);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Arial", Font.BOLD, 23));
		menuBar.setBounds(379, 141, 187, 72);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("K\u0130MYA");
		mnNewMenu_1.setFont(new Font("Arial", Font.BOLD, 26));
		menuBar.add(mnNewMenu_1);
		
		JButton btnNewButton = new JButton("\u00C7OKTAN SE\u00C7MEL\u0130");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KimyaSoruEklemePaneli.getInstance().setVisible(true);
			}
		});
		mnNewMenu_1.add(btnNewButton);
		
		
		JButton btnNewButton_2 = new JButton("DO\u011ERU YANLI\u015E");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FizikDYSoruEkleme.getInstance().setVisible(true);
			}
		});
		mnNewMenu_1.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("KLAS\u0130K");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KlasikSoruEklemePaneli.getInstance().setVisible(true);
			}
		});
		mnNewMenu_1.add(btnNewButton_1);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setFont(new Font("Arial", Font.BOLD, 20));
		menuBar_1.setBounds(70, 141, 187, 81);
		contentPane.add(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("F\u0130Z\u0130K");
		mnNewMenu.setFont(new Font("Arial", Font.BOLD, 26));
		menuBar_1.add(mnNewMenu);
		
		JButton btnNewButton_5 = new JButton("\u00C7OKTAN SE\u00C7MEL\u0130");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoruEklemePaneli.getInstance().setVisible(true);
			}
		});
		mnNewMenu.add(btnNewButton_5);
		
		JButton btnNewButton_3 = new JButton("DO\u011ERU YANLI\u015E");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FizikDYSoruEkleme.getInstance().setVisible(true);
				
			}
		});
		mnNewMenu.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("KLAS\u0130K");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KlasikSoruEklemePaneli.getInstance().setVisible(true);
				
			}
		});
		mnNewMenu.add(btnNewButton_4);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
