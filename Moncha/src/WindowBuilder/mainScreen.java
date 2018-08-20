package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class mainScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainScreen window = new mainScreen();
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
	public mainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 728, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHp = new JLabel("HP:");
		lblHp.setBounds(10, 35, 17, 14);
		frame.getContentPane().add(lblHp);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(29, 35, 100, 14);
		frame.getContentPane().add(progressBar);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 11, 31, 14);
		frame.getContentPane().add(lblName);
		
		JButton btnNewButton = new JButton("Attack");
		btnNewButton.setBounds(298, 258, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblEnemyHealth = new JLabel("Enemy Health:");
		lblEnemyHealth.setBounds(512, 35, 70, 14);
		frame.getContentPane().add(lblEnemyHealth);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(582, 35, 100, 14);
		frame.getContentPane().add(progressBar_1);
		
		JLabel lblEName = new JLabel("E. Name:");
		lblEName.setBounds(512, 11, 46, 14);
		frame.getContentPane().add(lblEName);
		
		JRadioButton rdbtnAttack = new JRadioButton("Attack1");
		rdbtnAttack.setBounds(145, 97, 70, 23);
		frame.getContentPane().add(rdbtnAttack);
		
		JRadioButton radioButton = new JRadioButton("Attack1");
		radioButton.setBounds(145, 128, 70, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Attack1");
		radioButton_1.setBounds(145, 160, 70, 23);
		frame.getContentPane().add(radioButton_1);
	}
}
