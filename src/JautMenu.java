import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JautMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int jautIndex = 0;
	private Vector<String> jautajumi = new Vector<String>();
    private Vector<Vector<String>> atbildes = new Vector<Vector<String>>();
    private Vector<Vector<String>> pareizasAtb = new Vector<Vector<String>>();
    
    private JLabel JautLabel;
    private JCheckBox atbVar1;
    private JCheckBox atbVar2;
    private JCheckBox atbVar3;
    private JCheckBox atbVar4;

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
        
		
        jautajumi.add("ac 1. jautajums");
        Vector<String> atbildes1 = new Vector<String>();
        atbildes1.add("1");
        atbildes1.add("2");
        atbildes1.add("3");
        atbildes1.add("4");
        atbildes.add(atbildes1);
        Vector<String> pareizasAtb1 = new Vector<String>();
        pareizasAtb1.add("a");
        pareizasAtb1.add("c");
        pareizasAtb.add(pareizasAtb1);

        
        jautajumi.add("bd 2. jautajums");
        Vector<String> atbildes2 = new Vector<String>();
        atbildes2.add("1");
        atbildes2.add("2");
        atbildes2.add("3");
        atbildes2.add("4");
        atbildes.add(atbildes2);
        Vector<String> pareizasAtb2 = new Vector<String>();
        pareizasAtb2.add("b");
        pareizasAtb2.add("d");
        pareizasAtb.add(pareizasAtb2);
        
        
		JLabel JautSkLabel = new JLabel("_. Jautājums");
		JautSkLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		JautSkLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		JautSkLabel.setBounds(492, 20, 120, 23);
		contentPane.add(JautSkLabel);
		
		JautLabel = new JLabel("Jautājuma teksts");
		JautLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		JautLabel.setBounds(25, 85, 425, 23);
		contentPane.add(JautLabel);
		
		atbVar1 = new JCheckBox("1. atbilžu variants");
		atbVar1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		atbVar1.setBounds(25, 140, 180, 23);
		atbVar1.setContentAreaFilled(false);
		contentPane.add(atbVar1);
		
		atbVar2 = new JCheckBox("2. atbilžu variants");
		atbVar2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		atbVar2.setBounds(25, 175, 180, 23);
		atbVar2.setContentAreaFilled(false);
		contentPane.add(atbVar2);
		
		atbVar3 = new JCheckBox("3. atbilžu variants");
		atbVar3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		atbVar3.setBounds(25, 210, 180, 23);
		atbVar3.setContentAreaFilled(false);
		contentPane.add(atbVar3);
		
		atbVar4 = new JCheckBox("4. atbilžu variants");
		atbVar4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		atbVar4.setBounds(25, 245, 180, 23);
		atbVar4.setContentAreaFilled(false);
		contentPane.add(atbVar4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(291, 126, 225, 185);
		contentPane.add(lblNewLabel);
		
		JButton btnIesniegt = new JButton("Iesniegt");
		btnIesniegt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//.......
			}
		});
		btnIesniegt.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnIesniegt.setBackground(Color.WHITE);
		btnIesniegt.setBounds(512, 349, 100, 40);
		contentPane.add(btnIesniegt);
		
		JButton notiritBox = new JButton("Notīrīt Atķeksētos");
		notiritBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atbVar1.setSelected(false);
				atbVar2.setSelected(false);
				atbVar3.setSelected(false);
				atbVar4.setSelected(false);
			}
		});
		notiritBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
		notiritBox.setBackground(Color.WHITE);
		notiritBox.setBounds(25, 349, 158, 40);
		contentPane.add(notiritBox);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 634, 411);
		Image BackImage2 = new ImageIcon(this.getClass().getResource("/resources/background2.png")).getImage();
		background.setIcon(new ImageIcon(BackImage2));
		contentPane.add(background);
    }
}
