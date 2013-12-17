package com.dovewi.bookmgrcode.ui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class LoginForm {

	public static void main(String[] args) {
		try
		{
			JFrame.setDefaultLookAndFeelDecorated(true);
			UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
		} catch (Exception e)
		{
			System.out.println("界面风格挂了："+e.getMessage());
		}
		final String userName = "abc";
		final String passwrod = "123";
		final JFrame jFrame = new JFrame("Administrator Login");
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		jFrame.setBounds(((int)dimension.getWidth() - 200) / 2, ((int)dimension.getHeight() - 300) / 2, 200, 150);
		jFrame.setResizable(false);
		jFrame.setLayout(null);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label1 = new JLabel("UID");
		label1.setBounds(10, 10, 100, 30);
		jFrame.add(label1);

		JLabel label2 = new JLabel("KEY");
		label2.setBounds(10, 40, 100, 30);
		jFrame.add(label2);

		final JTextField text1 = new JTextField();
		text1.setBounds(50, 15, 130, 20);
		jFrame.add(text1);

		final JPasswordField text2 = new JPasswordField();
		text2.setBounds(50, 45, 130, 20);
		jFrame.add(text2);
		JButton button = new JButton("Login");
		button.setBounds(10, 75, 170, 40);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(userName.equals(text1.getText()) && passwrod.equals(String.valueOf(text2.getPassword()))) {
					JOptionPane.showMessageDialog(null, "Login Success", "Tip", JOptionPane.INFORMATION_MESSAGE);
					jFrame.setVisible(false);
					new MainForm();
				} else {
					JOptionPane.showMessageDialog(null, "Login Error", "Tip", JOptionPane.ERROR_MESSAGE);
					text1.setText("");
					text2.setText("");
				}
			}
		});
		jFrame.add(button);
		jFrame.setVisible(true);
	}

}