import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class checkBox extends JFrame {
	private JTextField field;
	private JCheckBox firstBox;
	private JCheckBox secondBox;
	
	public checkBox() {
		super("JCheckBox Demo");
		setLayout(new FlowLayout());
		
		field = new JTextField("Hello Utopian, JCheckBox Demo", 19);
		field.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(field);
		
		firstBox = new JCheckBox("Bold Font");
		add(firstBox);
		
		secondBox = new JCheckBox("Italic Font");
		add(secondBox);
		
		newClass eventHandler = new newClass();
		firstBox.addItemListener(eventHandler);
		secondBox.addItemListener(eventHandler);
	}
	
	private class newClass implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			Font f = null;
			if (firstBox.isSelected() && secondBox.isSelected())
				f = new Font("Serif", Font.BOLD + Font.ITALIC, 18);
			
			else if (firstBox.isSelected())
				f = new Font("Serif", Font.BOLD, 18);
			
			else if (secondBox.isSelected())
				f = new Font("Serif", Font.ITALIC, 18);
			
			else
				f = new Font("Serif", Font.PLAIN, 18);
			
			field.setFont(f);
		}
	}
}
