package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us - CSE D1");
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sankeerth\\Desktop\\code.jpg"));
            setBackground(Color.BLACK);
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo1.png"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l2 = new JLabel("Library");
            l2.setForeground(Color.BLACK);
            l2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l2.setBounds(160, 40, 150, 55);
            contentPane.add(l2);

            JLabel l3 = new JLabel("Mangement System");
            l3.setForeground(Color.BLACK);
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(70, 90, 405, 40);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Developed By :");
            l4.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l4.setBounds(80, 198, 600, 35);
            contentPane.add(l4);
            
            JLabel l5 = new JLabel("RA1811003010232 - Thallapally Sai Sankeerth - 6379016309");
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(80, 260, 2000, 50);
            contentPane.add(l5);
            
            JLabel l6 = new JLabel("RA1811003010220 - Ashwin Sukumar - 8639279502");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l6.setBounds(80, 290, 2000, 50);
            contentPane.add(l6);
            
            JLabel l7 = new JLabel("RA1811003010217 - Kriten Sood - 8278805770");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l7.setBounds(80, 320, 2000, 50);
            contentPane.add(l7);
            
            JLabel l8 = new JLabel("RA1811003010248 - Shreyansh - 7387163078");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l8.setBounds(80, 350, 2000, 50);
            contentPane.add(l8);
            
            JLabel l9 = new JLabel("RA1811003010242 - Krithik - 7397150124");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l9.setBounds(80, 380, 2000, 50);
            contentPane.add(l9);
               
            contentPane.setBackground(Color.ORANGE);
	}
        

}
