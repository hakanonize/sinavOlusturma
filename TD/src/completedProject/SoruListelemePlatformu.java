package completedProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

public class SoruListelemePlatformu extends JFrame {
	private static SoruListelemePlatformu soruListele = new SoruListelemePlatformu();
	public static SoruListelemePlatformu getInstance() {
		return soruListele;
		}
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoruListelemePlatformu frame = new SoruListelemePlatformu();
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
	private SoruListelemePlatformu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 543);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton_3 = new JButton("Geri");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anamenu.getInstance().setVisible(true);
				dispose();
			}
		});
		menuBar.add(btnNewButton_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("L\u0130STELEMEK \u0130STED\u0130\u011E\u0130N\u0130Z T\u00DCR\u00DC SE\u00C7\u0130N\u0130Z");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 27));
		lblNewLabel.setBounds(112, 13, 575, 100);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u00C7OKTAN-SE\u00C7MEL\u0130");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			SoruListeleCikar.getInstance().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(53, 185, 212, 76);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DO\u011ERU-YANLI\u015E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DYSoruListeleÇýkar.getInstance().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_1.setBounds(277, 185, 225, 76);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("KLAS\u0130K");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KlasikSoruListeleCikar.getInstance().setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_2.setBounds(514, 185, 221, 76);
		contentPane.add(btnNewButton_2);
	}
}
