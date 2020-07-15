package _03_Switch_Statement_Practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch(choice) {
		case "Sunday": 
			System.out.println("Church day!");
			break;
		case "Monday": 
			System.out.println("School day!");
			break;
		case "Tuesday": 
			System.out.println("Soccer day!");
			break;
		case "Wednesday":
			System.out.println("Math day!");
			break;
		case "Thursday":
			System.out.println("Math day!");
			break;
		case "Friday":
			System.out.println("Math day!");
			break;
		case "Saturday":
			System.out.println("Fun day!");
			break;
		default: 
			System.out.println("Something went wrong :(");
			break;
		}
	}
}
