package questao02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		
		
		ArrayList<String> exibir = new ArrayList(); 
		
		for (int i = 0; i < 10; i++) {
			 String num =  JOptionPane.showInputDialog ("insira um número:");
			 
			 exibir.add(num);
		}
		
		 JOptionPane.showMessageDialog(null, exibir);
	}
}
