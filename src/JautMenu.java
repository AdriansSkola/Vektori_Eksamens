import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class JautMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int jautIndex = 0;
	private int PareiziArPirmo = 0;
	private Vector<String> jautajumi = new Vector<String>();
    private Vector<Vector<String>> atbildes = new Vector<Vector<String>>();
    private Vector<Vector<String>> pareizasAtb = new Vector<Vector<String>>();
    private Vector<Integer> NepareizArPirmo;
    
    private JLabel JautSkLabel;
    private JLabel JautLabel;
    private JCheckBox atbVar1;
    private JCheckBox atbVar2;
    private JCheckBox atbVar3;
    private JCheckBox atbVar4;
    private JLabel NepareiziLabel;
    private JLabel background;
    private JLabel lblNewLabel;
    
    private JButton btnIesniegt;
    private JButton notiritBox;
    
    private JLabel pareizieLabel;
    private JLabel SkLabel;
    private JLabel VirsrakstsLabel;
    private JLabel Emoji;

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
		setResizable(false);
		
		Tests tests = new Tests();
		tests.Jautajumi();
		jautajumi = Tests.getJautajumi();
		atbildes = Tests.getAtbildes();
		pareizasAtb = Tests.getPareizasAtb();
		NepareizArPirmo = new Vector<Integer>(jautajumi.size());
		for (int i = 0; i < jautajumi.size(); i++) {
			NepareizArPirmo.add(0);
		}
        
		JautSkLabel = new JLabel("_. Jautājums");
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
		atbVar1.setBounds(25, 140, 320, 23);
		atbVar1.setContentAreaFilled(false);
		contentPane.add(atbVar1);
		
		atbVar2 = new JCheckBox("2. atbilžu variants");
		atbVar2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		atbVar2.setBounds(25, 175, 320, 23);
		atbVar2.setContentAreaFilled(false);
		contentPane.add(atbVar2);
		
		atbVar3 = new JCheckBox("3. atbilžu variants");
		atbVar3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		atbVar3.setBounds(25, 210, 320, 23);
		atbVar3.setContentAreaFilled(false);
		contentPane.add(atbVar3);
		
		atbVar4 = new JCheckBox("4. atbilžu variants");
		atbVar4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		atbVar4.setBounds(25, 245, 320, 23);
		atbVar4.setContentAreaFilled(false);
		contentPane.add(atbVar4);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(278, 119, 330, 185);
		contentPane.add(lblNewLabel);
		
		btnIesniegt = new JButton("Iesniegt");
		btnIesniegt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parAtb();
			}
		});
		btnIesniegt.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnIesniegt.setBackground(Color.WHITE);
		btnIesniegt.setBounds(512, 349, 100, 40);
		contentPane.add(btnIesniegt);
		
		notiritBox = new JButton("Notīrīt Atķeksētos");
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
		
		NepareiziLabel = new JLabel("Nepareizi! Mēģiniet vēlreiz!");
		NepareiziLabel.setForeground(new Color(255, 0, 0));
		NepareiziLabel.setHorizontalAlignment(SwingConstants.LEFT);
		NepareiziLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		NepareiziLabel.setBounds(25, 288, 243, 23);
		NepareiziLabel.setVisible(false);
		contentPane.add(NepareiziLabel);
		
		
		// Pārvēršu JautMenu uz Rezultati
		
		VirsrakstsLabel = new JLabel("Paldies _!");
		VirsrakstsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		VirsrakstsLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
		VirsrakstsLabel.setBounds(130, 11, 386, 43);
		VirsrakstsLabel.setVisible(false);
		contentPane.add(VirsrakstsLabel);
		
		SkLabel = new JLabel("Jautājumu skaits, kurus Jūs atbildējāt ar pirmo mēģinājumu:");
		SkLabel.setForeground(new Color(20, 20, 20));
		SkLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SkLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		SkLabel.setBounds(67, 54, 491, 43);
		SkLabel.setVisible(false);
		contentPane.add(SkLabel);
		
		pareizieLabel = new JLabel("_/ 10");
		pareizieLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pareizieLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		pareizieLabel.setBounds(67, 97, 491, 43);
		pareizieLabel.setVisible(false);
		contentPane.add(pareizieLabel);
		
		Emoji = new JLabel("");
		Emoji.setBounds(193, 144, 256, 256);
		Emoji.setVisible(false);
		contentPane.add(Emoji);
		
		background = new JLabel("");
		background.setBounds(0, 0, 634, 411);
		Image BackImage2 = new ImageIcon(this.getClass().getResource("/resources/background2.png")).getImage();
		background.setIcon(new ImageIcon(BackImage2));
		contentPane.add(background);
		
		raditJaut();
		
		
    }
	
	public void setVards(String vards) {
        VirsrakstsLabel.setText("Paldies " + vards + "!");
    }
	
	private void raditJaut() {
        if (jautIndex < jautajumi.size()) {
        	JautSkLabel.setText((jautIndex + 1) + ". Jautājums");
            JautLabel.setText(jautajumi.get(jautIndex));
            Vector<String> atbildesJaut = atbildes.get(jautIndex);
            if (atbildesJaut.size() == 4) {
                atbVar1.setText(atbildesJaut.get(0));
                atbVar2.setText(atbildesJaut.get(1));
                atbVar3.setText(atbildesJaut.get(2));
                atbVar4.setText(atbildesJaut.get(3));
            } else {
                //System.out.println("Kļūda jautājumam ar indeksu: " + jautIndex);
            }
            
        	switch (jautIndex + 1) {
        	case 4:
        		Image Jautajums4 = new ImageIcon(this.getClass().getResource("/resources/jautajums4.png")).getImage();
        		lblNewLabel.setIcon(new ImageIcon(Jautajums4));
        		break;
        	case 5:
        		Image Jautajums5 = new ImageIcon(this.getClass().getResource("/resources/jautajums5.png")).getImage();
        		lblNewLabel.setIcon(new ImageIcon(Jautajums5));
        		break;
        		
        	case 7:
        		Image Jautajums7 = new ImageIcon(this.getClass().getResource("/resources/jautajums7.png")).getImage();
        		lblNewLabel.setIcon(new ImageIcon(Jautajums7));
        		break;
        		
        	default:
                lblNewLabel.setIcon(null);
                break;
        	}
        } else {
            //System.out.println("Jautājumi ir beigušies!");
        }
    }
	
	private void parAtb() {
        Vector<String> pareizasAtbildesJaut = pareizasAtb.get(jautIndex);
        Vector<JCheckBox> CheckBox = new Vector<JCheckBox>();
        CheckBox.add(atbVar1);
        CheckBox.add(atbVar2);
        CheckBox.add(atbVar3);
        CheckBox.add(atbVar4);

        boolean pareizi = true;
        for (int i = 0; i < CheckBox.size(); i++) {
            if (CheckBox.get(i).isSelected() != pareizasAtbildesJaut.contains(CheckBox.get(i).getText())) {
                pareizi = false;
                break;
            }
        }

        if (pareizi) {
        	if(NepareizArPirmo.get(jautIndex) == 0) {
        		PareiziArPirmo++;
        	}
            //System.out.println("Pareizi!");
            jautIndex++;
            NepareiziLabel.setVisible(false);
            
            atbVar1.setSelected(false);
			atbVar2.setSelected(false);
			atbVar3.setSelected(false);
			atbVar4.setSelected(false);
			
            if (jautIndex < jautajumi.size()) {
                raditJaut();
            } else {
                //System.out.println("Jautājumi ir beigušies!");
            	//System.out.println("Pareizi ar pirmo reizi atbildētie jautājumi: " + PareiziArPirmo);
            	pareizieLabel.setText(PareiziArPirmo + " / 10");
            	
            	//JautMenu
            	JautLabel.setVisible(false);
            	atbVar1.setVisible(false);
            	atbVar2.setVisible(false);
            	atbVar3.setVisible(false);
            	atbVar4.setVisible(false);
            	JautSkLabel.setVisible(false);
            	NepareiziLabel.setVisible(false);
            	btnIesniegt.setVisible(false);
            	notiritBox.setVisible(false);
            	lblNewLabel.setIcon(null);
            	
            	// Rezultati
            	pareizieLabel.setVisible(true);
            	VirsrakstsLabel.setVisible(true);
            	SkLabel.setVisible(true);
            	Emoji.setVisible(true);
            	Image BackImage2 = new ImageIcon(this.getClass().getResource("/resources/background3.png")).getImage();
            	background.setIcon(new ImageIcon(BackImage2));
            	
            	switch (PareiziArPirmo) {
            	
            	case 1:
            	case 2:
            	case 3:
            	case 4:
            		Image bad = new ImageIcon(this.getClass().getResource("/resources/bad.png")).getImage();
            		Emoji.setIcon(new ImageIcon(bad));
            		break;
            	case 5:
            	case 6:
            	case 7:
            		Image normal = new ImageIcon(this.getClass().getResource("/resources/normal.png")).getImage();
            		Emoji.setIcon(new ImageIcon(normal));
            		break;
            	
            	case 8:
            	case 9:
            	case 10:
            		Image good = new ImageIcon(this.getClass().getResource("/resources/good.png")).getImage();
            		Emoji.setIcon(new ImageIcon(good));
            		break;
            	}
            	
            }
        } else {
        	NepareizArPirmo.set(jautIndex, NepareizArPirmo.get(jautIndex) + 1);
        	NepareiziLabel.setVisible(true);
            //System.out.println("Nepareizi!");
        }
    }
}