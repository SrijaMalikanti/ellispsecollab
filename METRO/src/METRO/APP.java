package METRO;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class APP {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					APP window = new APP();
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
	public APP() {
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
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(118, 21, 241, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(47, 103, 69, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setForeground(new Color(0, 255, 0));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(47, 140, 102, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NUM TIC");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(47, 176, 89, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "HYD", "AP", "UP", "SHIMLA"}));
		cb1.setBounds(179, 101, 95, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "LAKSH", "OOTY", "DUBAI", "SPAIN"}));
		cb2.setBounds(179, 136, 95, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5"}));
		cb3.setBounds(179, 174, 95, 22);
		frame.getContentPane().add(cb3);
		
		t1 = new JTextField();
		t1.setBounds(179, 64, 95, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton b = new JButton("SUBMIT");
		b.setForeground(new Color(0, 64, 0));
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String source=(String) cb1.getSelectedItem();
				String des=(String) cb2.getSelectedItem();
				String tc=(String) cb3.getSelectedItem();
				int nt=Integer.parseInt(tc);
				if(source.equals(des))
				{
					JOptionPane.showMessageDialog(b, "check stations");
				}
				else
				{
					int bill=nt*50;
					JOptionPane.showMessageDialog(b, "NAME "+name+"\n SOURCE "+source+"\n destination "+des+"\n tickets"+nt+"\n amount "+bill);
				}
				
				
			}
		});
		b.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		b.setBounds(105, 216, 112, 23);
		frame.getContentPane().add(b);
		
		JLabel lblNewLabel_6 = new JLabel("Name");
		lblNewLabel_6.setForeground(new Color(255, 255, 128));
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_6.setBounds(47, 65, 55, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\socC.jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
