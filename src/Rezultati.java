import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Rezultati extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rezultati frame = new Rezultati();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Rezultati() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel VirsrakstsLabel = new JLabel("Paldies _!");
		VirsrakstsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		VirsrakstsLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
		VirsrakstsLabel.setBounds(211, 11, 217, 43);
		contentPane.add(VirsrakstsLabel);
		Image BackImage = new ImageIcon(this.getClass().getResource("/resources/background3.png")).getImage();
		
		JLabel lblJus = new JLabel("Jautājumu skaits, kurus Jūs atbildējāt ar pirmo mēģinājumu:");
		lblJus.setForeground(new Color(20, 20, 20));
		lblJus.setHorizontalAlignment(SwingConstants.CENTER);
		lblJus.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblJus.setBounds(67, 65, 491, 43);
		contentPane.add(lblJus);
		
		JLabel lblJus_1 = new JLabel("_ / 10");
		lblJus_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblJus_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblJus_1.setBounds(67, 97, 491, 43);
		contentPane.add(lblJus_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(193, 144, 256, 256);
		contentPane.add(lblNewLabel);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon(BackImage));
		Background.setBounds(0, 0, 634, 411);
		contentPane.add(Background);
	}

}