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


public class FizikDYSoruEkleme extends JFrame {
	private static FizikDYSoruEkleme soruekle = new FizikDYSoruEkleme();
	public static FizikDYSoruEkleme getInstance() {
		return soruekle;
	}
	



	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_5;
	private JTextField txtPuan;
	
	/**
	 * Launch the application.
	 */
	
	
	
	
	/**
	 * Create the frame.
	 */
	private FizikDYSoruEkleme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 586);
		
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
		
		JLabel lblNewLabel = new JLabel("DO\u011ERU YANLI\u015E SORU EKLEME PANEL\u0130NE HO\u015EGELD\u0130N\u0130Z");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(65, 13, 482, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(53, 77, 465, 109);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("L\u00DCTFEN SORUYU G\u0130R\u0130N\u0130Z");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(40, 42, 415, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("DO\u011ERU ");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_4.setBounds(113, 199, 72, 43);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("YANLI\u015E");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_5.setBounds(342, 199, 83, 43);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Kolay Sorulara Ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String soru,dogrucevap,deger;
				soru=textField.getText();
				dogrucevap=textField_5.getText();
				deger=txtPuan.getText();
				int puan=Integer.valueOf(deger);
				
				String url="jdbc:mysql://localhost:3306/kimya_dy?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO kolay (soru,puan,dogrucevap) VALUES('"+ soru + "','" + puan + "','"+ dogrucevap+ "')";
				//System.out.println(sorgu);
	            Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
			

			
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton.setBounds(12, 458, 159, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Orta Sorulara Ekle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,dogrucevap,deger;
				soru=textField.getText();
				dogrucevap=textField_5.getText();
				deger=txtPuan.getText();
				int puan=Integer.valueOf(deger);
				
				String url="jdbc:mysql://localhost:3306/kimya_dy?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO orta (soru,puan,dogrucevap) VALUES('"+ soru + "','" + puan + "','"+ dogrucevap+ "')";
				//System.out.println(sorgu);
	            Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton_1.setBounds(183, 458, 181, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Zor Sorulara Ekle");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,dogrucevap,deger;
				soru=textField.getText();
				dogrucevap=textField_5.getText();
				deger=txtPuan.getText();
				int puan=Integer.valueOf(deger);
				
				String url="jdbc:mysql://localhost:3306/kimya_dy?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO zor (soru,puan,dogrucevap) VALUES('"+ soru + "','" + puan + "','"+ dogrucevap+ "')";
				//System.out.println(sorgu);
	            Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton_2.setBounds(373, 458, 159, 43);
		contentPane.add(btnNewButton_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(133, 277, 385, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		txtPuan = new JTextField();
		txtPuan.setBounds(133, 242, 385, 22);
		contentPane.add(txtPuan);
		txtPuan.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Soru Puan\u0131");
		lblNewLabel_7.setBounds(53, 242, 104, 22);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblDogruYant = new JLabel("Do\u011Fru Yan\u0131t");
		lblDogruYant.setBounds(53, 277, 104, 22);
		contentPane.add(lblDogruYant);
		
		JButton button = new JButton("Kolay Sorulara Ekle");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,dogrucevap,deger;
				soru=textField.getText();
				dogrucevap=textField_5.getText();
				deger=txtPuan.getText();
				int puan=Integer.valueOf(deger);
				
				String url="jdbc:mysql://localhost:3306/fizik_dy?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO kolay (soru,puan,dogrucevap) VALUES('"+ soru + "','" + puan + "','"+ dogrucevap+ "')";
				//System.out.println(sorgu);
	            Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
				
			}
		});
		button.setFont(new Font("Arial", Font.BOLD, 13));
		button.setBounds(12, 353, 159, 43);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Orta Sorulara Ekle");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,dogrucevap,deger;
				soru=textField.getText();
				dogrucevap=textField_5.getText();
				deger=txtPuan.getText();
				int puan=Integer.valueOf(deger);
				
				String url="jdbc:mysql://localhost:3306/fizik_dy?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO orta (soru,puan,dogrucevap) VALUES('"+ soru + "','" + puan + "','"+ dogrucevap+ "')";
				//System.out.println(sorgu);
	            Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
			}
		});
		button_1.setFont(new Font("Arial", Font.BOLD, 13));
		button_1.setBounds(183, 353, 181, 43);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Zor Sorulara Ekle");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,dogrucevap,deger;
				soru=textField.getText();
				dogrucevap=textField_5.getText();
				deger=txtPuan.getText();
				int puan=Integer.valueOf(deger);
				
				String url="jdbc:mysql://localhost:3306/fizik_dy?useTimezone=true&serverTimezone=UTC";
	            String sorgu="INSERT INTO zor (soru,puan,dogrucevap) VALUES('"+ soru + "','" + puan + "','"+ dogrucevap+ "')";
				//System.out.println(sorgu);
	            Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
			}
		});
		button_2.setFont(new Font("Arial", Font.BOLD, 13));
		button_2.setBounds(373, 353, 159, 43);
		contentPane.add(button_2);
		
		JLabel lblNewLabel_2 = new JLabel("K\u0130MYA SORULARINA EKLEME ");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(133, 409, 385, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblFizikSorularnaEkleme = new JLabel("F\u0130Z\u0130K SORULARINA EKLEME ");
		lblFizikSorularnaEkleme.setFont(new Font("Arial", Font.BOLD, 18));
		lblFizikSorularnaEkleme.setBounds(133, 302, 385, 36);
		contentPane.add(lblFizikSorularnaEkleme);
	}
}
