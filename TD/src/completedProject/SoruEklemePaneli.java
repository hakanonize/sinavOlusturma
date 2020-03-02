package completedProject;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;


public class SoruEklemePaneli extends JFrame {
	private static SoruEklemePaneli soruekle = new SoruEklemePaneli();
	public static SoruEklemePaneli getInstance() {
		return soruekle;
	}
	



	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_5;
	
	/**
	 * Launch the application.
	 */
	
	
	
	
	/**
	 * Create the frame.
	 */
	private SoruEklemePaneli() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 505);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton_3 = new JButton("Geri");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BankaDersEkleme.getInstance().setVisible(true);
				dispose();
			}
		});
		menuBar.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("AnaMenu");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anamenu.getInstance().setVisible(true);
				dispose();
			}
		});
		menuBar.add(btnNewButton_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("F\u0130Z\u0130K \u00C7OKTAN-SE\u00C7MEL\u0130 SORU EKLEME PANEL\u0130NE HO\u015EGELD\u0130N\u0130Z");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(29, 0, 517, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(38, 55, 465, 61);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(38, 141, 465, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(38, 184, 465, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(38, 219, 465, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(38, 254, 465, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("L\u00DCTFEN SORUYU G\u0130R\u0130N\u0130Z");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(28, 24, 415, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("a-)");
		lblNewLabel_2.setBounds(12, 144, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("b-)");
		lblNewLabel_3.setBounds(12, 187, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("c-)");
		lblNewLabel_4.setBounds(12, 222, 56, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("d-)");
		lblNewLabel_5.setBounds(12, 254, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Kolay Sorulara Ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dogrucevap=textField_5.getText();
				String soru = textField.getText();
				String a = textField_1.getText();
				String b = textField_2.getText();
				String c = textField_3.getText();
				String d = textField_4.getText();
				String deger=textField_6.getText();
				int puan=Integer.valueOf(deger);
				String url="jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO kolay (soru, a, b, c, d,puan,dogrucevap) VALUES('"+ soru + "','" +a + "', '" + b + "','" + c + "','" + d + "','" + puan + "','"+ dogrucevap+ "')";
				//System.out.println(sorgu);
	           Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
			

			
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton.setBounds(12, 381, 159, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Orta Sorulara Ekle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dogrucevap=textField_5.getText();
				String soru = textField.getText();
				String a = textField_1.getText();
				String b = textField_2.getText();
				String c = textField_3.getText();
				String d = textField_4.getText();
				String deger=textField_6.getText();
				int puan=Integer.valueOf(deger);
				String url="jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO orta (soru, a, b, c, d,puan,dogrucevap) VALUES('"+ soru + "','" +a + "', '" + b + "','" + c + "','" + d + "','" + puan + "','"+ dogrucevap+ "')";
				//System.out.println(sorgu);
	           Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton_1.setBounds(180, 381, 181, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Zor Sorulara Ekle");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dogrucevap=textField_5.getText();
				String soru = textField.getText();
				String a = textField_1.getText();
				String b = textField_2.getText();
				String c = textField_3.getText();
				String d = textField_4.getText();
				String deger=textField_6.getText();
				int puan=Integer.valueOf(deger);
				String url="jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO zor (soru, a, b, c, d,puan,dogrucevap) VALUES('"+ soru + "','" +a + "', '" + b + "','" + c + "','" + d + "','" + puan + "','"+ dogrucevap+ "')";
				//System.out.println(sorgu);
	           Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton_2.setBounds(373, 381, 159, 43);
		contentPane.add(btnNewButton_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(80, 301, 417, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblSoruPuan = new JLabel("Soru Puan\u0131");
		lblSoruPuan.setBounds(12, 307, 68, 16);
		contentPane.add(lblSoruPuan);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(80, 346, 417, 22);
		contentPane.add(textField_5);
		
		JLabel lblDoruYant = new JLabel("Do\u011Fru Yan\u0131t");
		lblDoruYant.setBounds(12, 349, 68, 16);
		contentPane.add(lblDoruYant);
	}
}
