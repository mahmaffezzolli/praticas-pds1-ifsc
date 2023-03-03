package questao03;

import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		
		double mf;
		
		double nota1 = Double.valueOf (JOptionPane.showInputDialog ("informe a primeira nota:"));
		double nota2 = Double.valueOf (JOptionPane.showInputDialog ("informe a segunda nota:"));
		double nota3 = Double.valueOf (JOptionPane.showInputDialog ("informe a terceira nota:"));
		
		
		mf= (nota1+nota2+nota3)/3;
		
		if (mf >= 6) {
			 JOptionPane.showMessageDialog(null, "Aluno(a) aprovado(a)!");
		} if ((mf >=4) && (mf < 6)) {
			 JOptionPane.showMessageDialog(null, "Aluno(a) em recuperação!");
		} if (mf<4)   {
			 JOptionPane.showMessageDialog(null, "Aluno(a) reprovado(a)!");
		}

	}

}
