package quetão01;

import javax.swing.JOptionPane;

public class Questao01 {

  public static void main(String[] args) {
	
	 double totalPagamento; 
	 
	 double precoLitro = Double.valueOf (JOptionPane.showInputDialog ("informe o valor do preço do litro:"));
	 Integer quantidadeLitros  = Integer.valueOf (JOptionPane.showInputDialog ("informe a quantidade de litros:"));
	  
	 totalPagamento = precoLitro*quantidadeLitros; 
	 
	 JOptionPane.showInputDialog ("total a pagar:" ,totalPagamento);
}	
}
