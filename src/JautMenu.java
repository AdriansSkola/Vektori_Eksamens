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
				parAtb();
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
		Image BackImage2 = new ImageIcon(this.getClass().getResource("/resources/background2.png")).getImage();
		
		NepareiziLabel = new JLabel("Nepareizi! Mēģiniet vēlreiz!");
		NepareiziLabel.setForeground(new Color(255, 0, 0));
		NepareiziLabel.setHorizontalAlignment(SwingConstants.LEFT);
		NepareiziLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		NepareiziLabel.setBounds(25, 288, 243, 23);
		NepareiziLabel.setVisible(false);
		contentPane.add(NepareiziLabel);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 634, 411);
		background.setIcon(new ImageIcon(BackImage2));
		contentPane.add(background);
		
		raditJaut();
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
            	System.out.println("Pareizi ar pirmo reizi atbildētie jautājumi: " + PareiziArPirmo);
            }
        } else {
        	NepareizArPirmo.set(jautIndex, NepareizArPirmo.get(jautIndex) + 1);
        	NepareiziLabel.setVisible(true);
            //System.out.println("Nepareizi!");
        }
    }
}