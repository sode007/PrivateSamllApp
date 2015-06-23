package com;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Mainframe extends JFrame {

	private JProgressBar bar = new JProgressBar();
	private JButton startbutton = new JButton("��ʼ");
	private JButton stoptbutton = new JButton("ֹͣ");
	private Thread update = null;
	private int value;
	private boolean updateflag = false;
	private ActionListener buttonlistener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == startbutton) {
				 System.out.println(Thread.currentThread().getName());

				updateflag = true;

				if (update != null && update.isAlive()) {
					value = 0;
				} else {
					update = new Thread(new Updatebar());
					update.start();
				}
				// ��ʼ
				 Updatebar t1 = new Updatebar();
				 Thread t = new Thread(t1);
				 t.start();
			} else if (e.getSource() == stoptbutton) {
				// ֹͣ
				updateflag = false;
				update.interrupt();
			}
		}
	};

	public Mainframe() throws HeadlessException {
		this("����");
	}

	public Mainframe(String title) throws HeadlessException {
		super(title);
		this.setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pn1 = new JPanel();
		bar.setForeground(Color.blue);
		bar.setBackground(Color.WHITE);
		bar.setStringPainted(true);
		bar.setMaximum(100);
		bar.setMinimum(0);
		bar.setValue(0);

		startbutton.addActionListener(buttonlistener);
		stoptbutton.addActionListener(buttonlistener);
		pn1.add(bar);
		pn1.add(startbutton);
		pn1.add(stoptbutton);

		this.add(pn1);

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame f = new Mainframe();
		f.setVisible(true);
		System.out.println(Thread.currentThread().getName());
	}

	private class Updatebar implements Runnable {
		public void run() {
			System.out.println(Thread.currentThread().getName());
			while (value < 100 && updateflag) {
				value += 5;
				EventQueue.invokeLater(new Runnable() {

					@Override
					public void run() {
						System.out.println(Thread.currentThread().getName());
						bar.setValue(value);
					}
				});

				try {
					System.out.println("����˯��");
					Thread.sleep(1000);
					System.out.println("�뿪˯��״̬");
				} catch (InterruptedException e1) {
					// e1.printStackTrace();
				}
			}
		}

	}
}
