package Controle;

import java.util.Scanner;

public class SistemaEscolarDrive {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int total = 1;
		
		Aluno [] aluno = new Aluno [total];
		
		for (int x=0; x < total; x++) {
			System.out.println("Digite 1 para Professor, 2 para Aluno ou 3 para Sair ");
			if(in.nextLine().equals("1")) {
				System.out.println("Digite 1 para cadastrar, 2 para visualizar alunos ou 3 para sair");
			}if(in.nextLine().equals("1")) {
				
			}
	   }

}
	
}