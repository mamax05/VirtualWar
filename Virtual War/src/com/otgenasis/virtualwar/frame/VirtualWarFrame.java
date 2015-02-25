package com.otgenasis.virtualwar.frame;

import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class VirtualWarFrame extends JFrame {

	private double width;
	private double height;
	private boolean fullScreen = false;

	public VirtualWarFrame() {
		super();

		this.setTitle("Virtual War  by O.T. Genasis");

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		width = screenSize.getWidth() * 0.5d;
		height = screenSize.getHeight() * 0.5d;

		double posX = width * 0.5d;
		double posY = height * 0.5d;

		this.setBounds((int) posX, (int) posY, (int) width, (int) height);

		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	public void setFullScreen() {

		GraphicsDevice device = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getScreenDevices()[0];

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		width = screenSize.getWidth();
		height = screenSize.getHeight();

		fullScreen = true;

		this.setBounds(0, 0, (int) width, (int) height);
		
		device.setFullScreenWindow(this);
	}

}