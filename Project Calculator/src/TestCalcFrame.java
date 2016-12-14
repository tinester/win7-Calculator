import javax.swing.JFrame;
import javax.swing.*;


public class TestCalcFrame {

	public static void main(String[] args) {
		System.out.println("Testing Calculator");
        MyCalcFrame Calc = new MyCalcFrame();
        Calc.setSize(300, 400);
        Calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Calc.setTitle("my Calculator");
        Calc.setVisible(true);

	}

}
