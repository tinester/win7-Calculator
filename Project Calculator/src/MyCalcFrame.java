import javax.swing.*;

import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Dimension;

public class MyCalcFrame extends JFrame implements ActionListener{
	
	private NumPanel panel1;
	private JPanel panel2;
	private ResultPanel panel3;
	
	private JButton addButton, subtractButton, multiplyButton, divideButton;
	private double operationOutput;
	
	public MyCalcFrame(){
		System.out.println("Creating MyCalcFrame");
		
		setLayout(new GridLayout(3,1));
		
		// Create the numPanel
		panel1 = new NumPanel();
		panel1.setPreferredSize(new Dimension(100, 100));
		add(panel1);
		
		//Create the panel2
		panel2 = new JPanel();
		GroupLayout layout = new GroupLayout(panel2);
		panel2.setLayout(layout);
		
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		addButton = new JButton("+");
		subtractButton = new JButton("-");
		multiplyButton = new JButton("*");
		divideButton = new JButton("/");
		
		// Registers buttons to ActionListener. Needs to put the buttons in the
		// in MyCalcFrame in order to register them
		addButton.addActionListener(this);
		subtractButton.addActionListener(this);
		multiplyButton.addActionListener(this);
		divideButton.addActionListener(this);
		
		// GroupLayout set up of panel2
		layout.setHorizontalGroup(
			layout.createSequentialGroup()
				.addComponent(addButton)
				.addComponent(subtractButton)
				.addComponent(multiplyButton)
				.addComponent(divideButton)
		);
		
		layout.setVerticalGroup(
			layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
					.addComponent(addButton)
					.addComponent(subtractButton)
					.addComponent(multiplyButton)
					.addComponent(divideButton))
		);
		
		panel2.setPreferredSize(new Dimension(20, 20));
		add(panel2);
		
		// Create the ResultPanel
		panel3 = new ResultPanel();
		panel3.setPreferredSize(new Dimension(20, 20));
		add(panel3);
	}
	
	// Now implement add/multiplying... etc 
	// Need two getters in NumPanel
	public void actionPerformed(ActionEvent e ){
		
		
		if(e.getSource() == addButton){
			if(panel1.isNumeric()){
				operationOutput = panel1.getNum1Field() + panel1.getNum2Field();
				panel3.setText(Double.toString(operationOutput));
			}
			else{
				panel3.setText("Invalid");
			}
		}
		else if(e.getSource() == subtractButton){
			if(panel1.isNumeric()){
				operationOutput = panel1.getNum1Field() - panel1.getNum2Field();
				panel3.setText(Double.toString(operationOutput));
			}
			else{
				panel3.setText("Invalid");
			}
		}
		else if(e.getSource() == multiplyButton){
			if(panel1.isNumeric()){
				operationOutput = panel1.getNum1Field() * panel1.getNum2Field();
				panel3.setText(Double.toString(operationOutput));
			}
			else{
				panel3.setText("Invalid");
			}
		}
		else if(e.getSource() == divideButton){
			if(panel1.isNumeric()){
				// Can't divide by zero
				if(panel1.getNum2Field() == 0){
					panel3.setText("You divided by 0");
				}
				else{
					operationOutput = panel1.getNum1Field() / panel1.getNum2Field();
					panel3.setText(Double.toString(operationOutput));
				}
			}
			else{
				panel3.setText("Invalid");
			}
		}
		else{
			System.out.println("something");
		}
	}
	
	
}
