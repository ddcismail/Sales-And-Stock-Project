package tr.com.is.test;

import javax.swing.SwingUtilities;

import tr.com.is.fe.MainWindowFE;

public class Run {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new MainWindowFE();
				
			}
		});

	}

}