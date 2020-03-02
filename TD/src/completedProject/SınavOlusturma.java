package completedProject;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javax.swing.JOptionPane;
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
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
public class SýnavOlusturma extends JFrame implements SinavHazirlama   {
	private static SýnavOlusturma sinavolustur = new SýnavOlusturma();
	public static SýnavOlusturma getInstance() {
		return sinavolustur;
	}
	

	DefaultTableModel model = new DefaultTableModel();
	Object[] kolonlar = {"Soru","A","B","C","D","Soru Puaný"};
	Object[] rows = new Object[6];
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;

	
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
					SýnavOlusturma frame = new SýnavOlusturma();
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
	private SýnavOlusturma() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1241, 700);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton_5 = new JButton("Geri");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anamenu.getInstance().setVisible(true);
				dispose();
			}
		});
		menuBar.add(btnNewButton_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 37, 561, 574);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		
		table.setBounds(75, 265, 476, 210);
		//contentPane.add(table);
		scrollPane.setViewportView(table);
		table.setModel(model);
		model.setColumnIdentifiers(kolonlar);
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
		
		
		JButton btnNewButton = new JButton("F\u0130Z\u0130K KOLAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = 0.50;
				double b = 0.30;
				double c = 0.20;
				
				fizikKolayCoktanSecmeli(a);
				 fizikOrtaCoktanSecmeli(b);
				 fizikZorCoktanSecmeli(c);
				fizikKolayDY(a);
			    fizikOrtaDY(b);
			    fizikZorDY(c);
				 fizikKolayKlasik(a);
			     fizikOrtaKlasik(b);
			    fizikZorKlasik(c);
					
				
	
			}
			
		});
		btnNewButton.setBounds(585, 388, 178, 53);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Soru Say\u0131s\u0131");
		lblNewLabel.setBounds(585, 219, 69, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblTestYzdelik = new JLabel("Test Y\u00FCzdelik");
		lblTestYzdelik.setBounds(579, 257, 75, 25);
		contentPane.add(lblTestYzdelik);
		
		JLabel lblDyYzdelik = new JLabel("DY Y\u00FCzdelik");
		lblDyYzdelik.setBounds(581, 295, 69, 25);
		contentPane.add(lblDyYzdelik);
		
		JLabel lblKlasikYzdelik = new JLabel("Klasik Y\u00FCzdelik");
		lblKlasikYzdelik.setBounds(572, 336, 82, 25);
		contentPane.add(lblKlasikYzdelik);
		
		JButton btnNewButton_1 = new JButton("F\u0130Z\u0130K ORTA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=0.30;
			    double b=0.50;
			    double c=0.20;
			    
				fizikKolayCoktanSecmeli(a);
				 fizikOrtaCoktanSecmeli(b);
				 fizikZorCoktanSecmeli(c);
				fizikKolayDY(a);
			    fizikOrtaDY(b);
			    fizikZorDY(c);
				 fizikKolayKlasik(a);
			     fizikOrtaKlasik(b);
			    fizikZorKlasik(c);
			}
		});
		btnNewButton_1.setBounds(771, 388, 208, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("F\u0130Z\u0130K ZOR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=0.20;
			    double b=0.30;
			    double c=0.50;
			    
				fizikKolayCoktanSecmeli(a);
				 fizikOrtaCoktanSecmeli(b);
				 fizikZorCoktanSecmeli(c);
				fizikKolayDY(a);
			    fizikOrtaDY(b);
			    fizikZorDY(c);
				 fizikKolayKlasik(a);
			     fizikOrtaKlasik(b);
			    fizikZorKlasik(c);
				
			}
		});
		btnNewButton_2.setBounds(991, 388, 197, 53);
		contentPane.add(btnNewButton_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(661, 166, 304, 25);
		contentPane.add(textField_4);
		
		JLabel lblSnavPuan = new JLabel("S\u0131nav Puan\u0131");
		lblSnavPuan.setBounds(585, 166, 69, 25);
		contentPane.add(lblSnavPuan);
		
		JButton btnNewButton_3 = new JButton("S\u0131nav Puan\u0131 Test Etme");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int total = 0;
				String deger=textField_4.getText();
				int puan=Integer.valueOf(deger);
			    for (int i = 0; i < table.getRowCount(); i++){
			    	int Amount = Integer.parseInt(table.getValueAt(i, 5)+"");
			        total += Amount;
			    }
			    
			    if(total<puan)
			    	JOptionPane.showMessageDialog(null,"Puanýnýz: "+total+" Belirlenen puandan düþüktür", "Uyarý Mesajý", -1);
			    else if(total>puan)
			    	JOptionPane.showMessageDialog(null,"Puanýnýz: "+total+" Belirlenen puandan yüksektir", "Uyarý Mesajý", -1);
			    else
			    	JOptionPane.showMessageDialog(null,"Puanýnýz: "+total+" Belirlenen puana eþittir.Sýnavýnýz uygundur.", "Uyarý Mesajý", -1);
			}
		});
		btnNewButton_3.setBounds(616, 558, 213, 53);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("K\u0130MYA KOLAY");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = 0.50;
				double b = 0.30;
				double c = 0.20;
				kimyaKolayCoktanSecmeli(a);
				kimyaOrtaCoktanSecmeli(b);
				kimyaZorCoktanSecmeli(c);
				kimyaKolayDY(a);
				kimyaOrtaDY(b);
				kimyaZorDY(c);
				kimyaKolayKlasik(a);
				kimyaOrtaKlasik(b);
				kimyaZorKlasik(c);
			}
		});
		btnNewButton_4.setBounds(585, 454, 174, 53);
		contentPane.add(btnNewButton_4);
		
		JButton btnKimyaOrta = new JButton("K\u0130MYA ORTA");
		btnKimyaOrta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 0.30;
				double b = 0.50;
				double c = 0.20;
				kimyaKolayCoktanSecmeli(a);
				kimyaOrtaCoktanSecmeli(b);
				kimyaZorCoktanSecmeli(c);
				kimyaKolayDY(a);
				kimyaOrtaDY(b);
				kimyaZorDY(c);
				kimyaKolayKlasik(a);
				kimyaOrtaKlasik(b);
				kimyaZorKlasik(c);
			}
		});
		btnKimyaOrta.setBounds(771, 454, 208, 53);
		contentPane.add(btnKimyaOrta);
		
		JButton btnKimyaZor = new JButton("K\u0130MYA ZOR");
		btnKimyaZor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 0.20;
				double b = 0.30;
				double c = 0.50;
				kimyaKolayCoktanSecmeli(a);
				kimyaOrtaCoktanSecmeli(b);
				kimyaZorCoktanSecmeli(c);
				kimyaKolayDY(a);
				kimyaOrtaDY(b);
				kimyaZorDY(c);
				kimyaKolayKlasik(a);
				kimyaOrtaKlasik(b);
				kimyaZorKlasik(c);
			}
		});
		btnKimyaZor.setBounds(991, 454, 197, 53);
		contentPane.add(btnKimyaZor);
		
		textField_5 = new JTextField();
		textField_5.setBounds(958, 34, 253, 25);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(958, 84, 253, 25);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1 = new JLabel("S\u0131nav Yeri");
		lblNewLabel_1.setBounds(854, 37, 92, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblGzetmenBilgisi = new JLabel("G\u00F6zetmen Bilgisi");
		lblGzetmenBilgisi.setBounds(854, 88, 101, 16);
		contentPane.add(lblGzetmenBilgisi);
		
		JButton btnNewButton_6 = new JButton("YAZDIR");
		btnNewButton_6.setBounds(1021, 205, 167, 53);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("TABLOYU TEM\u0130ZLEME");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.getDataVector().removeAllElements();
				model.fireTableDataChanged();
			}
		});
		btnNewButton_7.setBounds(892, 558, 213, 55);
		contentPane.add(btnNewButton_7);
		
		
		
	}
	@Override
	public void fizikKolayCoktanSecmeli(double a) {
		// TODO Auto-generated method stub
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*coktanYuzde)/100)*a);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM kolay ORDER BY RAND() LIMIT "+yuzdelik;
		
		System.out.println(yuzdelik);
		
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			
			while(rs.next()){
				
				rows[0]=rs.getString(1);
				rows[1]=rs.getString(2);
				rows[2]=rs.getString(3);
				rows[3]=rs.getString(4);
				rows[4]=rs.getString(5);
				rows[5]=rs.getInt(6);
				
			
				model.addRow(rows);
				
			}
			
		}
		catch (SQLException e1){
			e1.printStackTrace();
		}
		
	}


	@Override
	public void fizikOrtaCoktanSecmeli(double b) {
	
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*coktanYuzde)/100)*b);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM orta ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
		
			while(rs.next()){
				
				rows[0]=rs.getString(1);
				rows[1]=rs.getString(2);
				rows[2]=rs.getString(3);
				rows[3]=rs.getString(4);
				rows[4]=rs.getString(5);
				rows[5]=rs.getInt(6);
				
			
				model.addRow(rows);
				
		}
		}
	
		catch (SQLException e1){
			e1.printStackTrace();
		}
	}

	@Override
	public void fizikZorCoktanSecmeli(double c) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*coktanYuzde)/100)*c);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/fizik_coktan?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM zor ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
		
			while(rs.next()){
				
				rows[0]=rs.getString(1);
				rows[1]=rs.getString(2);
				rows[2]=rs.getString(3);
				rows[3]=rs.getString(4);
				rows[4]=rs.getString(5);
				rows[5]=rs.getInt(6);
				
			
				model.addRow(rows);
			}
		}
			
		catch (SQLException e1){
			e1.printStackTrace();
		}
	}

	@Override
	public void fizikKolayDY(double a) {
		
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*dyYuzde)/100)*a);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/fizik_dy?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM kolay ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				

				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				
				model.addRow(rows);
				
				
			}
		}
			
	
		catch (SQLException e1){
			e1.printStackTrace();
		}
		
	}

	@Override
	public void fizikOrtaDY(double b) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*dyYuzde)/100)*b);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/fizik_dy?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM orta ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				

				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				
				model.addRow(rows);
				
				
			}
		}
			
	
		catch (SQLException e1){
			e1.printStackTrace();
		}
		
	}

	@Override
	public void fizikZorDY(double c) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=((((sorusayisi*dyYuzde)/100))*c);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/fizik_dy?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM zor ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				
				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				
			
				model.addRow(rows);
				
				
				
				
			}
		}
			
	
		catch (SQLException e1){
			e1.printStackTrace();
		}
		
	}

	@Override
	public void fizikKolayKlasik(double a) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*klasikYuzde)/100)*a);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/fizik_klasik?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM kolay ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				
				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				
			
				model.addRow(rows);
				
				
				
				
			}
		}
			
	
		catch (SQLException e1){
			e1.printStackTrace();
		}
		
	}

	@Override
	public void fizikOrtaKlasik(double b) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*klasikYuzde)/100)*b);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/fizik_klasik?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM orta ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				
				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				
			
				model.addRow(rows);
				
				
				
				
			}
		}
			
	
		catch (SQLException e1){
			e1.printStackTrace();
		}
		
	}

	@Override
	public void fizikZorKlasik(double c) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*klasikYuzde)/100)*c);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/fizik_klasik?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM zor ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				
				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				
			
				model.addRow(rows);
				
				
				
				
			}
		}
			
	
		catch (SQLException e1){
			e1.printStackTrace();
		}
	
	}

	@Override
	public void kimyaKolayCoktanSecmeli(double a) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*coktanYuzde)/100)*a);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM kolay ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
		while(rs.next()){
				rows[0]=rs.getString(1);
				rows[1]=rs.getString(2);
				rows[2]=rs.getString(3);
				rows[3]=rs.getString(4);
				rows[4]=rs.getString(5);
				rows[5]=rs.getInt(6);
				model.addRow(rows);
				}}
		catch (SQLException e1){
			e1.printStackTrace();
		}}

	@Override
	public void kimyaOrtaCoktanSecmeli(double b) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*coktanYuzde)/100)*b);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM orta ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				rows[0]=rs.getString(1);
				rows[1]=rs.getString(2);
				rows[2]=rs.getString(3);
				rows[3]=rs.getString(4);
				rows[4]=rs.getString(5);
				rows[5]=rs.getInt(6);
				model.addRow(rows);
				
		}}
		catch (SQLException e1){
			e1.printStackTrace();
		}}

	@Override
	public void kimyaZorCoktanSecmeli(double c) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*coktanYuzde)/100)*c);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/kimya_coktan?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM zor ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				rows[0]=rs.getString(1);
				rows[1]=rs.getString(2);
				rows[2]=rs.getString(3);
				rows[3]=rs.getString(4);
				rows[4]=rs.getString(5);
				rows[5]=rs.getInt(6);
				model.addRow(rows);
			}}
		catch (SQLException e1){
			e1.printStackTrace();
		}}

	public void kimyaKolayDY(double a) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*dyYuzde)/100)*a);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/kimya_dy?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM kolay ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				model.addRow(rows);
			}}
		catch (SQLException e1){
			e1.printStackTrace();
		}}

	@Override
	public void kimyaOrtaDY(double b) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*dyYuzde)/100)*b);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/kimya_dy?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM orta ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				model.addRow(rows);
			}}
		catch (SQLException e1){
			e1.printStackTrace();
		}}

	@Override
	public void kimyaZorDY(double c) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=((((sorusayisi*dyYuzde)/100))*c);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/kimya_dy?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM zor ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				model.addRow(rows);
				}}
		catch (SQLException e1){
			e1.printStackTrace();
		}}

	
	@Override
	public void kimyaKolayKlasik(double a) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*klasikYuzde)/100)*a);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/kimya_klasik?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM kolay ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				model.addRow(rows);
				}}
		catch (SQLException e1){
			e1.printStackTrace();
		}}
	
	@Override
	public void kimyaOrtaKlasik(double b) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*klasikYuzde)/100)*b);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/kimya_klasik?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM orta ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				model.addRow(rows);
				}}
		catch (SQLException e1){
			e1.printStackTrace();
		}}

	public void kimyaZorKlasik(double c) {
		Baglantimiz baglanti = new Baglantimiz();
		String Ssorusayisi=textField.getText();
		String ScoktanYuzde=textField_1.getText();
		String SdyYuzde=textField_2.getText();
		String SklasikYuzde=textField_3.getText();
		int sorusayisi=Integer.valueOf(Ssorusayisi);
		int coktanYuzde=Integer.valueOf(ScoktanYuzde);
		int dyYuzde=Integer.valueOf(SdyYuzde);	
		int klasikYuzde=Integer.valueOf(SklasikYuzde);
		double x=(((sorusayisi*klasikYuzde)/100)*c);
		int yuzdelik = (int)Math.ceil(x);
		String url = "jdbc:mysql://localhost:3306/kimya_klasik?useTimezone=true&serverTimezone=UTC";
		String query="SELECT * FROM zor ORDER BY RAND() LIMIT "+yuzdelik;
		System.out.println(yuzdelik);
		ResultSet rs=baglanti.coktanlistele(query, url);
		try {
			while(rs.next()){
				rows[0]=rs.getString(1);
				rows[1]=null;
				rows[2]=null;
				rows[3]=null;
				rows[4]=null;
				rows[5]=rs.getInt(2);
				model.addRow(rows);
			}}
		catch (SQLException e1){
			e1.printStackTrace();
		}}
}
	
		
	

