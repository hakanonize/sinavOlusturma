package completedProject;
import java.sql.*;
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
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class SoruListeleCikar extends JFrame {
	private static SoruListeleCikar sorulistelecikar = new SoruListeleCikar();
	public static SoruListeleCikar getInstance() {
		return sorulistelecikar;
	}
	


	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;

	DefaultTableModel modelim = new DefaultTableModel();
	
	Object[] kolonlar = {"Soru","A","B","C","D","Soru Puaný"};
	Object[] satirlar = new Object[6];
	private JLabel lblNewLabel;
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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoruListeleCikar frame = new SoruListeleCikar();
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
	private SoruListeleCikar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1240, 696);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton_19 = new JButton("Geri");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoruListelemePlatformu.getInstance().setVisible(true);
				dispose();
			}
		});
		menuBar.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("Anamenu");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anamenu.getInstance().setVisible(true);
				dispose();
			}
		});
		menuBar.add(btnNewButton_20);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 33, 561, 574);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		table.setModel(modelim);
		table.setBounds(75, 265, 476, 210);
		//contentPane.add(table);
		scrollPane.setViewportView(table);
		modelim.setColumnIdentifiers(kolonlar);
		modelim.addRow(satirlar);
		
		JButton btnNewButton = new JButton("FizikKolayListele");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Baglantimiz baglanti = new Baglantimiz();
				String url = "jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
				String query="Select * from kolay";
				ResultSet rs = baglanti.coktanlistele(query,url);
				
				try {
					while(rs.next()){
						
						satirlar[0]=rs.getString(1);
						satirlar[1]=rs.getString(2);
						satirlar[2]=rs.getString(3);
						satirlar[3]=rs.getString(4);
						satirlar[4]=rs.getString(5);
						satirlar[5]=rs.getInt(6);
						
					
						modelim.addRow(satirlar);
						
						
						
						
					}
				}
					
			
				catch (SQLException e1){
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(607, 65, 123, 33);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("F\u0130Z\u0130K \u00C7OKTAN SE\u00C7MEL\u0130");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(607, 13, 186, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("FizikKolayCikar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,sorgu;
				soru=textField.getText();
				String url="jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
				sorgu="DELETE FROM kolay WHERE soru="+"'"+soru+"'";
				//System.out.println(sorgu);
				Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu, url);
				
			}
		});
		btnNewButton_1.setBounds(597, 482, 133, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("FizikKolayD\u00FCzenle");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String soru,a,b,c,d,dogrucevap,deger;
				int puan;
				String silme=(String) modelim.getValueAt(table.getSelectedRow(), 0);
				soru=textField.getText();
				a=textField_1.getText();
				b=textField_2.getText();
				c=textField_3.getText();
				d=textField_4.getText();
				dogrucevap=textField_6.getText(); 
				deger=textField_5.getText();
				puan=Integer.valueOf(deger);
				String url="jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="UPDATE kolay SET soru='"
	           +soru+"',a='"+a+"',"
	           +"b='"+b+"',"+"c='"+c+"',"+"d='"+d+"',"+"puan="+puan+","+"dogrucevap='"+dogrucevap+"'"+"WHERE soru='"+silme+"'"
	            		;
				//System.out.println(sorgu);
				  Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
				System.out.println("Güncellendi");
			}
		});
		btnNewButton_2.setBounds(742, 482, 140, 33);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("L\u0130STELEME \u0130\u015ELEMLER\u0130");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_2.setBounds(607, 33, 196, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("FizikOrtaListele");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Baglantimiz baglanti = new Baglantimiz();
				String url = "jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
			String query="Select * from orta";
			ResultSet rs = baglanti.coktanlistele(query,url);
			
			try {
				while(rs.next()){
					
					satirlar[0]=rs.getString(1);
					satirlar[1]=rs.getString(2);
					satirlar[2]=rs.getString(3);
					satirlar[3]=rs.getString(4);
					satirlar[4]=rs.getString(5);
					satirlar[5]=rs.getInt(6);
					modelim.addRow(satirlar);
					
					
					
					
				}
			}
				
		
			catch (SQLException e1){
				e1.printStackTrace();
			}
			}
		});
		btnNewButton_3.setBounds(607, 111, 123, 33);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("FizikOrtaCikar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,sorgu;
				soru=textField.getText();
				String url="jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
				sorgu="DELETE FROM orta WHERE soru="+"'"+soru+"'";
				//System.out.println(sorgu);
				Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu, url);
			}
		});
		btnNewButton_4.setBounds(597, 528, 133, 33);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("FizikOrtaD\u00FCzenle");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String soru,a,b,c,d,dogrucevap,deger;
				int puan;
				String silme=(String) modelim.getValueAt(table.getSelectedRow(), 0);
				soru=textField.getText();
				a=textField_1.getText();
				b=textField_2.getText();
				c=textField_3.getText();
				d=textField_4.getText();
				dogrucevap=textField_6.getText(); 
				deger=textField_5.getText();
				puan=Integer.valueOf(deger);
				String url="jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="UPDATE orta SET soru='"
	           +soru+"',a='"+a+"',"
	           +"b='"+b+"',"+"c='"+c+"',"+"d='"+d+"',"+"puan="+puan+","+"dogrucevap='"+dogrucevap+"'"+"WHERE soru='"+silme+"'"
	            		;
				//System.out.println(sorgu);
				  Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
				System.out.println("Güncellendi");
			}
		});
		btnNewButton_5.setBounds(742, 528, 140, 33);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("FizikZorListele");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Baglantimiz baglanti = new Baglantimiz();
				String url = "jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
				String query="Select * from zor";
				ResultSet rs = baglanti.coktanlistele(query,url);
				
				try {
					while(rs.next()){
						satirlar[0]=rs.getString(1);
						satirlar[1]=rs.getString(2);
						satirlar[2]=rs.getString(3);
						satirlar[3]=rs.getString(4);
						satirlar[4]=rs.getString(5);
						satirlar[5]=rs.getInt(6);
					
						modelim.addRow(satirlar);
						
						
						
						
					}
				}
					
			
				catch (SQLException e1){
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_6.setBounds(609, 157, 121, 33);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("FizikZorCikar");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,sorgu;
				soru=textField.getText();
				String url="jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
				sorgu="DELETE FROM zor WHERE soru="+"'"+soru+"'";
				//System.out.println(sorgu);
				Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu, url);
			}
		});
		btnNewButton_7.setBounds(597, 574, 133, 33);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("FizikZorD\u00FCzenle");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,a,b,c,d,dogrucevap,deger;
				int puan;
				String silme=(String) modelim.getValueAt(table.getSelectedRow(), 0);
				soru=textField.getText();
				a=textField_1.getText();
				b=textField_2.getText();
				c=textField_3.getText();
				d=textField_4.getText();
				dogrucevap=textField_6.getText(); 
				deger=textField_5.getText();
				puan=Integer.valueOf(deger);
				String url="jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="UPDATE zor SET soru='"
	           +soru+"',a='"+a+"',"
	           +"b='"+b+"',"+"c='"+c+"',"+"d='"+d+"',"+"puan="+puan+","+"dogrucevap='"+dogrucevap+"'"+"WHERE soru='"+silme+"'"
	            		;
				//System.out.println(sorgu);
				  Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
				System.out.println("Güncellendi");
			}
		});
		btnNewButton_8.setBounds(742, 574, 140, 33);
		contentPane.add(btnNewButton_8);
		
		JLabel lblNewLabel_3 = new JLabel("K\u0130MYA \u00C7OKTAN SE\u00C7MEL\u0130");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3.setBounds(955, 13, 202, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("L\u0130STELEME \u0130\u015ELEMLER\u0130");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_5.setBounds(969, 33, 169, 24);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_9 = new JButton("KimyaKolayListele");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglantimiz baglanti = new Baglantimiz();
				String url = "jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
				String query="Select * from kolay";
				ResultSet rs = baglanti.coktanlistele(query,url);
				
				try {
					while(rs.next()){
						satirlar[0]=rs.getString(1);
						satirlar[1]=rs.getString(2);
						satirlar[2]=rs.getString(3);
						satirlar[3]=rs.getString(4);
						satirlar[4]=rs.getString(5);
						satirlar[5]=rs.getInt(6);
					
						modelim.addRow(satirlar);
						
						
						
						
					}
				}
					
			
				catch (SQLException e1){
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_9.setBounds(979, 65, 133, 33);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("KimyaKolayCikar");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,sorgu;
				soru=textField.getText();
				String url="jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
				sorgu="DELETE FROM kolay WHERE soru="+"'"+soru+"'";
				//System.out.println(sorgu);
				Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu, url);
			}
		});
		btnNewButton_10.setBounds(920, 482, 133, 33);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("KimyaKolayD\u00FCzenle");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,a,b,c,d,dogrucevap,deger;
				int puan;
				String silme=(String) modelim.getValueAt(table.getSelectedRow(), 0);
				soru=textField.getText();
				a=textField_1.getText();
				b=textField_2.getText();
				c=textField_3.getText();
				d=textField_4.getText();
				dogrucevap=textField_6.getText(); 
				deger=textField_5.getText();
				puan=Integer.valueOf(deger);
				String url="jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="UPDATE kolay SET soru='"
	           +soru+"',a='"+a+"',"
	           +"b='"+b+"',"+"c='"+c+"',"+"d='"+d+"',"+"puan="+puan+","+"dogrucevap='"+dogrucevap+"'"+"WHERE soru='"+silme+"'"
	            		;
				//System.out.println(sorgu);
				  Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
				System.out.println("Güncellendi");
			}
		});
		btnNewButton_11.setBounds(1065, 482, 140, 33);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("KimyaOrtaListele");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglantimiz baglanti = new Baglantimiz();
				String url = "jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
				String query="Select * from orta";
				ResultSet rs = baglanti.coktanlistele(query,url);
				
				try {
					while(rs.next()){
						satirlar[0]=rs.getString(1);
						satirlar[1]=rs.getString(2);
						satirlar[2]=rs.getString(3);
						satirlar[3]=rs.getString(4);
						satirlar[4]=rs.getString(5);
						satirlar[5]=rs.getInt(6);
					
						modelim.addRow(satirlar);
						
								
						
						
						
						
					}
				}
					
			
				catch (SQLException e1){
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_12.setBounds(979, 111, 133, 33);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("KimyaOrtaCikar");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,sorgu;
				soru=textField.getText();
				String url="jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
				sorgu="DELETE FROM orta WHERE soru="+"'"+soru+"'";
				//System.out.println(sorgu);
				Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu, url);
			}
		});
		btnNewButton_13.setBounds(920, 528, 133, 33);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("KimyaOrtaD\u00FCzenle");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,a,b,c,d,dogrucevap,deger;
				int puan;
				String silme=(String) modelim.getValueAt(table.getSelectedRow(), 0);
				soru=textField.getText();
				a=textField_1.getText();
				b=textField_2.getText();
				c=textField_3.getText();
				d=textField_4.getText();
				dogrucevap=textField_6.getText(); 
				deger=textField_5.getText();
				puan=Integer.valueOf(deger);
				String url="jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="UPDATE orta SET soru='"
	           +soru+"',a='"+a+"',"
	           +"b='"+b+"',"+"c='"+c+"',"+"d='"+d+"',"+"puan="+puan+","+"dogrucevap='"+dogrucevap+"'"+"WHERE soru='"+silme+"'"
	            		;
				//System.out.println(sorgu);
				  Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
				System.out.println("Güncellendi");
			}
		});
		btnNewButton_14.setBounds(1065, 528, 140, 33);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("KimyaZorListele");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglantimiz baglanti = new Baglantimiz();
				String url = "jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
				String query="Select * from zor";
				ResultSet rs = baglanti.coktanlistele(query,url);
				
				try {
					while(rs.next()){
						satirlar[0]=rs.getString(1);
						satirlar[1]=rs.getString(2);
						satirlar[2]=rs.getString(3);
						satirlar[3]=rs.getString(4);
						satirlar[4]=rs.getString(5);
						satirlar[5]=rs.getInt(6);
					
						modelim.addRow(satirlar);
						
						
						
						
						
					}
				}
					
			
				catch (SQLException e1){
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_15.setBounds(979, 157, 133, 33);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("KimyaZorCikar");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,sorgu;
				soru=textField.getText();
				String url="jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
				sorgu="DELETE FROM zor WHERE soru="+"'"+soru+"'";
				//System.out.println(sorgu);
				Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu, url);
			}
		});
		btnNewButton_16.setBounds(920, 574, 133, 33);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("KimyaZorD\u00FCzenle");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soru,a,b,c,d,dogrucevap,deger;
				int puan;
				String silme=(String) modelim.getValueAt(table.getSelectedRow(), 0);
				soru=textField.getText();
				a=textField_1.getText();
				b=textField_2.getText();
				c=textField_3.getText();
				d=textField_4.getText();
				dogrucevap=textField_6.getText(); 
				deger=textField_5.getText();
				puan=Integer.valueOf(deger);
				String url="jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
	            String sorgu="UPDATE zor SET soru='"
	           +soru+"',a='"+a+"',"
	           +"b='"+b+"',"+"c='"+c+"',"+"d='"+d+"',"+"puan="+puan+","+"dogrucevap='"+dogrucevap+"'"+"WHERE soru='"+silme+"'"
	            		;
				System.out.println(sorgu);
				  Baglantimiz baglanti = new Baglantimiz();
				baglanti.coktanEkle(sorgu,url);
				System.out.println("Güncellendi");
			}
		});
		btnNewButton_17.setBounds(1065, 574, 140, 33);
		contentPane.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("TABLOYU TEM\u0130ZLE");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelim.getDataVector().removeAllElements();
				modelim.fireTableDataChanged();
			}
		});
		btnNewButton_18.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton_18.setBounds(1008, 308, 180, 45);
		contentPane.add(btnNewButton_18);
		
		textField = new JTextField();
		textField.setBounds(661, 219, 304, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(661, 257, 304, 25);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(662, 295, 304, 25);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(662, 332, 304, 25);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(661, 370, 304, 25);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("SORU");
		lblNewLabel_1.setBounds(617, 223, 44, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(637, 261, 24, 21);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(637, 297, 24, 21);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(637, 336, 24, 21);
		contentPane.add(lblC);
		
		JLabel lblD = new JLabel("D");
		lblD.setBounds(637, 374, 24, 21);
		contentPane.add(lblD);
		
		JLabel lblNewLabel_4 = new JLabel("F\u0130Z\u0130K S\u0130L-D\u00DCZENLE \u0130\u015ELEMLER\u0130");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_4.setBounds(626, 455, 255, 25);
		contentPane.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(661, 408, 304, 25);
		contentPane.add(textField_5);
		
		JLabel lblPuan = new JLabel("Puan");
		lblPuan.setBounds(624, 408, 37, 21);
		contentPane.add(lblPuan);
		
		textField_6 = new JTextField();
		textField_6.setBounds(1050, 221, 148, 24);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Do\u011Fru Yan\u0131t");
		lblNewLabel_6.setBounds(972, 223, 66, 21);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7=new JLabel("K\u0130MYA S\u0130L-D\u00DCZENLE \u0130\u015ELEMLER\u0130");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_7.setBounds(920, 455, 279, 21);
		contentPane.add(lblNewLabel_7);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText((String) modelim.getValueAt(table.getSelectedRow(),0));
				textField_1.setText((String) modelim.getValueAt(table.getSelectedRow(),1));
				textField_2.setText((String) modelim.getValueAt(table.getSelectedRow(),2));
				textField_3.setText((String) modelim.getValueAt(table.getSelectedRow(),3));
				textField_4.setText((String) modelim.getValueAt(table.getSelectedRow(),4));
				textField_5.setText((String) modelim.getValueAt(table.getSelectedRow(),5).toString());
			}
		});
		
	}
}
