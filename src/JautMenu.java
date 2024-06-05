import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

public class JautMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JautMenu frame = new JautMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JautMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel JautSkLabel = new JLabel("_. Jautājums");
		JautSkLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		JautSkLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		JautSkLabel.setBounds(492, 20, 120, 23);
		contentPane.add(JautSkLabel);
		
		JLabel JautLabel = new JLabel("Jautājuma teksts");
		JautLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		JautLabel.setBounds(25, 85, 425, 23);
		contentPane.add(JautLabel);
		
		JCheckBox atbVar2 = new JCheckBox("2. atbilžu variants");
		atbVar2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		atbVar2.setBounds(25, 175, 180, 23);
		contentPane.add(atbVar2);
		
		JCheckBox atbVar3 = new JCheckBox("3. atbilžu variants");
		atbVar3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		atbVar3.setBounds(25, 210, 180, 23);
		contentPane.add(atbVar3);
		
		JCheckBox atbVar4 = new JCheckBox("4. atbilžu variants");
		atbVar4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		atbVar4.setBounds(25, 245, 180, 23);
		contentPane.add(atbVar4);
		
		JCheckBox atbVar1 = new JCheckBox("1. atbilžu variants");
		atbVar1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		atbVar1.setBounds(25, 140, 180, 23);
		contentPane.add(atbVar1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(291, 126, 225, 185);
		contentPane.add(lblNewLabel);
		
		JButton btnIesniegt = new JButton("Iesniegt");
		btnIesniegt.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnIesniegt.setBackground(Color.WHITE);
		btnIesniegt.setBounds(512, 349, 100, 40);
		contentPane.add(btnIesniegt);
		
		JButton notiritBox = new JButton("Atķeksēt visus");
		notiritBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
		notiritBox.setBackground(Color.WHITE);
		notiritBox.setBounds(25, 349, 127, 40);
		contentPane.add(notiritBox);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 634, 411);
		Image BackImage2 = new ImageIcon(this.getClass().getResource("/resources/background2.png")).getImage();
		background.setIcon(new ImageIcon(BackImage2));
		contentPane.add(background);
	}
}
