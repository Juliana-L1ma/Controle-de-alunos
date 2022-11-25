package Controle;

public class CadastrarAluno {
 
	private int senha = 123;
	
	public boolean CadastroEfetivo(AcessoDeCadastro ac) {
		if (ac.senhaAcesso(this.senha)) {
			return true;
		}else {
			return false;
		}
		
	}
}
