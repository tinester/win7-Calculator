import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Dimension;

public class ResultPanel extends JPanel{
	
	private JLabel resultLabel;
	private JTextField resultField;
	
	public ResultPanel(){
		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		resultLabel = new JLabel("Result");
		resultField = new JTextField(10);
		
		layout.setHorizontalGroup(
			layout.createSequentialGroup()
				.addComponent(resultLabel)
				.addComponent(resultField)
		);
		
		layout.setVerticalGroup(
			layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
					.addComponent(resultLabel)
					.addComponent(resultField))
		);
		
	}
	
	public void setText(String s){
		resultField.setText(s);
	}
}
