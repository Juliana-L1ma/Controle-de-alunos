package Controle;

public class Aluno extends Cadastro implements View{

	private int senha;
	
	@Override
	public boolean senhaAcesso(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

}
