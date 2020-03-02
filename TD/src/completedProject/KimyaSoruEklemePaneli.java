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


public class KimyaSoruEklemePaneli extends JFrame {
	private static KimyaSoruEklemePaneli soruekle = new KimyaSoruEklemePaneli();
	public static KimyaSoruEklemePaneli getInstance() {
		return soruekle;
	}
	



	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	/**
	 * Launch the application.
	 */
	
	
	
	
	/**
	 * Create the frame.
	 */
	private KimyaSoruEklemePaneli() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 520);
		
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
		
		JLabel lblNewLabel = new JLabel("K\u0130MYA \u00C7OKTAN-SE\u00C7MEL\u0130 SORU EKLEME PANEL\u0130NE HO\u015EGELD\u0130N\u0130Z");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(30, 1, 517, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(53, 60, 465, 64);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(53, 137, 465, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(53, 180, 465, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(53, 218, 465, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(53, 269, 465, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("L\u00DCTFEN SORUYU G\u0130R\u0130N\u0130Z");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(40, 25, 415, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("a-)");
		lblNewLabel_2.setBounds(30, 140, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("b-)");
		lblNewLabel_3.setBounds(30, 183, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("c-)");
		lblNewLabel_4.setBounds(30, 221, 56, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("d-)");
		lblNewLabel_5.setBounds(30, 272, 56, 16);
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
				String url="jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO kolay (soru, a , b, c, d , puan, dogrucevap) VALUES('"+ soru + "','" +a + "', '" + b + "','" + c + "','" + d + "','" + puan + "','"+dogrucevap+ "')";
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
				String url="jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO orta (soru, a , b, c, d , puan, dogrucevap) VALUES('"+ soru + "','" +a + "', '" + b + "','" + c + "','" + d + "','" + puan + "','"+dogrucevap+ "')";
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
				String url="jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO zor (soru, a , b, c, d , puan, dogrucevap) VALUES('"+ soru + "','" +a + "', '" + b + "','" + c + "','" + d + "','" + puan + "','"+dogrucevap+ "')";
				//System.out.println(sorgu);
	           Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton_2.setBounds(373, 381, 159, 43);
		contentPane.add(btnNewButton_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(133, 339, 385, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(133, 304, 385, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Soru Puan\u0131");
		lblNewLabel_7.setBounds(50, 304, 104, 22);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblDogruYant = new JLabel("Do\u011Fru Yan\u0131t");
		lblDogruYant.setBounds(50, 339, 104, 22);
		contentPane.add(lblDogruYant);
	}

}
