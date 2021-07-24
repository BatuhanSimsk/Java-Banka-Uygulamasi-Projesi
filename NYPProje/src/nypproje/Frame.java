package nypproje;

import javax.swing.JOptionPane;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;


//GUI Eclipse IDE'sine ait WindowBuilder eklentisi ile oluşturuldu.

/*Müsteri Bilgilerini gösterirken bütün müsterileri göstermeye uğraştım ama tam olarak yapamadım, bu yüzden
  	pencereye o an girilen müsteri bilgilerini gösterecek şekilde düzenledim.*/


public class Frame {
	

	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 /*Kod yaptığım tasarıma göre otomatik oluşturuldu,
		  Türkçe karakterleri otomatik olarak Unicode yazdı.*/
	
		
		JButton btnNewButton = new JButton("M\u00FCsteri Ekle");  																					
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
					String adi=textField.getText();			
					Musteri.setAd(adi);
				
				
					String soyadi=textField_1.getText();
					Musteri.setSoyad(soyadi);
				
				
					String email=textField_2.getText();
					Musteri.setEmail(email);
			
					int telNo=Integer.parseInt(textField_3.getText());
					Musteri.setTelefonNumarasi(telNo);
				
				JOptionPane.showMessageDialog(frame, "Müsteri Eklendi");
				
				
				
			
			}
		});
		btnNewButton.setBounds(49, 177, 123, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(75, 37, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(75, 70, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(75, 101, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(75, 135, 86, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel = new JLabel("Soyadi:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(19, 73, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSoyadi = new JLabel("Adi:");
		lblSoyadi.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoyadi.setBounds(19, 40, 46, 14);
		frame.getContentPane().add(lblSoyadi);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mail Adresi:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(10, 105, 60, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tel No:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(19, 138, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("Adiniz Soyadiniz:");
		lblNewLabel_1.setBounds(219, 181, 96, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("\u00D6\u011Frenci No:");
		lblNewLabel_1_3.setBounds(219, 212, 96, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JButton btnNewButton_1 = new JButton("M\u00FCsteri Bilgileri");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null,"Adi:"+Musteri.getAd()+"\n"+"Soyadi: "+Musteri.getSoyad()+"\n"+"Email:"+Musteri.getEmail()+"\n"+"Tel No:"+Musteri.getTelefonNumarasi());
			}
		});
		btnNewButton_1.setBounds(49, 211, 123, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Kredi Bilgileri");
		btnNewButton_2.setBounds(280, 50, 123, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Hesap Bilgileri");
		btnNewButton_3.setBounds(280, 112, 123, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Batuhan \u015Eim\u015Fek");
		lblNewLabel_2.setBounds(322, 181, 102, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("20360859055");
		lblNewLabel_3.setBounds(325, 212, 83, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
	
		
		
		
		/*private static ArrayList<Musteri> musteriler;
		musteriler = new ArrayList<>();*/
		

	}
		
}
