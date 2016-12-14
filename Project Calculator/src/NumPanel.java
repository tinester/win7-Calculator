import javax.swing.*;

public class NumPanel extends JPanel{
	JLabel num1Label, num2Label;
	JTextField num1Field, num2Field;
	public NumPanel(){
		
		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		num1Label = new JLabel("Num 1");
		num2Label = new JLabel("Num 2");
		num1Field = new JTextField(10);
		num2Field = new JTextField(10);
		
		layout.setHorizontalGroup(
			layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
					.addComponent(num1Label)
					.addComponent(num2Label))
				.addGroup(layout.createParallelGroup()
					.addComponent(num1Field)
					.addComponent(num2Field))
		);
		
		layout.setVerticalGroup(
			layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(num1Label)
					.addComponent(num1Field))
				.addGroup(layout.createParallelGroup()
					.addComponent(num2Label)
					.addComponent(num2Field))
				
		);
	}
	
	public double getNum1Field(){
		return Double.parseDouble(num1Field.getText());
	
	}
	public double getNum2Field(){
		return Double.parseDouble(num2Field.getText());
		
	}
	
	
	public boolean isNumeric(){
		try{
			double d = Double.parseDouble(num1Field.getText());
			d = Double.parseDouble(num2Field.getText());
			return true;
		}
		catch(NumberFormatException nfe){
			return false;
		}
	}
}
