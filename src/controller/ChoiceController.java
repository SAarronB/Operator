package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.OperatorPerson;


public class ChoiceController
{
	private OperatorPerson[] operatorArray;
	private ImageIcon[] icon;

	public void start() {
		arrayInitialization();
	}
		
		public ChoiceController() {
			icon = new ImageIcon[3];
			
			icon[0] = new ImageIcon(getClass().getResource("/structures/view/images/ServerImg.jpg"));
			icon[1] = new ImageIcon(getClass().getResource("/structures/view/images/Swift.png"));
			icon[2] = new ImageIcon(getClass().getResource("/structures/view/images/FALSE.jpeg"));
			
			operatorArray = new OperatorPerson[3];
		}
	
	private void arrayInitialization() {
		
		JOptionPane.showMessageDialog(null, "Wehn you initialize and array of objects, /nit is fillled with a bunch of null", "Arrays", JOptionPane.INFORMATION_MESSAGE, icon[2]);
		JOptionPane.showMessageDialog(null, "If you try to use them it will crash", "Arrays", JOptionPane.INFORMATION_MESSAGE, icon[1]);
		JOptionPane.showMessageDialog(null, "But if you fill the array with values it is good", "Array", JOptionPane.INFORMATION_MESSAGE, icon[0]);
		
		for(int i = 0; i < operatorArray.length; i++) {
			if(i % 2 == 0) {
				operatorArray[i] = new OperatorPerson();
			}else {
				operatorArray[i] = new OperatorPerson(i * 30);
			}
		}
	}
	
}
