package BusinessLogic;

import javax.swing.SwingUtilities;

import GUI.*;

public class RunnerMain {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new MainFrame());
	}
}
