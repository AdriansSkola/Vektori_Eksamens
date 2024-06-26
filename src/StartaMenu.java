import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class StartaMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField VardaTextbox;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartaMenu frame = new StartaMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StartaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel VirsrakstsLabel = new JLabel("Tests par vektoriem");
		VirsrakstsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		VirsrakstsLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		VirsrakstsLabel.setBounds(199, 34, 251, 40);
		contentPane.add(VirsrakstsLabel);
		
		VardaTextbox = new JTextField();
		VardaTextbox.setFont(new Font("Segoe UI", Font.BOLD, 14));
		VardaTextbox.setBounds(236, 191, 164, 20);
		contentPane.add(VardaTextbox);
		VardaTextbox.setColumns(10);
		
		JLabel ErrorLabel = new JLabel("Ievadītais vārds ir pārāk īss vai garšs!");
		ErrorLabel.setForeground(new Color(255, 0, 0));
		ErrorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ErrorLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		ErrorLabel.setBounds(199, 136, 251, 23);
		ErrorLabel.setVisible(false);
		contentPane.add(ErrorLabel);
		
		JButton SaktButton = new JButton("Sākt testu");
		SaktButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String vards = VardaTextbox.getText();
				
				if(VardaTextbox.getText().length() >= 3 && VardaTextbox.getText().length() <= 16) {
					JautMenu jautMenu = new JautMenu();
					jautMenu.setVards(vards);
					jautMenu.setVisible(true); 
					StartaMenu.this.dispose();
				} else {
					ErrorLabel.setVisible(true);
					//System.out.println("Ievadītais vārds ir pārāk īss vai garšs!");
				}
			}
		});
		SaktButton.setBackground(new Color(255, 255, 255));
		SaktButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		SaktButton.setBounds(269, 224, 100, 40);
		SaktButton.setFocusPainted(false);
		contentPane.add(SaktButton);
		
		JLabel AutorsLabel = new JLabel("Adrians Šilders");
		AutorsLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		AutorsLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		AutorsLabel.setFont(new Font("Segoe UI", Font.ITALIC, 16));
		AutorsLabel.setBounds(514, 377, 110, 23);
		contentPane.add(AutorsLabel);
		
		JLabel IerakstietLabel = new JLabel("Ierakstiet savu vārdu");
		IerakstietLabel.setHorizontalAlignment(SwingConstants.CENTER);
		IerakstietLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		IerakstietLabel.setBounds(211, 158, 217, 23);
		contentPane.add(IerakstietLabel);
		Image BackImage = new ImageIcon(this.getClass().getResource("/resources/background.png")).getImage();
		
		JLabel AutorsLabel_1 = new JLabel("2024");
		AutorsLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		AutorsLabel_1.setFont(new Font("Segoe UI", Font.ITALIC, 16));
		AutorsLabel_1.setBounds(524, 353, 100, 23);
		contentPane.add(AutorsLabel_1);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon(BackImage));
		Background.setBounds(0, 0, 634, 411);
		contentPane.add(Background);
	}
}
